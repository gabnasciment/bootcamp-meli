package exercicio3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(new Pessoa("Gabriel","28327834782"));
        pessoas.add(new Pessoa("Izabella","34728327882"));
        pessoas.add(new Pessoa("Pablo","78228327834"));
        pessoas.add(new Pessoa("Guilherme","32728834782"));
        pessoas.add(new Pessoa("Douglas","83428327782"));
        pessoas.add(new Pessoa("Allan","22788334782"));

        pessoas.sort(Comparator.comparing(Pessoa::getNome));
        pessoas.forEach(System.out::println);


        List<Celular> celular = new ArrayList<>();

        System.out.println();
        celular.add(new Celular("11 989058594","suporte"));
        celular.add(new Celular("11 959498905","suporte"));
        celular.add(new Celular("11 905889594","suporte"));
        celular.add(new Celular("11 959489058","suporte"));
        celular.add(new Celular("11 958589094","suporte"));


        celular.sort(Comparator.comparing(Celular::getNumber));
        celular.forEach(System.out::println);





    }
}
