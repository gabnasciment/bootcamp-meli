package exercicio3;

import java.util.Comparator;
import java.util.Locale;

public class Pessoa implements Precedente<Pessoa>, Comparable {
    private String nome;
    private String cpf;

    public Pessoa(){
    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }

    @Override
    public int precedeA(Pessoa p) {
        return this.nome.toLowerCase().compareTo(p.getNome().toLowerCase());
    }

    @Override
    public void sort(Pessoa[] arr, Comparator<Pessoa> c) {

    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
