package com.bootcampmeli.loja.apiloja.dtos;

import com.bootcampmeli.loja.apiloja.entity.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDTO {

    private String desc;
    private String cor;
    private Integer quantidade;
    private double preco;

    public ProdutoDTO () {}

    public ProdutoDTO(String desc, String cor, Integer quantidade, double preco) {
        this.desc = desc;
        this.cor = cor;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getDesc() {
        return desc;
    }

    public String getCor() {
        return cor;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public static List<ProdutoDTO> convert (List<Produto> produtos){
        List<ProdutoDTO> produtosDTO = new ArrayList<>();

        for(Produto produto : produtos){
            produtosDTO.add(new ProdutoDTO(produto.getDesc(), produto.getCor(), produto.getQuantidade(),
                    produto.getPreco()));
        }
        return produtosDTO;
    }

}
