package com.bootcampmeli.restaurante.restaurante.services;

import com.bootcampmeli.restaurante.restaurante.entity.Mesa;
import com.bootcampmeli.restaurante.restaurante.entity.Pedido;
import com.bootcampmeli.restaurante.restaurante.entity.Prato;
import com.bootcampmeli.restaurante.restaurante.repository.MesaRepository;
import com.bootcampmeli.restaurante.restaurante.repository.PedidoRepository;
import com.bootcampmeli.restaurante.restaurante.repository.PratoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DBService {

    private final PedidoRepository pedidoRepository;
    private final MesaRepository mesaRepository;
    private final PratoRepository pratoRepository;

    public DBService(PedidoRepository pedidoRepository, MesaRepository mesaRepository, PratoRepository pratoRepository) {
        this.pedidoRepository = pedidoRepository;
        this.mesaRepository = mesaRepository;
        this.pratoRepository = pratoRepository;
    }

    public void instantiateDB(){
        Mesa m1 = new Mesa();
        Mesa m2 = new Mesa();

        Pedido p1 = new Pedido(m1);
        Pedido p2 = new Pedido(m1);
        Pedido p3 = new Pedido(m2);

        m1.addPedido(p1);
        m1.addPedido(p2);
        m2.addPedido(p3);

        Prato pr1 = new Prato(30,"Strognoff de frango",3, p1);
        Prato pr2 = new Prato(18,"Carne moida",2, p1);

        Prato pr3 = new Prato(24,"Prato americano",2, p2);
        Prato pr4 = new Prato(22,"Bife de frango",4, p2);

        Prato pr5 = new Prato(24,"Bife com batata frita",2, p3);
        Prato pr6 = new Prato(26,"Strognoff de carne",3, p3);

        p1.addPratos(pr1);
        p1.addPratos(pr2);

        p2.addPratos(pr3);
        p2.addPratos(pr4);

        p3.addPratos(pr5);
        p3.addPratos(pr6);

        mesaRepository.saveAll(List.of(m1,m2));
    }
}
