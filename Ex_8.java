import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex_8 {

    public static void main(String[] args) {
        //Para um protótipo de supermercado, crie um programa que leia 3 produtos e
        // imprima no console: nome, preço, quantidade e o valor total da compra.

        Scanner scanner =  new Scanner(System.in);

        List<Mercado> lista = new ArrayList<>();

        for(int x=1; x<4;x++){

        System.out.println("Produto "+x);
        System.out.println("Digite o nome do produto "+x+": ");
        String nomeProduto = scanner.next();
        System.out.println("Digite o preco do produto "+x+": ");
        double preco = scanner.nextDouble();
        System.out.println("Digite a quantidade do produto "+x+": ");
        int qtde = scanner.nextInt();

        lista.add(new Mercado(nomeProduto,preco,qtde));

        }
        
        double soma = 0;
        double resultado = 0;
        for (Mercado list: lista){
            resultado = list.getPreco() * list.getQtde();
            soma += resultado;
        }


        System.out.println();
        System.out.println("REGISTRO DE COMPRAS");
        System.out.println();
        for (Mercado list : lista){

            System.out.println("Nome do produto: "+list.getNomeProduto());
            System.out.println("Preco do produto: "+list.getPreco());
            System.out.println("A quantidade de produtos: "+list.getQtde());


        }
        System.out.println();
        System.out.println("          NOTA FISCAL");
        System.out.println("O valor total da compra: "+soma);


    }
}
