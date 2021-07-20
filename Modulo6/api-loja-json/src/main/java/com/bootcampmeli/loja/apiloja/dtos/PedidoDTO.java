package com.bootcampmeli.loja.apiloja.dtos;

import com.bootcampmeli.loja.apiloja.entity.Pedido;
import com.bootcampmeli.loja.apiloja.entity.Produto;

import java.util.ArrayList;
import java.util.List;

public class PedidoDTO {

    private List<ProdutoDTO> produtos;
    private double valorTotal;

    public PedidoDTO() {}

    public PedidoDTO(List<ProdutoDTO> produtos, double valorTotal) {
        this.produtos = produtos;
        this.valorTotal = valorTotal;
    }

    public List<ProdutoDTO> getProdutos() {
        return this.produtos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public static List<PedidoDTO> convert (List<Pedido> pedidos){
        List<PedidoDTO> pedidosDTO = new ArrayList<>();
        for(Pedido pedido : pedidos){
            pedidosDTO.add(new PedidoDTO(ProdutoDTO.convert(pedido.getProdutos()), pedido.getValorTotal()));
        }
        return pedidosDTO;
    }

    public static PedidoDTO convert(Pedido pedido){
        return new PedidoDTO(ProdutoDTO.convert(pedido.getProdutos()), pedido.getValorTotal());
    }



}
