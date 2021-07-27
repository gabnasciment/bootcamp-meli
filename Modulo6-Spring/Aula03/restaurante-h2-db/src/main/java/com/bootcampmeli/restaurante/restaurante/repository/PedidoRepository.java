package com.bootcampmeli.restaurante.restaurante.repository;

import com.bootcampmeli.restaurante.restaurante.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido,Long> {
}
