import java.util.Scanner;

public class Ex_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Desenvolva um programa para mostrar os primeiros n números múltiplos de m,
        // sendo n e m valores que o usuário irá inserir via console. Lembre-se que um número a
        // é divisível por b se a é divisível por b.

        System.out.println("Digite o valor de n: ");
        int n = scanner.nextInt();

        System.out.println("Digite o valor de m:");
        int m = scanner.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.println(i * m);
        }
    }
}
