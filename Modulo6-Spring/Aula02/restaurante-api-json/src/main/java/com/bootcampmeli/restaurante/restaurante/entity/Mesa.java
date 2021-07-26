package com.bootcampmeli.restaurante.restaurante.entity;

import java.util.ArrayList;
import java.util.List;

public class Mesa {

    private Long id;
    private List<Pedido> pedidos;
    private double valorTotalConsumido;

    public Mesa() {}

    public Mesa(Long id, List<Pedido> pedidos, double valorTotalConsumido) {
        this.id = id;
        this.pedidos = pedidos;
        this.valorTotalConsumido = valorTotalConsumido;
    }

    public Long getId() {
        return id;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public double getValorTotalConsumido() {
        return valorTotalConsumido;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void setValorTotalConsumido(double valorTotalConsumido) {
        this.valorTotalConsumido = valorTotalConsumido;
    }
}
