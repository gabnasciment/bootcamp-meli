import java.util.Scanner;

public class Ex_3 {

    private static boolean checandoPrimo(int num){
        if(num%2 == 0){
            return false;
        }
        if(num == 2 || num%1 == num){
            return true;
        }
        return true;
    }

    public static void main(String[] args) {
        // Desenvolva um programa para informar se um um número n é primo ou não, sendo n um valor que
        // o usuário irá inserir pelo console. Lembre-se que um número é primo quando só é divisível por
        // 1 e por si mesmo.

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if (checandoPrimo(n)){
            System.out.println(n+ " é um número primo");
        }else{
            System.out.println(n + " não é um número primo");
        }

    }


}
