package com.br.numero.romano.numeroRomano.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.br.numero.romano.numeroRomano.services.NumeroRomanoService;

@RestController
public class NumeroRomanoController {

    private NumeroRomanoService numeroRomanoService;

    NumeroRomanoController(NumeroRomanoService numeroRomanoService){
        this.numeroRomanoService = numeroRomanoService;
    }

    @GetMapping("{decimalNumber}")
    public String getRomanNumber(@PathVariable int decimalNumber){
        if(decimalNumber > 0 && decimalNumber < 5000){
            return numeroRomanoService.convertDecimalNumberToRoman(decimalNumber);
        }
        else{
            return "O número tem que ser de 1 a 4999";
        }
    }

}
