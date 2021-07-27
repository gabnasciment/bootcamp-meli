package com.bootcampmeli.restaurante.restaurante.entity;

import javax.persistence.*;

@Entity
public class Prato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double preco;
    private String descricao;
    private int quantidade;

    @ManyToOne
    @JoinColumn
    private Pedido pedido;

    public Prato() {}

    public Prato(double preco, String descricao, int quantidade, Pedido pedido) {
        this.preco = preco;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.pedido = pedido;
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

    public Pedido getPedido() {
        return pedido;
    }
}

