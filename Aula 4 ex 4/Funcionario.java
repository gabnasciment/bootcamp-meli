package Aula4Ex4;

public abstract class Funcionario {

    private String nome;
    private int horasTrabalhada;

    public Funcionario(String nome, int horasTrabalhada) {
        this.nome = nome;
        this.horasTrabalhada = horasTrabalhada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHorasTrabalhada() {
        return horasTrabalhada;
    }

    public void setHorasTrabalhada(int horasTrabalhada) {
        this.horasTrabalhada = horasTrabalhada;
    }


}
