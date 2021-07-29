package com.bootcampmeli.loja.apiloja.repository;

import com.bootcampmeli.loja.apiloja.entity.Pedido;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.*;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido,Long> {
}
