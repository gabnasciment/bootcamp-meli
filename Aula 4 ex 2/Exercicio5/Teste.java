package Exercicio5;

public class Teste {

    public static void main(String[] args) {

        Data data = new Data("26/06/2021");

        data.adicionarDia();

        System.out.println( data.validar("26/06/2021"));

        System.out.println(data);
    }
}
