package com.bootcampmeli.restaurante.restaurante.entity;

import java.util.ArrayList;
import java.util.List;

public class Mesa {

    private Long id;
    private List<Pedido> pedidos;
    private double valorTotalConsumido;
    private static Long universalId= 0L;

    public Mesa(){
        this.valorTotalConsumido = 0.0;
        this.pedidos = new ArrayList<>();
        this.id=universalId++;
    }

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
}
