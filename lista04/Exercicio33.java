package lista04;
import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dígite um valor : ");
		int valor1 = sc.nextInt();
		System.out.println();
		
		System.out.println("Dígite um mais valor : ");
		int valor2 = sc.nextInt();
		System.out.println();
		
		if (valor2 > valor1) {
			System.out.println("O segundo valor é o maior!");
		
		} else {
			System.out.println("O primeiro valor é o maior!");
		}
		sc.close();
		

	}

}
