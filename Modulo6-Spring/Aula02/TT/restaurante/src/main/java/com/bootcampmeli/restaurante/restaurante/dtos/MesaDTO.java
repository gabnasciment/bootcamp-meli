package com.bootcampmeli.restaurante.restaurante.dtos;

import com.bootcampmeli.restaurante.restaurante.entity.Mesa;

import java.util.ArrayList;
import java.util.List;

public class MesaDTO {

    private List<PedidoDTO> pedidos;
    private double valorTotalConsumido;

    public MesaDTO(){}

    public MesaDTO(List<PedidoDTO> pedidos, double valorTotalConsumido) {
        this.pedidos = pedidos;
        this.valorTotalConsumido = valorTotalConsumido;
    }

    public List<PedidoDTO> getPedidos() {
        return pedidos;
    }

    public double getValorTotalConsumido() {
        return valorTotalConsumido;
    }

    public static List<MesaDTO> convert(List<Mesa> mesas){
    List<MesaDTO> mesasDTO = new ArrayList<>();

        for(Mesa mesa: mesas){
        mesasDTO.add(new MesaDTO(PedidoDTO.convert(mesa.getPedidos()),mesa.getValorTotalConsumido()));
        }

         return mesasDTO;
    }



}
