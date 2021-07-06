package com.bootcampmeli.loja.apiloja.controller;


import com.bootcampmeli.loja.apiloja.entity.Pedido;
import com.bootcampmeli.loja.apiloja.services.PedidoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    private PedidoService pedidoService;

    @GetMapping
    public List<Pedido> getPedidos(){
        return pedidoService.getTodosPedidos();
    }

    @GetMapping("/{id}")
    public Pedido getPedido(@PathVariable Long id){
        return this.pedidoService.getPedido(id);
    }

    @PostMapping
    public void postPedido(@RequestBody Pedido pedido){
        pedidoService.postCliente(pedido);
    }

    @PutMapping("/{id}")
    public Pedido putPedido(@PathVariable int id, @RequestBody Pedido pedido){
        Pedido p = null;
        try{
            p = this.pedidoService.putPedido(id, pedido);
        } catch (RuntimeException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
        return p;
    }

    @DeleteMapping("{id}")
    public void removePedido(@PathVariable long id){
        try{
            this.pedidoService.removePedido(id);
        } catch (RuntimeException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }
}
