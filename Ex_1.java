import java.util.Scanner;

public class Ex_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int n = scanner.nextInt();

        if (n%2 == 0){
            System.out.println("O número é par");
        } else {
            System.out.println("O número não é par");
        }
    }
}
