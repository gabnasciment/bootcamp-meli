public class Ex_5 {

    //Desenvolver um programa para exibição por console os n primeiros números naturais que têm pelo menos
    // de m dígitos de d, sendo n, m e d valores que o utilizador vai enviar pelo console.
    //
    //
    // Por exemplo: se o usuário inserir n = 5, m = 2 e d = 3, o programa deve exibir os primeiros 5 números
    // naturais que tenham pelo menos 2 dígitos 3 no console. Neste caso, a saída será: 33, 133 , 233, 303, 313.
    //
    //
    //Dependendo de como você decidir abordar a solução para este exercício, pode ser necessário usar recursos
    // que ainda não estudamos. O desafio é pesquisar no Google como usar esses recursos e usá-los!


    public static boolean checarDigitos (int digito, int quantidadeDigitos, int numero) {
        String numeroString = Integer.toString(numero);
        char[] listaDigitos = numeroString.toCharArray();

        int contador = 0;

        for(char c: listaDigitos) {
            if (Integer.parseInt(String.valueOf(c)) == digito) {
                contador ++;
            }
        }

        if (contador >= quantidadeDigitos) {
            return true;
        }
        return false;
    }
}
