package lista04;
import java.util.Scanner;

public final class Exercicio42 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Valor do lado a : ");
		int ladoA = sc.nextInt();
		System.out.println();
		
		System.out.println("Valor do lado b : ");
		int ladoB = sc.nextInt();
		System.out.println();
		
		System.out.println("Valor do lado c : ");
		int ladoC = sc.nextInt();
		System.out.println();
		
		if ((ladoA < ladoB+ladoC) || (ladoB < ladoA+ladoC) || (ladoC < ladoA + ladoB)) {
			if ((ladoA == ladoB) || (ladoB == ladoC)) {
				System.out.println("Triânugulo equilátero");
				
			}else if ((ladoA == ladoB) || (ladoB == ladoC) || (ladoA == ladoC)) {
				System.out.println("Triângulo isósceles");
			
			}else  {
				System.out.println("Triângulo escaleno");
			
			} 
		sc.close();
		}

	}

}
