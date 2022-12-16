package lista04;
import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra.");
		System.out.println();
		
		System.out.println("Quantas maçãs você comprou: ");
		int quantidade = sc.nextInt();
		System.out.println();
		
		if (quantidade < 12  ) {
			float somaMenor12 = (float) (1.30 * quantidade);
			System.out.println("O valor total é de : " + somaMenor12);
			
		} else {
			float somaIgual12 = (float) (1.00 * quantidade);
			System.out.println("O valor total é de : " + somaIgual12);
			sc.close();
		}
		
		
	}
	
}
