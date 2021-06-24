import java.util.Scanner;

public class Ex_3 {

    public static void main(String[] args) {
        // Desenvolva um programa para informar se um um número n é primo ou não, sendo n um valor que
        // o usuário irá inserir pelo console. Lembre-se que um número é primo quando só é divisível por
        // 1 e por si mesmo.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int n = scanner.nextInt();

        if(numeroPrimo(n)){
            System.out.println("este número é primo.");
        }else{
            System.out.println("este número não é primo");
        }
    }

    public static boolean numeroPrimo (int n){

        if (n <= 1 ) {
            return false;
        }
        else if ( n == 2){
            return true;
        }
        else if (n % 2 == 0){
            return false;
        }
        return true;
    }
}
