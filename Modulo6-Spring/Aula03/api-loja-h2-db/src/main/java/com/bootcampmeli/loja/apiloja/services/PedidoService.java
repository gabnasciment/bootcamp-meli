package com.bootcampmeli.loja.apiloja.services;

import com.bootcampmeli.loja.apiloja.dtos.PedidoDTO;
import com.bootcampmeli.loja.apiloja.entity.Pedido;
import com.bootcampmeli.loja.apiloja.exceptions.ResourceNotFoundException;
import com.bootcampmeli.loja.apiloja.repository.PedidoRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PedidoService {

    private PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public List<PedidoDTO> getPedidos(){
        List<Pedido> pedidos = this.pedidoRepository.findAll();
        return pedidos.stream().map(PedidoDTO::convert).collect(Collectors.toList());
    }

    public Pedido findByIdPedido(Long idPedido){
        return this.pedidoRepository.findById(idPedido).orElseThrow(() ->
                new ResourceNotFoundException("O pedido do id "+idPedido+" nao foi achado.")
        );
    }

    public PedidoDTO getPedido(Long id){
        Pedido pedido = findByIdPedido(id);
        return PedidoDTO.convert(pedido);
    }
}
