package com.bootcampmeli.loja.apiloja.repository;

import com.bootcampmeli.loja.apiloja.entity.Pedido;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public class PedidoRepository {

    private List<Pedido> pedidos = new ArrayList<>();

    public PedidoRepository() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        try {
            File file = new File("src/main/resources/static/package.json");
            this.pedidos = Arrays.asList(mapper.readValue(file, Pedido[].class));
        } catch (Exception e) {
            System.err.println("O arquivo não foi encontrado\n"+e.getMessage());
        }
    }

    public List<Pedido> getPedidos(){
        return this.pedidos;
    }

    public Pedido getPedido(Long id) throws RuntimeException {
        Optional<Pedido> op = this.pedidos.stream().filter(x -> x.getId() == id).findFirst();
        if(op.isPresent()){
            return op.get();
        }
        throw new RuntimeException("Este id "+id+" Não foi achado.");
    }

    public void postPedido(Pedido pedido){
        if(pedido.getValorTotal() <  0){
            throw new RuntimeException("O pedido deve ser maior que 0.");
        }
        pedidos.add(pedido);
    }

    public Pedido putPedido(int id, Pedido pedido) throws RuntimeException {
        if (!this.pedidos.contains(id)) {
            throw new RuntimeException("O pedido não existe!");
        }
        Pedido p = this.pedidos.get(id);
        p.setProdutos(pedido.getProdutos());
        p.setValorTotal(pedido.getValorTotal());

        this.pedidos.add(p);
        return this.pedidos.get(id);
    }

    public void removePedido(long id) throws RuntimeException {
        if (!this.pedidos.contains(id)){
            throw new RuntimeException("Pedido com o "+id+" não existe!");
        }
        this.pedidos.remove(id);
    }

}
