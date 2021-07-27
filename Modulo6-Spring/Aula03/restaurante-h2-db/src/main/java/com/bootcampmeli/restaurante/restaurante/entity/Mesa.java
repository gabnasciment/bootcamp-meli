package com.bootcampmeli.restaurante.restaurante.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Mesa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "mesa", cascade = CascadeType.ALL)
    private List<Pedido> pedidos = new ArrayList<>();

    private double valorTotalConsumido;

    public Mesa() {}

    public Long getId() {
        return id;
    }

    public void addPedido(Pedido pedido){
        pedidos.add(pedido);
    }

    public void addTotalConsumido(double valor){
        this.valorTotalConsumido = this.valorTotalConsumido + valor;
    }

    public void resetTotalConsumido(){
        this.valorTotalConsumido = 0;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public double getValorTotalConsumido() {
        return valorTotalConsumido;
    }
}
