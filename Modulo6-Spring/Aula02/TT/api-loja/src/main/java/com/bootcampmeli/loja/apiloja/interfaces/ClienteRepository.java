package com.bootcampmeli.loja.apiloja.interfaces;

import com.bootcampmeli.loja.apiloja.entity.Cliente;

import java.util.List;

public interface ClienteRepository {

    public List<Cliente> findAll();
    public Cliente findOne(long id);
}
