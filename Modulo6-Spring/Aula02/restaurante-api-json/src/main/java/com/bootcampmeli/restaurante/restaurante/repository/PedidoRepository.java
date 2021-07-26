package com.bootcampmeli.restaurante.restaurante.repository;

import com.bootcampmeli.restaurante.restaurante.entity.Pedido;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.stereotype.Repository;


import java.io.File;
import java.io.FileInputStream;
import java.util.*;

@Repository
public class PedidoRepository {

    private Map<Long, Pedido> pedidosMap;
    private List<Pedido> pedidos = new ArrayList<>();
    private static Long autoIncrementId = 0L;
    private static final String jsonPath = "src/main/resources/static/restaurante.json";


    public PedidoRepository() throws Exception {
        this.pedidosMap = new HashMap<>();
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());


        try{
            FileInputStream fileInputStream = new FileInputStream(jsonPath);
            TypeReference<List<Pedido>> typeReference = new TypeReference<>(){};

            this.pedidos = mapper.readValue(fileInputStream, typeReference);
            fileInputStream.close();
        } catch (Exception ex){
           // System.err.println("Não conseguiu abrir o arquivo."+ ex.getMessage());
            throw new RuntimeException("The file could not be opened.");
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
