package lista04;
import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um valor : ");
		int valor = sc.nextInt();
		System.out.println();
		
		if (valor == 0) {
			System.out.println("O n�mero � zero!");
			
		}else if (valor > 0) {
			System.out.println("O n�mero � positivo!");
		
		}else {
			System.out.println("O n�mero � negativo!");
		}
		sc.close();
	}

}
