package lista04;
import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("D�gite um valor : ");
		int valor1 = sc.nextInt();
		System.out.println();
		
		System.out.println("D�gite um mais valor : ");
		int valor2 = sc.nextInt();
		System.out.println();
		
		if (valor2 > valor1) {
			System.out.println("O segundo valor � o maior!");
		
		} else {
			System.out.println("O primeiro valor � o maior!");
		}
		sc.close();
		

	}

}
