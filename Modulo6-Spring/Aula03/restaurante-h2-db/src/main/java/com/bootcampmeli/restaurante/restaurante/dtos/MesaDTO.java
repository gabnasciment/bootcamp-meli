package com.bootcampmeli.restaurante.restaurante.dtos;

import java.util.List;

public class MesaDTO {

    private double valorTotal;
    private List<PedidoDTO> pedidos;

    public MesaDTO(double valorTotal, List<PedidoDTO> pedidos) {
        this.valorTotal = valorTotal;
        this.pedidos = pedidos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public List<PedidoDTO> getPedidos() {
        return pedidos;
    }
}
