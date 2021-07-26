package com.bootcampmeli.loja.apiloja.interfaces;


import com.bootcampmeli.loja.apiloja.dtos.ClienteDTO;
import com.bootcampmeli.loja.apiloja.dtos.PedidoDTO;
import com.bootcampmeli.loja.apiloja.entity.Cliente;

import java.util.List;

public interface ClienteServiceDTO {

    List<ClienteDTO> findAll();
    ClienteDTO findOne(long id);
}
