package com.bootcampmeli.loja.apiloja.services;

import com.bootcampmeli.loja.apiloja.dtos.ClienteDTO;
import com.bootcampmeli.loja.apiloja.entity.Cliente;
import com.bootcampmeli.loja.apiloja.exceptions.ResourceNotFoundException;
import com.bootcampmeli.loja.apiloja.repository.ClienteRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<ClienteDTO> getClientes(){
        List<Cliente> clientes = clienteRepository.findAll();
        return clientes.stream().map(ClienteDTO::convert).collect(Collectors.toList());
    }

    public Cliente finByIdCliente(Long idCliente){
        return this.clienteRepository.findById(idCliente).orElseThrow(() ->
                new ResourceNotFoundException("Cliente do id "+idCliente+" nao foi encontrado.")
        );
    }

    public ClienteDTO getCliente(Long idCliente){
        Cliente cleinte = finByIdCliente(idCliente);
        return ClienteDTO.convert(cleinte);
    }

    public ClienteDTO postCliente(Cliente cliente){
        clienteRepository.save(cliente);
        return ClienteDTO.convert(cliente);
    }

}
