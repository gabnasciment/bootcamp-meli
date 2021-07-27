package com.bootcampmeli.restaurante.restaurante.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn
    private Mesa mesa;

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
    private List<Prato> pratos = new ArrayList<>();

    private double valorTotal;

    public Pedido() {}

    public Pedido(Mesa mesa) {
        this.mesa = mesa;
    }

    private void addValorTotal(double valor){
        this.valorTotal = this.valorTotal + valor;
    }

    public void addPratos(Prato prato){
        this.pratos.add(prato);

        double valorTotal = prato.getPreco() * prato.getQuantidade();

        addValorTotal(valorTotal);
        this.mesa.addTotalConsumido(valorTotal);
    }

    public Long getId() {
        return id;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public List<Prato> getPratos() {
        return pratos;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
