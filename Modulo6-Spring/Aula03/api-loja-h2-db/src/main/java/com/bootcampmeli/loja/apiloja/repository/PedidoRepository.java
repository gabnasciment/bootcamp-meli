package com.bootcampmeli.loja.apiloja.repository;

import com.bootcampmeli.loja.apiloja.entity.Pedido;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.*;

@Repository
public class PedidoRepository {

    private List<Pedido> pedidos = new ArrayList<>();
    private Map<Long, Pedido> pedidosMap;
    private static Long autoIncrementID = 0L;

    public PedidoRepository() throws Exception {
        this.pedidosMap = new HashMap<>();
        ObjectMapper mapper = new ObjectMapper();
        try {
            File file = new File("src/main/resources/static/package.json");
            this.pedidos = Arrays.asList(mapper.readValue(file, Pedido[].class));
        } catch (Exception e) {
            System.err.println("O arquivo não foi encontrado\n"+e.getMessage());
        }
    }

    public List<Pedido> getPedidos(){
        return new ArrayList<Pedido>(pedidosMap.values());
    }

    public Pedido getPedido(Long id) throws RuntimeException {
      if (!this.pedidosMap.containsKey(id)) {
          throw new RuntimeException("O pedido não existe");
      }
      return this.pedidosMap.get(id);
    }

    public Pedido addPedido(Pedido pedido){
        this.pedidosMap.put(autoIncrementID, pedido);
        return this.pedidosMap.get(autoIncrementID++);
    }

    public Pedido putPedido(Long id, Pedido pedido) throws RuntimeException{
        if(!this.pedidosMap.containsKey(id)){
            throw new RuntimeException("O pedido não existe.");
        }

        Pedido p = this.pedidosMap.get(id);
        p.setProdutos(pedido.getProdutos());
        p.setValorTotal(pedido.getValorTotal());

        this.pedidosMap.put(id, p);
        return this.pedidosMap.get(id);
    }

    public void removePedido(Long id) throws RuntimeException{
        if(!this.pedidosMap.containsKey(id)){
            throw new RuntimeException("Pedido com o "+id+" não existe");
        }
        this.pedidosMap.remove(id);
    }


}
