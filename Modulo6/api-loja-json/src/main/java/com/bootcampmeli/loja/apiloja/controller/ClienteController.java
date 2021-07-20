package com.bootcampmeli.loja.apiloja.controller;

import com.bootcampmeli.loja.apiloja.dtos.ClienteDTO;
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
       return this.clienteService.getTodosClientes();
    }

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public ClienteDTO getCliente(@PathVariable long id){
        try {
            return this.clienteService.getCliente(id);
        } catch (RuntimeException ex){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, ex.getMessage());
        }

    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void postCliente(@RequestBody Cliente cliente){
        clienteService.postCliente(cliente);
    }




}
