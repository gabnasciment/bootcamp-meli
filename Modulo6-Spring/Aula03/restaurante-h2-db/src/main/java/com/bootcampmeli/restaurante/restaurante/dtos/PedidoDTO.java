package com.bootcampmeli.restaurante.restaurante.dtos;

import com.bootcampmeli.restaurante.restaurante.entity.Pedido;

import java.util.List;
import java.util.stream.Collectors;

public class PedidoDTO {

    private List<PratoDTO> pratos;
    private double valorTotal;

    public PedidoDTO() {}

    public PedidoDTO(List<PratoDTO> pratos, double valorTotal) {
        this.pratos = pratos;
        this.valorTotal = valorTotal;
    }

    public static PedidoDTO toDTO(Pedido pedido){
        List<PratoDTO> pratos = pedido.getPratos().stream().map(o -> PratoDTO.toDTO(o)).collect(Collectors.toList());
        return new PedidoDTO(pratos, pedido.getValorTotal());
    }

    public List<PratoDTO> getPratos() {
        return pratos;
    }

    public double getValorTotal() {
        return valorTotal;
    }


}
