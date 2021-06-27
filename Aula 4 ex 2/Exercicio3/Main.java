package Exercicio3;

public class Main {
	public static void main(String[] args) {
		
		Book harry = new Book("Harry Potter e a pedra filosofal","1","Rowling, J. K.");
		Book harry2 = new Book("Harry Potter e a camara secreta","2","Rowling, J. K.");
		Book harry3 = new Book("Harry Potter e o prisioneiro de Azkaban","3","Rowling, J. K.");

		System.out.println(harry);
		System.out.println(harry2);
		System.out.println(harry3);
		
		System.out.println();
		
		harry.devolver(harry);
		harry2.emprestimo(harry2);
		harry3.emprestimo(harry3);
		
		
		
	}
}
