package com.bootcampmeli.loja.apiloja.entity;

public class Produto {

    private Long id;
    private String desc;
    private String cor;
    private Integer quantidade;
    private double preco;
    private static Long universalId = 0L;

    public Produto () {}

    public Produto(Long id, String desc, String cor, Integer quantidade, double preco) {
        this.id = id;
        this.desc = desc;
        this.cor = cor;
        this.quantidade = quantidade;
        this.preco = preco;
        this.id = universalId++;
    }

    public Long getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public String getCor() {
        return cor;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }
}
