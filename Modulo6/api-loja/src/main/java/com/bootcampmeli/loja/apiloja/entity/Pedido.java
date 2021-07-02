package com.bootcampmeli.loja.apiloja.entity;

import java.util.List;

public class Pedido {

    private Long id;
    private List<Produto> produtos;
    private double valorTotal;
    private static Long universalId = 0L;

    public Pedido() {}

    public Pedido(Long id, List<Produto> produtos, double valorTotal) {
        this.id = id;
        this.produtos = produtos;
        this.valorTotal = valorTotal;
        this.id = universalId++;
    }

    public Long getId() {
        return id;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
