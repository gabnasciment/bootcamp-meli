package com.bootcampmeli.loja.apiloja.dtos;

public class UpsertProdutoDTO {

    private String desc;
    private String cor;
    private Integer quantidade;
    private double preco;
    private Long idPedido;

    public UpsertProdutoDTO() {
    }

    public UpsertProdutoDTO(
            String desc,
            String cor,
            Integer quantidade,
            double preco,
            Long idpedido) {
        this.desc = desc;
        this.cor = cor;
        this.quantidade = quantidade;
        this.preco = preco;
        idPedido = idpedido;
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

    public Long getIdPedido() {
        return idPedido;
    }
}
