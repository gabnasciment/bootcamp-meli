package Exercicio2;

public class Counter {
	
	private int contador;
	
	public Counter() {	
	}

	public Counter(int contador) {
		super();
		this.contador = contador;
	}
	
	public Counter( Counter cont) {
		this.contador = cont.getContador();
	}
	
	
	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
	

	public int aumentar(int valor) {
		this.contador += valor;
		
		return this.contador;
	}
	
	public int diminuir(int valor) {
		this.contador -= valor;
		
		return this.contador;
	}
	
	
	
	
	

}
