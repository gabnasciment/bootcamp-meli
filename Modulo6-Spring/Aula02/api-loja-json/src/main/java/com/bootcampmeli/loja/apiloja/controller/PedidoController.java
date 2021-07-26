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

    public PedidoController(PedidoService pedidoService){
        this.pedidoService = pedidoService;
    }

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    public List<Pedido> getPedidos(){
        return this.pedidoService.getTodosPedidos();
    }

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Pedido getPedido(@PathVariable Long id){
        Pedido pedido = null;
        try{
            pedido = this.pedidoService.getPedido(id);
        } catch (RuntimeException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
        return pedido;
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Pedido postPedido(@RequestBody Pedido pedido){
        return this.pedidoService.addPedido(pedido);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public Pedido putPedido(@PathVariable Long id,@RequestBody Pedido pedido){
        Pedido p = null;
        try{
            p = this.pedidoService.putPedido(id, pedido);
        } catch (RuntimeException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
        return p;
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deletePedido(@PathVariable Long id){
        try{
            this.pedidoService.deletePedido(id);
        } catch (RuntimeException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
    }

}
