package com.bootcampmeli.loja.apiloja.repository;


import com.bootcampmeli.loja.apiloja.entity.Cliente;
import com.bootcampmeli.loja.apiloja.entity.Pedido;
import com.bootcampmeli.loja.apiloja.entity.Produto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ClienteRepository  implements com.bootcampmeli.loja.apiloja.interfaces.ClienteRepository {

   private List<Cliente> clientes = new ArrayList<>();

   public ClienteRepository(){
       List<Produto> produtos = List.of(
               new Produto(1l,"descrição prod", "azul", 2, 200),
               new Produto(2l,"descrição prod2", "vermelho", 4, 400),
               new Produto(3l,"descrição prod3", "amarelo", 3, 150)
       );

       List<Pedido> pedidos = List.of(
               new Pedido(1l, produtos,2450)
       );

       this.clientes.add( new Cliente(1l, "Gabriel", "343425782",
               "biel@gmail.com", "11 984658364", pedidos));
   }

    @Override
    public List<Cliente> findAll() {
        return this.getClientes();
    }

    @Override
    public Cliente findOne(long id) throws RuntimeException {
        Optional<Cliente> op = this.clientes.stream().filter( x -> x.getId() == id).findFirst();
        if(op.isPresent()){
            return op.get();
        }
        throw new RuntimeException("Este id "+id+" Não foi achado.");
    }

    public List<Cliente> getClientes(){
       return this.clientes;
    }
}
