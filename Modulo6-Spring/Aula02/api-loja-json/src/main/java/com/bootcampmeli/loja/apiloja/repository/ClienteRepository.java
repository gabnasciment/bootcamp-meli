package com.bootcampmeli.loja.apiloja.repository;

import com.bootcampmeli.loja.apiloja.entity.Cliente;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public class ClienteRepository {

   private List<Cliente> clientes = new ArrayList<>();

   public ClienteRepository() throws Exception {
       ObjectMapper mapper = new ObjectMapper();

       try {
           File file = new File("src/main/resources/static/cliente.json");

           this.clientes = Arrays.asList(mapper.readValue(file, Cliente[].class));
       } catch (Exception e) {
           System.err.println("O arquivo não foi encontrado "+e.getMessage());
       }
   }

    public List<Cliente> getClientes(){
        return this.clientes;
    }

    public Cliente getCliente(long id) throws RuntimeException {
        Optional<Cliente> op = this.clientes.stream().filter( x -> x.getId() == id).findFirst();
        if(op.isPresent()){
            return op.get();
        }
        throw new RuntimeException("Este id "+id+" Não foi achado.");
    }

    public void postCliente(Cliente cliente){
       if(cliente.getNome().length() <  2)
           throw new RuntimeException("O cliente deve ter no minimo 3 caracteres.");

       clientes.add(cliente);
    }

}
