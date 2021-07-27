package com.bootcampmeli.loja.apiloja.dtos;

import com.bootcampmeli.loja.apiloja.entity.Cliente;
import com.bootcampmeli.loja.apiloja.entity.Pedido;

import java.util.ArrayList;
import java.util.List;

public class ClienteDTO {

    private String nome;
    private String cpf;
    private String email;
    private String telefone;
    private List<PedidoDTO> pedidos;

    public ClienteDTO() {}

    public ClienteDTO(String nome, String cpf, String email, String telefone, List<PedidoDTO> pedidos) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.pedidos = pedidos;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public List<PedidoDTO> getPedidos() {
        return pedidos;
    }

    public static List<ClienteDTO> convert (List<Cliente> clientes){
        List<ClienteDTO> clientesDTO = new ArrayList<>();
        for(Cliente cliente : clientes){
            clientesDTO.add(new ClienteDTO(cliente.getNome(),cliente.getCpf(),cliente.getEmail(), cliente.getTelefone(),
                    PedidoDTO.convert(cliente.getPedidos())));
        }
        return clientesDTO;
    }

    public static ClienteDTO convert(Cliente cliente) {
        return new ClienteDTO(cliente.getNome(), cliente.getCpf(), cliente.getEmail(), cliente.getTelefone(),
                PedidoDTO.convert(cliente.getPedidos()));
    }
}
