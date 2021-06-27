package Aula4Ex4;

import java.util.Scanner;

public class CLT extends Funcionario {

    private String cargo;

    public CLT(String nome, int horasTrabalhada,String cargo) {
        super(nome, horasTrabalhada);
        this.cargo = cargo;
    }

    public double pagamento(char cargo){
        double pagamento = 0;
        
        if(cargo == '1' ){
            pagamento = 3200 +  160;  // 160 é 5% de 3200 = 100% - 320 = 10% - 320/2 = 160 - 160 = 5%
        } else if(cargo == '2'){
            pagamento = 4000 + 320;
        } else if(cargo == '3'){
            pagamento = 6000 + 750;
        }else if(cargo == '4'){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite a quantidade participação nos lucros: ");
            double participacao = scanner.nextDouble();

            pagamento = pagamentoDiretor(participacao,15000);

        } else if(cargo == '0'){
            System.out.println("Programa parando...");
            System.out.println("Obrigado por ultilizar o programa!");
            return 0;
        }else{
            System.out.println("Digito invalido!");
        }

        return pagamento;
    }

    public double pagamentoDiretor(double pdl, double salario){
        pdl *= 0.03;
        salario += pdl;

        return salario;
    }

    @Override
    public String toString() {
        return "CLT{" +
                "cargo='" + cargo + '\'' +
                '}';
    }
}
