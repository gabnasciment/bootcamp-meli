package com.bootcampmeli.loja.apiloja.controller;

import com.bootcampmeli.loja.apiloja.entity.Cliente;
import com.bootcampmeli.loja.apiloja.services.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
    public List<Cliente> getClientes(){
       return this.clienteService.getTodosClientes();
    }

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Cliente getCliente(@PathVariable long id){
        return this.clienteService.getCliente(id);
    }

    @PostMapping
    public void postCliente(@RequestBody Cliente cliente){
        clienteService.postCliente(cliente);
    }




}
