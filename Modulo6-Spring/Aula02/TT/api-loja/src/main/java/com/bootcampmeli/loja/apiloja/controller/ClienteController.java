package com.bootcampmeli.loja.apiloja.controller;

import com.bootcampmeli.loja.apiloja.dtos.ClienteDTO;
import com.bootcampmeli.loja.apiloja.dtos.PedidoDTO;
import com.bootcampmeli.loja.apiloja.entity.Cliente;
import com.bootcampmeli.loja.apiloja.services.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    public List<ClienteDTO> getClientes(){
       return this.clienteService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public ClienteDTO getCliente(@PathVariable long id){
        ClienteDTO cliente = null;
        try {
            cliente =  this.clienteService.findOne(id);
        } catch (RuntimeException ex){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, ex.getMessage());
        }
        return cliente;
    }

    @GetMapping("/pedidos/{id}")
    @ResponseStatus(HttpStatus.OK)
    public List<PedidoDTO> getPedidos(@PathVariable long id){
        List<PedidoDTO> pedidos = null;
        try{
            pedidos = clienteService.getPedidos(id);
        } catch (RuntimeException ex){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, ex.getMessage());
        }
        return pedidos;
    }


}
