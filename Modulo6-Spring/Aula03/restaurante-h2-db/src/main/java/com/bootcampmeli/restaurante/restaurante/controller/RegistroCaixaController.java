package com.bootcampmeli.restaurante.restaurante.controller;

import com.bootcampmeli.restaurante.restaurante.services.CaixaRegistroService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/caixa-registro")
public class RegistroCaixaController {

    private final CaixaRegistroService caixaRegistroService;

    public RegistroCaixaController(CaixaRegistroService caixaRegistroService) {
        this.caixaRegistroService = caixaRegistroService;
    }

    @GetMapping
    public Double getRegistroValorTotal(){
        return caixaRegistroService.getValorTotal();
    }
}
