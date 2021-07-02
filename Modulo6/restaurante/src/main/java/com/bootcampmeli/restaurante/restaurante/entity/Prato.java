package com.bootcampmeli.restaurante.restaurante.entity;

public class Prato {

    private Long id;
    private double preco;
    private String descricao;
    private int quantidade;
    private static Long univelsalId= 0L;

    public Prato(){
        this.descricao = "";
        this.preco = 0.0;
        this.quantidade = 0;
        this.id = univelsalId++;
    }

    public Prato(Long id, double preco, String descricao, int quantidade) {
        this.id = id;
        this.preco = preco;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
