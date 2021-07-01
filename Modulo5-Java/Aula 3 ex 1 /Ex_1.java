import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Desenvolva um programa para mostrar os primeiros n números pares, sendo n um valor que o usuário irá inserir pelo console.
        // Lembre-se que um número é par quando divisível por 2.

        System.out.println("Digite um valor: ");
        int n = scanner.nextInt();

        if(n%2 == 0){
            for(int i=0; i <= n; i++){
                System.out.println(i);
                i++;
            }
        }else{
            System.out.println("este número não é par");
        }

    }
}
