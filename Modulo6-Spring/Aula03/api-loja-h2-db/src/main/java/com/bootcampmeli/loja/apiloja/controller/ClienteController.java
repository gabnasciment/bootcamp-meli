package com.bootcampmeli.loja.apiloja.controller;

import com.bootcampmeli.loja.apiloja.dtos.ClienteDTO;
import com.bootcampmeli.loja.apiloja.entity.Cliente;
import com.bootcampmeli.loja.apiloja.services.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public List<ClienteDTO> getClientes(){
        return this.clienteService.getClientes();
    }

    @GetMapping("{idCliente}")
    public ClienteDTO getCliente(@PathVariable Long idCliente){
        return this.clienteService.getCliente(idCliente);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClienteDTO postCliente(@RequestBody Cliente cliente){
        this.clienteService.postCliente(cliente);
        return ClienteDTO.convert(cliente);
    }
}
