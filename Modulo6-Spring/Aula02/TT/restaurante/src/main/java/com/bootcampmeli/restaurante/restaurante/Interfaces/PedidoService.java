package com.bootcampmeli.restaurante.restaurante.Interfaces;

import com.bootcampmeli.restaurante.restaurante.dtos.PedidoDTO;
import com.bootcampmeli.restaurante.restaurante.dtos.PratoDTO;

import java.util.List;

public interface PedidoService {

    List<PedidoDTO> findAll();
    PedidoDTO findOne(long id);
    double getValorTotal(long id);
    PratoDTO getValor(long id);
}
