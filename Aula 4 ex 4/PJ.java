package Aula4Ex4;

public class PJ extends Funcionario{


    public PJ(String nome, int horasTrabalhada) {
        super(nome, horasTrabalhada);
    }

    public double pagamento(int horasTrab){
        double pagamento;

        pagamento = 50 * horasTrab;  // 50 por hora trabalhada

        return pagamento;
    }

}
