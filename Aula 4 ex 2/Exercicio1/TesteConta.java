package Exercicio1;

public class TesteConta {

	public static void main(String[] args) {
		
		ContaCorrente c1 = new ContaCorrente("92838-2","22",100);
		
		
		
		System.out.println("---------------- Conta Corrente inicial ---------------------");
		
		System.out.println(c1);
		
		
		

		System.out.println("---------------- Conta Corrente ao decorrer ---------------------");
		
		c1.saque(200);
		
		System.out.println(c1);
		
		

		System.out.println("---------------- Conta Corrente ao decorrer ---------------------");
		
		c1.deposito(200);
		
		System.out.println(c1);
		
		
		System.out.println("---------------- Conta Corrente ao decorrer ---------------------");
		
		c1.devolucao(100);
		
		System.out.println(c1);
		
		
		System.out.println("---------------- Conta Corrente ao decorrer ---------------------");
		
		c1.transferencia(50);
		
		System.out.println(c1);
		
		
		
		
	}

	
	

}
