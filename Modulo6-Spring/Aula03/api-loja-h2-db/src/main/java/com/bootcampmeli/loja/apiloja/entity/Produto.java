package com.bootcampmeli.loja.apiloja.entity;

import javax.persistence.*;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String desc;
    private String cor;
    private Integer quantidade;
    private double preco;

    @ManyToOne
    @JoinColumn
    private Pedido pedido;

    public Produto () {}

    public Produto(String desc, String cor, Integer quantidade, double preco, Pedido pedido) {
        this.desc = desc;
        this.cor = cor;
        this.quantidade = quantidade;
        this.preco = preco;
        this.pedido = pedido;
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

    public Pedido getPedido() {
        return pedido;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
