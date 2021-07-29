package com.bootcampmeli.loja.apiloja.dtos;

import com.bootcampmeli.loja.apiloja.entity.Pedido;
import com.bootcampmeli.loja.apiloja.entity.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PedidoDTO {

    private Long id;
    private List<ProdutoDTO> produtos;
    private double valorTotal;

    public PedidoDTO() {}

    public PedidoDTO(Long id, List<ProdutoDTO> produtos, double valorTotal) {
        this.id = id;
        this.produtos = produtos;
        this.valorTotal = valorTotal;
    }

    public List<ProdutoDTO> getProdutos() {
        return this.produtos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public Long getId() {
        return id;
    }

    public static PedidoDTO convert(Pedido pedido){
        List<ProdutoDTO> produtos = pedido.getProdutos().stream().map(oi -> ProdutoDTO.toDTO(oi)).collect(Collectors.toList());
        return new PedidoDTO(pedido.getId(), produtos, pedido.getValorTotal());
    }



}
