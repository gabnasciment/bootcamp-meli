
import java.util.Scanner;

public class Ex_5 {
    // Desenvolver um programa para exibição por console os n primeiros números naturais que têm pelo menos
    // de m dígitos de d, sendo n, m e d valores que o utilizador vai enviar pelo console.
    //
    // Por exemplo: se o usuário inserir n = 5, m = 2 e d = 3, o programa deve exibir os primeiros 5 números
    // naturais que tenham pelo menos 2 dígitos 3 no console. Neste caso, a saída será: 33, 133 , 233, 303, 313.
    //
    // Dependendo de como você decidir abordar a solução para este exercício, pode ser necessário usar recursos
    // que ainda não estudamos. O desafio é pesquisar no Google como usar esses recursos e usá-los!


    private static boolean hasAtLeastMDigits(Integer n, Integer m, Integer d){
        String number = n.toString();
        Integer digitsMinCount = m;
        Character digit = (char)(d + '0');

        Long digitsCount = number.chars().filter(ch -> ch == digit).count();

        return digitsCount >= digitsMinCount;
    }

    public static void main(String[] args) {

        Integer n = Integer.parseInt(args[0]);
        Integer m = Integer.parseInt(args[1]);
        Integer d = Integer.parseInt(args[2]);

        for(int i = 0, k = 0; i < n; k++ ){
            if(hasAtLeastMDigits(k, m, d)){
                System.out.println(k);
                i++;
            }
        }
    }

}
