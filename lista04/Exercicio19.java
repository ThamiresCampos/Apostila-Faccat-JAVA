package lista04;
import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Ler dois valores e escrever o maior deles.");
		System.out.println();
		
		System.out.println("Insira um valor : ");
		int valor1 = sc.nextInt();
		System.out.println();
		
		System.out.println("Insira mais um valor : ");
		int valor2 = sc.nextInt();
		System.out.println();
		
		if (valor1 > valor2) {
			System.out.println("O maior n�mero �  : " + valor1);
			
		}else {
			System.out.println("O maior n�mero �  : " + valor2);
		}
		sc.close();
	}

}
