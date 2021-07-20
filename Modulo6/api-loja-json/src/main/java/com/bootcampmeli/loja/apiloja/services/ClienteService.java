package com.bootcampmeli.loja.apiloja.services;

import com.bootcampmeli.loja.apiloja.dtos.ClienteDTO;
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

    public List<ClienteDTO> getTodosClientes(){
        List<Cliente> clientes = this.clienteRepository.getClientes();
        List<ClienteDTO> clientesDTO = ClienteDTO.convert(clientes);
        return clientesDTO;
    }

    public ClienteDTO getCliente(Long id){
        Cliente cliente = this.clienteRepository.getCliente(id);
        ClienteDTO clienteDTO = ClienteDTO.convert(cliente);
        return clienteDTO;
    }

    public void postCliente(Cliente cliente){
       clienteRepository.postCliente(cliente);
    }

}
