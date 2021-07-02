package com.bootcampmeli.restaurante.restaurante.Interfaces;

import com.bootcampmeli.restaurante.restaurante.dtos.PedidoDTO;
import com.bootcampmeli.restaurante.restaurante.dtos.PratoDTO;

import java.util.List;

public interface PedidoService {

    public List<PedidoDTO> findAll();
    public PedidoDTO findOne(long id);
    public double getValorTotal(long id);
    public PratoDTO getValor(long id);
}
