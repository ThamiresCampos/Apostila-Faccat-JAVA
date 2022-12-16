package lista04;
import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o valor de um lado : ");
		int lado1 = sc.nextInt();
		System.out.println();
		
		System.out.println("Insira o valor do outro lado : ");
		int lado2 = sc.nextInt();
		System.out.println();
		
		System.out.println("Insira o valor de mais um lado : ");
		int lado3 = sc.nextInt();
		System.out.println();
		
		if (lado1 + lado2 > lado3 || lado2 + lado3 > lado1 || lado1 + lado3 > lado2) {
			System.out.println("Forma um triângulo");
			
		} else {
			System.out.println("Não forma um triângulo");
		}
		sc.close();
	}

}
