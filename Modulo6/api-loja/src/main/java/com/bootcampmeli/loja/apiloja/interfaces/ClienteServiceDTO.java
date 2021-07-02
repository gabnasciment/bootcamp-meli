package com.bootcampmeli.loja.apiloja.interfaces;


import com.bootcampmeli.loja.apiloja.dtos.ClienteDTO;
import com.bootcampmeli.loja.apiloja.entity.Cliente;

import java.util.List;

public interface ClienteServiceDTO {

    public List<ClienteDTO> findAll();
    public ClienteDTO findOne(long id);
}
