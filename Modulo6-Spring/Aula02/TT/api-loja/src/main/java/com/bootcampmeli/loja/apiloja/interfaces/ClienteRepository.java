package com.bootcampmeli.loja.apiloja.interfaces;

import com.bootcampmeli.loja.apiloja.dtos.PedidoDTO;
import com.bootcampmeli.loja.apiloja.entity.Cliente;
import com.bootcampmeli.loja.apiloja.entity.Pedido;

import java.util.List;

public interface ClienteRepository {

    List<Cliente> findAll();
    Cliente findOne(long id);

}
