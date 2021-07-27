package com.bootcampmeli.restaurante.restaurante.services;

import com.bootcampmeli.restaurante.restaurante.dtos.MesaDTO;
import com.bootcampmeli.restaurante.restaurante.dtos.PedidoDTO;
import com.bootcampmeli.restaurante.restaurante.entity.Mesa;
import com.bootcampmeli.restaurante.restaurante.repository.MesaRepository;
import com.bootcampmeli.restaurante.restaurante.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MesaService {

    private final MesaRepository mesaRepository;
    private final PedidoRepository pedidoRepository;
    private final CaixaRegistroService caixaRegistroService;

    public MesaService(MesaRepository mesaRepository, PedidoRepository pedidoRepository, CaixaRegistroService caixaRegistroService) {
        this.mesaRepository = mesaRepository;
        this.pedidoRepository = pedidoRepository;
        this.caixaRegistroService = caixaRegistroService;
    }

    public Mesa getById(Long id){
        Optional<Mesa> mesa = mesaRepository.findById(id);
        if(!mesa.isPresent()){
            throw new RuntimeException("A mesa com o id "+id+" não existe.");
        }
        return mesa.get();
    }

    public MesaDTO getMesa(Long id){
        Mesa mesa = getById(id);

        List<PedidoDTO> pedidos = mesa.getPedidos().stream().map(o -> PedidoDTO.toDTO(o)).collect(Collectors.toList());

        return new MesaDTO(mesa.getValorTotalConsumido(), pedidos);
    }

    public void closeMesa(Long id){
        Mesa mesa = getById(id);

        Double valorTotalMesa = mesa.getValorTotalConsumido();
        caixaRegistroService.addValor(valorTotalMesa);

        mesa.resetTotalConsumido();
        mesa.getPedidos().clear();

        mesaRepository.save(mesa);
    }
}
