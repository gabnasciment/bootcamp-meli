package com.bootcampmeli.restaurante.restaurante.services;

import com.bootcampmeli.restaurante.restaurante.dtos.PedidoDTO;
import com.bootcampmeli.restaurante.restaurante.dtos.PratoDTO;
import com.bootcampmeli.restaurante.restaurante.entity.Pedido;
import com.bootcampmeli.restaurante.restaurante.repository.PedidoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

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
        Pedido pedido = null;
        try{
            pedido = this.pedidoRepository.finOne(id);
        } catch (RuntimeException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
        PedidoDTO pedidoDTO = PedidoDTO.convert(pedido);
        return pedidoDTO;
    }

    @Override
    public double getValorTotal(long id) throws RuntimeException {
        double valorTotal = 0.0;
        try{
            valorTotal = this.pedidoRepository.getValorTotal(id);
        } catch (RuntimeException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
        }
        return valorTotal;
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
