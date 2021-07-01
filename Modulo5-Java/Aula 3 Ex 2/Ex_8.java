import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex_8 {

    public static void main(String[] args) {
        //Para um protótipo de supermercado, crie um programa que leia 3 produtos e
        // imprima no console: nome, preço, quantidade e o valor total da compra.

        Scanner input =  new Scanner(System.in);

        List<Mercado> produtos = new ArrayList<>();

        for(int i=1; i < 4; i++){
            System.out.println("Produto "+ i);
            System.out.println("Digite o nome do produto: ");
            String nomeProduto = input.next();
            System.out.println("Digite o preço do produto R$: ");
            double preco = input.nextDouble();
            System.out.println("Digite a quantidade do produto: ");
            int quantidade = input.nextInt();

            produtos.add(new Mercado(nomeProduto,preco,quantidade));
        }


        double resultado = 0;
        double soma = 0;

        for(Mercado prod: produtos){
            resultado = prod.getPreco() * prod.getQuantidade();
            soma +=  resultado;
        }

        System.out.println("REGISTRO DA COMPRA");
        System.out.println();

        for (Mercado prod : produtos){
            System.out.println("Produto: "+prod.getNome());
            System.out.println("Preço: "+ prod.getPreco());
            System.out.println("Quantidade: "+ prod.getQuantidade());
        }

        System.out.println();
        System.out.println("VALOR TOTAL DA COMPRA: "+ soma);





    }
}
