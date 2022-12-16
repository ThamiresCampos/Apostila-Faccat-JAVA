package lista04;
import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {
	
         Scanner sc = new Scanner(System.in);
         
        System.out.println("Ler dois valores e escrevê-los em ordem crescente.");
 		System.out.println();
 		
 		System.out.println("Insira um valor : ");
 		int valor1 = sc.nextInt();
 		System.out.println();
 		
 		System.out.println("Insira mais um valor : ");
 		int valor2 = sc.nextInt();
 		System.out.println();
 		
 		if (valor1 < valor2) {
 			System.out.println("1° é : " + valor1);
 			System.out.println("2° é : " + valor2);
			
		} else {
			System.out.println("1° é : " + valor2);
 			System.out.println("2° é : " + valor1);
		}
 		sc.close();
	}

}
