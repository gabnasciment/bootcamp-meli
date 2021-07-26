package com.bootcampmeli.restaurante.restaurante.repository;

import com.bootcampmeli.restaurante.restaurante.entity.Pedido;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;
import java.util.*;

@Repository
public class PedidoRepository {

    private Map<Long, Pedido> pedidosMap;
    private List<Pedido> pedidos = new ArrayList<>();
    private static Long autoIncrementId = 0L;

    public PedidoRepository() throws Exception {
        this.pedidosMap = new HashMap<>();
        ObjectMapper mapper = new ObjectMapper();
        try{
            File file = new File("src/main/resources/static/restaurante.json");

            this.pedidos = Arrays.asList(mapper.readValue(file, Pedido[].class));
        } catch (Exception ex){
            System.err.println("Não conseguiu abrir o arquivo."+ ex.getMessage());
        }
    }

    public List<Pedido> getPedidos() {
        return new ArrayList<Pedido>(pedidosMap.values());
    }

    public Pedido getPedido(Long id) throws RuntimeException {
        if (!this.pedidosMap.containsKey(id)) {
            throw new RuntimeException("O produto não existe!");
        }
        return this.pedidosMap.get(id);
    }


    public Pedido addPedido(Pedido pedido){
        this.pedidosMap.put(autoIncrementId,pedido);
        return this.pedidosMap.get(autoIncrementId++);
    }

    public Pedido putPedido(Long id, Pedido pedido) throws RuntimeException {
        if (!this.pedidosMap.containsKey(id)) {
            throw new RuntimeException("O produto não existe!");
        }

        Pedido p = this.pedidosMap.get(id);
        p.setMesa(pedido.getMesa());
        p.setPratos(pedido.getPratos());
        p.setValorTotal(pedido.getValorTotal());

        this.pedidosMap.put(id,p);
        return this.pedidosMap.get(id);
    }

    public void removePedido(Long id) throws RuntimeException{
        if(!this.pedidosMap.containsKey(id)){
            throw new RuntimeException("Pedido com "+id+" não existe!");
        }
        this.pedidosMap.remove(id);
    }

}
