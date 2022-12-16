package lista04;
import java.util.Scanner;

public class Exercicio40 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dígite a primeira nota : ");
		float nota1 = sc.nextFloat();
		System.out.println();
		
		System.out.println("Dígite a segunda nota : ");
		float nota2 = sc.nextFloat();
		System.out.println();
		
		System.out.println("Dígite a terceira nota : ");
		float nota3 = sc.nextFloat();
		System.out.println();
		
		float media = (nota1 + (nota2 * 2) + (nota3 * 3) + 5 )/6;
		
		if (media >= 9 ) {
			System.out.println("Tirou A");
		
		}else if (media > 7.5) {
			System.out.println("Tirou B");
		
		}else if (media >= 6) {
			System.out.println("Tirou C");
		
		}else {
			System.out.println("Tirou D");
		}
		sc.close();
	}

}
