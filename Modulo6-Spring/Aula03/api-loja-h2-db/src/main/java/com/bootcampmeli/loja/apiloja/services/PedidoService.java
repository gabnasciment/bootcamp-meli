package com.bootcampmeli.loja.apiloja.services;

import com.bootcampmeli.loja.apiloja.entity.Pedido;
import com.bootcampmeli.loja.apiloja.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    private PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public List<Pedido> getTodosPedidos(){
        return this.pedidoRepository.getPedidos();
    }

    public Pedido getPedido(Long id) throws RuntimeException{
        return this.pedidoRepository.getPedido(id);
    }

    public Pedido addPedido(Pedido pedido){
        return this.pedidoRepository.addPedido(pedido);
    }

    public Pedido putPedido(Long id, Pedido pedido) throws RuntimeException{
        return this.pedidoRepository.putPedido(id,pedido);
    }

    public void deletePedido(Long id) throws RuntimeException{
        this.pedidoRepository.removePedido(id);
    }

}
