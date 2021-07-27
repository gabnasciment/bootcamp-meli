package com.bootcampmeli.restaurante.restaurante.services;

import org.springframework.stereotype.Service;

@Service
public class CaixaRegistroService {

    private Double valorTotal;

    public CaixaRegistroService(){
        valorTotal = 0.0;
    }

    public void addValor(Double valorTotalMesa){
        this.valorTotal = this.valorTotal + valorTotalMesa;
    }

    public Double getValorTotal(){
        return valorTotal;
    }

}
