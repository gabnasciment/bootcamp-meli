package com.bootcampmeli.loja.apiloja.services;

import com.bootcampmeli.loja.apiloja.dtos.ClienteDTO;
import com.bootcampmeli.loja.apiloja.dtos.PedidoDTO;
import com.bootcampmeli.loja.apiloja.entity.Cliente;
import com.bootcampmeli.loja.apiloja.entity.Pedido;
import com.bootcampmeli.loja.apiloja.interfaces.ClienteRepository;
import com.bootcampmeli.loja.apiloja.interfaces.ClienteServiceDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class ClienteService implements ClienteServiceDTO {


    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public List<ClienteDTO> findAll() {
        List<Cliente> clientes = this.clienteRepository.findAll();
        List<ClienteDTO> clientesDTO = ClienteDTO.convert(clientes);
        return clientesDTO;
    }

    @Override
    public ClienteDTO findOne(long id) throws RuntimeException {
        Cliente cliente = this.clienteRepository.findOne(id);
        ClienteDTO clienteDTO = ClienteDTO.convert(cliente);
        return clienteDTO;
    }

    public List<PedidoDTO> getPedidos(long id){
        ClienteDTO cliente = findOne(id);
        List<PedidoDTO>  pedidos = cliente.getPedidos();
        return pedidos;
    }

}
