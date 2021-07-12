

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CLT tecnico = new CLT();
        ExercicioFuncionarioCLTePJ.PJ funcionario = new ExercicioFuncionarioCLTePJ.PJ();


        char cargo,simOuNao;

        System.out.println("Você vai realizar o pagamento de um Funcionario?");
        System.out.println("Digite S - para sim");
        System.out.println("Digite N - para nâo");
        System.out.println("Sua resposta: ");
        simOuNao = scanner.next().toUpperCase().charAt(0);

        switch(simOuNao){

            case 'S':

                System.out.println("Funcionario CLT ou PJ ?");
                System.out.println("Digite conforme o desejado");
                System.out.println(" 1 - Funcionario PJ");
                System.out.println(" 2 - Funcionario CLT");
                System.out.println(" 0 - sair");
                char opcao = scanner.next().charAt(0);

                switch(opcao){

                    case '1':
                        System.out.println("Digite a hora mensal do funcionario:");
                        int horaTrab = scanner.nextInt();

                        System.out.println("Digite o valor por hora trabalhada do funcionario");
                        double valorHora = scanner.nextDouble();

                        System.out.println(funcionario.pagamento(horaTrab,valorHora));
                        break;

                    case '2':

                        System.out.println("Digite o numero de acordo com o cargo");
                        System.out.println(" 1 - para Técnico");
                        System.out.println(" 2 - para Analista");
                        System.out.println(" 3 - para Gerentes ");
                        System.out.println(" 4 - para Diretor");
                        System.out.println(" 0 - para sair");
                        System.out.println(" Sua resposta: ");
                        char resposta = scanner.next().charAt(0);


                        System.out.println("Digite a quantidade de metas batidas do funcionario:");
                        int metaBatida = scanner.nextInt();


                        System.out.println("Pagamento de salario efetifado: CLT"+tecnico.pagamento(resposta,metaBatida));
                        break;

                    case '0':

                        break;
                }

            case 'N':
                System.out.println("Obrigado por ultilizar o programa!");
                break;

        }




    }
}
