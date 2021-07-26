package com.bootcampmeli.restaurante.restaurante.entity;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Long id;
    private Integer mesa;
    private List<Prato> pratos;
    private double valorTotal;

    public Pedido() {}

    public Pedido(Long id, Integer mesa, List<Prato> pratos, double valorTotal) {
        this.id = id;
        this.mesa = mesa;
        this.pratos = pratos;
        this.valorTotal = valorTotal;
    }

    public Long getId() {
        return id;
    }

    public Integer getMesa() {
        return mesa;
    }

    public List<Prato> getPratos() {
        return pratos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMesa(Integer mesa) {
        this.mesa = mesa;
    }

    public void setPratos(List<Prato> pratos) {
        this.pratos = pratos;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
