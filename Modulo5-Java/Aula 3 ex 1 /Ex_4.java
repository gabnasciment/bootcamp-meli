import java.util.Scanner;

public class Ex_4 {

    private static boolean primo(int numero){
        if(numero%2 == 0){
            return false;
        }
        if(numero == 2){
            return true;
        }
        if(numero <= 0){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        // Desenvolva um programa para mostrar por console os primeiros n números primos,
        // sendo um valor que o usuário irá inserir pelo console.

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i = 1; i < n; i++){
            if(primo(i)){
                System.out.println(i);
            }
            i++;
        }


    }
}
