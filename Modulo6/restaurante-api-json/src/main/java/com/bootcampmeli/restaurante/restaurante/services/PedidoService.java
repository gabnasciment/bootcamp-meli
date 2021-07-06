package com.bootcampmeli.restaurante.restaurante.services;

import com.bootcampmeli.restaurante.restaurante.entity.Pedido;
import com.bootcampmeli.restaurante.restaurante.entity.Prato;
import com.bootcampmeli.restaurante.restaurante.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public List<Pedido> getTodosPedidos(){
        return this.pedidoRepository.getPedidos();
    }

    public Pedido getPedido(Long id) throws RuntimeException {
        return this.pedidoRepository.getPedido(id);
    }

   public Pedido addPedido(Pedido pedido){
        return this.pedidoRepository.addPedido(pedido);
   }

   public Pedido putPedido(Long id, Pedido pedido) throws RuntimeException{
        return this.pedidoRepository.putPedido(id, pedido);
   }

   public void removePedido(Long id) throws RuntimeException{
        this.pedidoRepository.removePedido(id);
   }
}
