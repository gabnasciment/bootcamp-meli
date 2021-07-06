package com.bootcampmeli.loja.apiloja.services;

import com.bootcampmeli.loja.apiloja.entity.Cliente;
import com.bootcampmeli.loja.apiloja.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> getTodosClientes(){
        return this.clienteRepository.getClientes();
    }

    public Cliente getCliente(Long id){
        return this.clienteRepository.getCliente(id);
    }

    public void postCliente(Cliente cliente){
        clienteRepository.postCliente(cliente);
    }

}
