package com.bootcampmeli.restaurante.restaurante.dtos;

import com.bootcampmeli.restaurante.restaurante.entity.Prato;

public class PratoDTO {

    private double preco;
    private String descricao;
    private int quantidade;

    public PratoDTO(){}

    public PratoDTO(double preco, String descricao, int quantidade) {
        this.preco = preco;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public static PratoDTO toDTO(Prato prato){
        return new PratoDTO(prato.getPreco(), prato.getDescricao(), prato.getQuantidade());
    }
}
