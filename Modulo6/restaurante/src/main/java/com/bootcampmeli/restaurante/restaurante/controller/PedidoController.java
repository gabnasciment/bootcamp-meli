package com.bootcampmeli.restaurante.restaurante.controller;

import com.bootcampmeli.restaurante.restaurante.dtos.PedidoDTO;
import com.bootcampmeli.restaurante.restaurante.entity.Mesa;
import com.bootcampmeli.restaurante.restaurante.services.PedidoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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
    public List<PedidoDTO> getPedidos(){
        return this.pedidoService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public PedidoDTO getPedido(@PathVariable long id){
        return this.pedidoService.findOne(id);
    }

    @GetMapping("/{id}/valorTotal")
    @ResponseStatus(code = HttpStatus.OK)
    public double getValorTotal(@PathVariable long id){
        return this.pedidoService.getValorTotal(id);
    }

}
