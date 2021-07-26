package com.bootcampmeli.restaurante.restaurante.Interfaces;

import com.bootcampmeli.restaurante.restaurante.entity.Pedido;

import java.util.List;

public interface PedidoRepository {
    List<Pedido> findAll();
    Pedido finOne(long id);
    double getValorTotal(long id);
}
