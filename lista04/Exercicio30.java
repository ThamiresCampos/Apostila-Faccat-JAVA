package lista04;
import java.util.Scanner;

public class Exercicio30 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um valor : ");
		int valor1 = sc.nextInt();
		System.out.println();
		
		System.out.println("Insira outro valor : ");
		int valor2 = sc.nextInt();
		System.out.println();
		
		System.out.println("Insira mais um valor : ");
		int valor3 = sc.nextInt();
		System.out.println();
		
		if (valor1 > valor2 || valor1 > valor3 || valor2 > valor3) {
			int terceiro = valor1;
			int segundo = valor2;
			int primeiro = valor3;
			System.out.println(primeiro);
			System.out.println(segundo);
			System.out.println(terceiro);
		
		} else if (valor2 > valor3 || valor2 > valor1 || valor3 > valor1) {
			int terceiro = valor2;
			int segundo = valor3;
			int primeiro = valor1;
			System.out.println("A onde ficaria : "+primeiro);
			System.out.println(segundo);
			System.out.println(terceiro);
		
		} else if (valor3 > valor1 || valor3 > valor2 || valor1 > valor2) {
			int terceiro = valor3;
			int segundo = valor1;
			int primeiro = valor2;
			System.out.println(primeiro);
			System.out.println(segundo);
			System.out.println(terceiro);
		}
		sc.close();
	}


}

