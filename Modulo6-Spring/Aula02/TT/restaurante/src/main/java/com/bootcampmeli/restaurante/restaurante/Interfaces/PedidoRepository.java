package com.bootcampmeli.restaurante.restaurante.Interfaces;

import com.bootcampmeli.restaurante.restaurante.entity.Pedido;

import java.util.List;

public interface PedidoRepository {

    public List<Pedido> findAll();
    public Pedido finOne(long id);
    public double getValorTotal(long id);
}
