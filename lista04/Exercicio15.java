package lista04;
import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ler um valor e escrever se � positivo ou negativo (considere o valor zero como positivo).");
		System.out.println();
		
		System.out.println("D�gite um n�mero : ");
		int numero = sc.nextInt();
		System.out.println();
		
		if (numero > 0) {
			System.out.println("N�mero � positivo!");
		
		} else {
			System.out.println("N�mero � negativo!");
		}
		sc.close();
	}
}
