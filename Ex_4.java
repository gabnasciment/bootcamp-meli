import java.util.Scanner;

public class Ex_4 {

    public static void main(String[] args) {

        //Desenvolva um programa para mostrar por console os primeiros n números primos,
        // sendo um valor que o usuário irá inserir pelo console.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int n = scanner.nextInt();
        int contador = 0;
        int contadorPrimos = 0;

        System.out.println();
        while(contador < n){
            if(numeroPrimo(contador)){
                contadorPrimos++;
                System.out.println(contador);
            }
            contador++;
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
