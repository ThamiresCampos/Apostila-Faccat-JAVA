package lista04;
import java.util.Scanner;

public class Exercicio34 {



	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Insira um valor : ");
		int x = sc.nextInt();
		System.out.println();

		System.out.println("Insira um mais valor : ");
		int y = sc.nextInt();
		System.out.println();
		
		int z = (x * y) + 5;
		
		
		if ( z <= 0 ) {
			System.out.println("A");
			String resposta = sc.next();
			
			System.out.println(z + " , " +resposta);
		
		} else if ( z <= 100 ) {
			System.out.println("B");
			String resposta = sc.next();
			
			System.out.println(z + " , " +resposta);
		
		} else {
			System.out.println("C");
			String resposta = sc.next();
			
			System.out.println(z+ " , " +resposta);
		}
		
		
		
	}
	

}
