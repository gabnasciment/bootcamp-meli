package com.bootcampmeli.restaurante.restaurante.dtos;

import com.bootcampmeli.restaurante.restaurante.entity.Pedido;

import java.util.ArrayList;
import java.util.List;

public class PedidoDTO {

    private int mesa;
    private List<PratoDTO> pratos;

    public PedidoDTO(){}

    public PedidoDTO(int mesa, List<PratoDTO> pratos, double valorTotal) {
        this.mesa = mesa;
        this.pratos = pratos;
    }

    public int getMesa() {
        return mesa;
    }

    public List<PratoDTO> getPratos() {
        return pratos;
    }

    public static List<PedidoDTO> convert(List<Pedido> pedidos) {
        List<PedidoDTO> pedidosDTO = new ArrayList<>();

        for (Pedido pedido : pedidos) {
            pedidosDTO.add(new PedidoDTO(pedido.getMesa(), PratoDTO.convert(pedido.getPratos()), pedido.getValorTotal()));
        }
        return pedidosDTO;
    }

    public static PedidoDTO convert(Pedido pedido){
        return new PedidoDTO(pedido.getMesa(), PratoDTO.convert(pedido.getPratos()), pedido.getValorTotal());
    }



}
