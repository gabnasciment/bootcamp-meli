package com.bootcampmeli.loja.apiloja.services;

import com.bootcampmeli.loja.apiloja.entity.Cliente;
import com.bootcampmeli.loja.apiloja.entity.Pedido;
import com.bootcampmeli.loja.apiloja.entity.Produto;
import com.bootcampmeli.loja.apiloja.repository.ClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DBService {

    private ClienteRepository clienteRepository;

    public DBService(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    public void instantiateDB(){
        Cliente c1 = new Cliente("gabriel", "645362676", "biel@gmail.com", "5463566256");
        Cliente c2 = new Cliente("izabella", "36265676", "bella@gmail.com", "6624532556");

        Pedido p1 = new Pedido(c1);
        Pedido p2 = new Pedido(c1);
        Pedido p3 = new Pedido(c2);

        c1.addPedido(p1);
        c1.addPedido(p2);
        c2.addPedido(p3);

        Produto pr1 = new Produto("Placa de video", "preto", 2, 3500, p1);
        Produto pr2 = new Produto("Processador", "preto", 3, 1700, p1);

        Produto pr3 = new Produto("HD", "preto", 4, 300, p2);
        Produto pr4 = new Produto("Memoria ram 8 GB", "preto", 4, 400, p2);

        Produto pr5 = new Produto("Gabinete", "branco", 5, 250, p3);
        Produto pr6 = new Produto("Teclado", "preto", 6, 200, p3);

        p1.addProduto(pr1);
        p1.addProduto(pr2);
        p2.addProduto(pr3);
        p2.addProduto(pr4);
        p3.addProduto(pr5);
        p3.addProduto(pr6);

        clienteRepository.saveAll(List.of(c1,c2));
    }
}
