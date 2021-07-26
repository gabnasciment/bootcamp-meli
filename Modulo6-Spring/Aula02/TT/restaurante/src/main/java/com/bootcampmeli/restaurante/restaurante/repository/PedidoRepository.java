package com.bootcampmeli.restaurante.restaurante.repository;

import com.bootcampmeli.restaurante.restaurante.entity.Pedido;
import com.bootcampmeli.restaurante.restaurante.entity.Prato;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class PedidoRepository implements com.bootcampmeli.restaurante.restaurante.Interfaces.PedidoRepository {

    private List<Pedido> pedidos = new ArrayList<>();

    public PedidoRepository(){
        List<Prato> pratos1 = List.of(
                new Prato(1L,20, "Strognoff de frango", 4),
                new Prato(2L,40, "Strognoff de carne", 2),
                new Prato(3L,30, "Prato americano", 3)
        );

        List<Prato> pratos2 = List.of(
                new Prato(4L,10, "Carne moida", 2),
                new Prato(5L,38, "Bife de frango", 3),
                new Prato(6L,35, "Bife com batata frita", 4)
        );

        this.pedidos.add(new Pedido(1L,1,pratos1,1));
        this.pedidos.add(new Pedido(2L,2,pratos2,1));
    }


    @Override
    public List<Pedido> findAll() {
        return this.getPedidos();
    }

    @Override
    public Pedido finOne(long id) throws RuntimeException {
        Optional<Pedido> op = this.pedidos.stream().filter( x -> x.getId() == id).findFirst();
        if(op.isPresent()){
            return op.get();
        }
        throw new RuntimeException("O id "+ id + " não foi encontrado");
    }

    @Override
    public double getValorTotal(long id) {
        Pedido pedido = finOne(id);

        double valorTotal = 0;
        for (Prato prato : pedido.getPratos()){
            valorTotal = prato.getPreco() * prato.getQuantidade();
        }
        return valorTotal;
    }

    public List<Pedido> getPedidos(){
        return this.pedidos;
    }



}
