package lista04;
import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).");
		System.out.println();
		
		System.out.println("Dígite um número : ");
		int numero = sc.nextInt();
		System.out.println();
		
		if (numero > 0) {
			System.out.println("Número é positivo!");
		
		} else {
			System.out.println("Número é negativo!");
		}
		sc.close();
	}
}
