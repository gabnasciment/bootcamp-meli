package Exercicio1;

public class ContaCorrente {

	private String numero;
	private String agencia;
	private double saldo;
	
	public ContaCorrente() {
	}
	
	public ContaCorrente(String numero, String agencia, double saldo) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
	}

	public ContaCorrente ( ContaCorrente conta) {
		this.numero = conta.getNumero();
		this.agencia = conta.getAgencia();
		this.saldo = conta.getSaldo();
		
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		
		this.saldo = saldo;
	}
	
	
	public double deposito(double valor) {
		this.saldo+= valor;
		System.out.println("VOCE FEZ UM DEPOSITO DE: "+valor);
		return this.saldo;
	}
	
	public double saque(double valor) {
		
		if(testarSaldo(valor)){
			this.saldo -= valor;
			
			System.out.println("SEU SAQUE: "+ valor);
			System.out.println("SALDO EM CONTA AGORA: "+ this.saldo);
			
			return this.saldo;
			
		}
		else {
			System.out.println("NÃO FOI POSSIVEL CONCLUIR A TRANSACAO, SALDO INSULFICIENTE");
			
			return this.saldo;
		}
		
	}
	
	public double devolucao(double valor) {
		this.saldo += valor;
		System.out.println("VOCE TEVE UMA DEVOLUCAO DE: "+valor);
		return this.saldo;
	}
	
	public double transferencia(double valor) {
		
		if (testarSaldo(valor)){
			this.saldo -= valor;
					
			System.out.println("VALOR DA TRANSFERENCIA: "+ valor);
			System.out.println("SALDO EM CONTA AGORA: "+ this.saldo);
			
			return this.saldo;
			
		}else {
			System.out.println("NÃO FOI POSSIVEL CONCLUIR A TRANSFERENCIA, SALDO INSULFICIENTE");
			
			return this.saldo;
		}
	}
	
	
	public boolean testarSaldo(double valor) {
		
		boolean teste;
		
		if(valor <= this.getSaldo()) {
			teste = true;
		} else {
			teste = false;
		}
		
		return teste;
	}
	
	@Override
	public String toString() {
		return "\n número da conta: "+ this.numero + "\n agencia: "+ this.agencia + "\n saldo: "+ this.saldo; 
	}
}
