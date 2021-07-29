package com.bootcampmeli.loja.apiloja.repository;

import com.bootcampmeli.loja.apiloja.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
