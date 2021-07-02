package com.bootcampmeli.restaurante.restaurante.services;

import com.bootcampmeli.restaurante.restaurante.dtos.PedidoDTO;
import com.bootcampmeli.restaurante.restaurante.dtos.PratoDTO;
import com.bootcampmeli.restaurante.restaurante.entity.Pedido;
import com.bootcampmeli.restaurante.restaurante.repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService implements com.bootcampmeli.restaurante.restaurante.Interfaces.PedidoService {

    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    @Override
    public List<PedidoDTO> findAll() {
        List<Pedido> pedidos = this.pedidoRepository.findAll();
        List<PedidoDTO> pedidosDTO = PedidoDTO.convert(pedidos);
        return pedidosDTO;
    }

    @Override
    public PedidoDTO findOne(long id) throws RuntimeException {
        Pedido pedido = this.pedidoRepository.finOne(id);
        PedidoDTO pedidoDTO = PedidoDTO.convert(pedido);
        return pedidoDTO;
    }

    @Override
    public double getValorTotal(long id) throws RuntimeException {
        return this.pedidoRepository.getValorTotal(id);
    }

    @Override
    public PratoDTO getValor(long id) {
        PedidoDTO pedido = findOne(id);
        PratoDTO valorTotal = null;
       for(PratoDTO prato : pedido.getPratos()){
           Double valorTotalTudo = (valorTotal != null) ? (valorTotal.getPreco() * valorTotal.getQuantidade()) : .0d;
           Double caixa = prato.getPreco() * prato.getQuantidade();
           if(caixa >= 0 ){
               valorTotal =  prato;
           }
       }
        return (valorTotal != null) ? valorTotal : new PratoDTO(0.0, "", 0);
    }
}
