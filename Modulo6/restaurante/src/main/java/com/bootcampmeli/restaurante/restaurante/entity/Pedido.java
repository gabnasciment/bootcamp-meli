package com.bootcampmeli.restaurante.restaurante.entity;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Long id;
    private int mesa;
    private List<Prato> pratos;
    private double valorTotal;
    private static Long universalId = 0L;

    public Pedido(){
        this.mesa = 0;
        this.pratos = new ArrayList<>();
        this.valorTotal = 0.0;
        this.id = universalId++;
    }

    public Pedido(Long id, int mesa, List<Prato> pratos, double valorTotal) {
        this.id = id;
        this.mesa = mesa;
        this.pratos = pratos;
        this.valorTotal = valorTotal;
    }

    public Long getId() {
        return id;
    }

    public int getMesa() {
        return mesa;
    }

    public List<Prato> getPratos() {
        return pratos;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
