package lista04;
import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
	
         Scanner sc = new Scanner(System.in);
         
        System.out.println("Ler dois valores e escrev�-los em ordem crescente.");
 		System.out.println();
 		
 		System.out.println("Insira um valor : ");
 		int valor1 = sc.nextInt();
 		System.out.println();
 		
 		System.out.println("Insira mais um valor : ");
 		int valor2 = sc.nextInt();
 		System.out.println();
 		
 		if (valor1 < valor2) {
 			System.out.println("1� � : " + valor1);
 			System.out.println("2� � : " + valor2);
			
		} else {
			System.out.println("1� � : " + valor2);
 			System.out.println("2� � : " + valor1);
		}
 		sc.close();
	}

}
