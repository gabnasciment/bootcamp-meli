package com.bootcampmeli.restaurante.restaurante.repository;

import com.bootcampmeli.restaurante.restaurante.entity.Prato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PratoRepository extends JpaRepository<Prato,Long> {
}
