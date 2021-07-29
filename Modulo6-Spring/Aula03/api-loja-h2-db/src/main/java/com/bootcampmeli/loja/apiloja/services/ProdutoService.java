package com.bootcampmeli.loja.apiloja.services;

import com.bootcampmeli.loja.apiloja.dtos.ProdutoDTO;
import com.bootcampmeli.loja.apiloja.dtos.UpsertProdutoDTO;
import com.bootcampmeli.loja.apiloja.entity.Pedido;
import com.bootcampmeli.loja.apiloja.entity.Produto;
import com.bootcampmeli.loja.apiloja.exceptions.ResourceNotFoundException;
import com.bootcampmeli.loja.apiloja.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProdutoService {

    private ProdutoRepository produtoRepository;
    private PedidoService pedidoService;

    public ProdutoService(ProdutoRepository produtoRepository, PedidoService pedidoService){
        this.produtoRepository = produtoRepository;
        this.pedidoService = pedidoService;
    }

    public List<ProdutoDTO> getProdutos(){
        List<Produto> produtos = this.produtoRepository.findAll();
        return produtos.stream().map(ProdutoDTO::toDTO).collect(Collectors.toList());
    }

    public Produto findByIdProduto(Long idProduto){
        return this.produtoRepository.findById(idProduto).orElseThrow(() ->
                new ResourceNotFoundException("O produto com id "+idProduto+" nao foi achado.")
        );
    }

    public ProdutoDTO getProduto(Long idProduto){
        Produto produto = findByIdProduto(idProduto);
        return ProdutoDTO.toDTO(produto);
    }

    public ProdutoDTO postProduto(UpsertProdutoDTO produtoDTO){
        Long idPedido = produtoDTO.getIdPedido();
        Pedido pedido  = this.pedidoService.findByIdPedido(idPedido);

        Produto produto = new Produto(
                produtoDTO.getDesc(),
                produtoDTO.getCor(),
                produtoDTO.getQuantidade(),
                produtoDTO.getPreco(),
                pedido
                );

        Produto savedProduto = this.produtoRepository.save(produto);
        return ProdutoDTO.toDTO(savedProduto);
    }

    public ProdutoDTO updateProduto(Long idProduto, UpsertProdutoDTO upsertProdutoDTO){
        Produto produto = findByIdProduto(idProduto);

        Long pedidoId = upsertProdutoDTO.getIdPedido();
        Pedido pedido = this.pedidoService.findByIdPedido(pedidoId);

        produto.setCor(upsertProdutoDTO.getCor());
        produto.setDesc(upsertProdutoDTO.getDesc());
        produto.setPreco(upsertProdutoDTO.getPreco());
        produto.setPedido(pedido);

        Produto updatedProduto = this.produtoRepository.save(produto);

        return ProdutoDTO.toDTO(updatedProduto);
    }

    public void deleteProduto(Long idPedido){
        this.findByIdProduto(idPedido);
        this.produtoRepository.deleteById(idPedido);
    }
}
