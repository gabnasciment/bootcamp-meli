package com.bootcampmeli.loja.apiloja.services;

import com.bootcampmeli.loja.apiloja.entity.Pedido;
import com.bootcampmeli.loja.apiloja.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    private PedidoRepository pedidoRepository;

    public List<Pedido> getTodosPedidos(){
        return this.pedidoRepository.getPedidos();
    }

    public Pedido getPedido(Long id){
        return this.pedidoRepository.getPedido(id);
    }

    public void postCliente(Pedido pedido){
        pedidoRepository.postPedido(pedido);
    }

    public Pedido putPedido(int id, Pedido pedido) throws RuntimeException {
        return this.pedidoRepository.putPedido(id, pedido);
    }

    public void removePedido (long id) throws RuntimeException {
        this.pedidoRepository.removePedido(id);
    }

}
