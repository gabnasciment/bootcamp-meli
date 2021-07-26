package com.bootcampmeli.loja.apiloja.entity;


import java.util.List;

public class Cliente {

    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private List<Pedido> pedidos;
    private static Long universalId = 0L;

    public Cliente(){ }

    public Cliente(Long id, String nome, String cpf, String email, String telefone, List<Pedido> pedidos) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.pedidos = pedidos;
        this.id = universalId++;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
}


