package com.bootcampmeli.loja.apiloja.controller;

import com.bootcampmeli.loja.apiloja.dtos.ProdutoDTO;
import com.bootcampmeli.loja.apiloja.dtos.UpsertProdutoDTO;
import com.bootcampmeli.loja.apiloja.services.ProdutoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public List<ProdutoDTO> getProdutos(){
        return this.produtoService.getProdutos();
    }

    @GetMapping("{idProduto}")
    public ProdutoDTO getProduto(@PathVariable Long idProduto){
        return this.produtoService.getProduto(idProduto);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProdutoDTO createProduto(@RequestBody UpsertProdutoDTO upsertProdutoDTO){
        return this.produtoService.postProduto(upsertProdutoDTO);
    }

    @PutMapping("{idProduto}")
    public ProdutoDTO updateProduto(@PathVariable Long idProduto, @RequestBody UpsertProdutoDTO upsertProdutoDTO){
        return this.produtoService.updateProduto(idProduto, upsertProdutoDTO);
    }

    @DeleteMapping("{idProduto}")
    public void deleteProduto(@PathVariable Long idProduto){
        this.produtoService.deleteProduto(idProduto);
    }
}
