package lista04;
import java.util.Scanner;

public class Exercicio37 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		

		
		System.out.println("D�gite quantos quilos de morangos forma comprados : ");
		int morango = sc.nextInt();
		System.out.println();
		
		System.out.println("D�gite quantos quilos de ma�as forma comprados : ");
		int macas = sc.nextInt();
		System.out.println();

		
		float valorMorango = (float) (morango * 2.50);
		float valorMaca = (float) (macas * 1.80);
		float valorMorango2 = (float) (morango * 2.20);
		float valorMaca2 = (float) (macas * 1.80);
		float total =  (valorMorango + valorMaca);
		float total2 =  (valorMorango2 + valorMaca2);
		
		
	
		
		if (morango <= 5 || macas <= 5) {
			System.out.println("O valor total � " + total);
		
		} else if (total2 >= 25) {
			float desconto = (float) (total * 0.1);
			float vFinal = (float) (total2 - desconto);
			System.out.println("O pre�o total � : " + vFinal + " R$ ");
		
		}else if (valorMorango > 5 || valorMaca > 5 || valorMorango < 8 || valorMaca < 8) {
		System.out.println("O pre�o total � : "+ total2 + " R$ ");
			
		}else if (valorMorango > 8 || valorMaca > 8) {
			float desconto = (float) (total2 * 0.1);
			float vFinal = (float) (total2 - desconto);
			System.out.println("O pre�o total � : "+ vFinal + " R$ ");
		}
		sc.close();
	}
	
}
