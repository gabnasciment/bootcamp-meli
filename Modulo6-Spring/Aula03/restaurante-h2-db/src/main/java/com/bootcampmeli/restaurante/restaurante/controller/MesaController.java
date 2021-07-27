package com.bootcampmeli.restaurante.restaurante.controller;

import com.bootcampmeli.restaurante.restaurante.dtos.MesaDTO;
import com.bootcampmeli.restaurante.restaurante.services.MesaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/mesas")
public class MesaController {

    private final MesaService mesaService;

    public MesaController(MesaService mesaService) {
        this.mesaService = mesaService;
    }

    @GetMapping("{id}")
    public MesaDTO getMesa(@PathVariable Long id){
        MesaDTO mesaDTO = null;
        try{
            mesaDTO = mesaService.getMesa(id);
        } catch (RuntimeException ex){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }
        return mesaDTO;
    }

    @GetMapping("/close/{id}")
    public String closeMesa(@PathVariable Long id){
        try{
            mesaService.closeMesa(id);
        } catch (RuntimeException ex){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }
        return "A mesa "+id+" foi fechada com sucesso.";
    }
}
