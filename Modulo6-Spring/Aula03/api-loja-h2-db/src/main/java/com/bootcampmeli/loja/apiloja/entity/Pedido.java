package com.bootcampmeli.loja.apiloja.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToMany(mappedBy = "pedido",cascade = CascadeType.ALL)
    private List<Produto> produtos = new ArrayList<>();

    private double valorTotal;

    @ManyToOne
    @JoinColumn
    private Cliente cliente;

    public Pedido(){}

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.valorTotal = 0;
    }

    public void addProduto(Produto produto){
        this.produtos.add(produto);
        double valorTotal = produto.getPreco() * produto.getQuantidade();
        this.valorTotal += valorTotal;
    }

    public long getId() {
        return id;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
