package lista04;
import java.util.Scanner;

public class Exercicio36 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		
		
		System.out.println("Dígite a idade de uma mulher : ");
		int m1 = sc.nextInt();
		System.out.println();
		
		System.out.println("Dígite a idade de mais uma mulher : ");
		int m2 = sc.nextInt();
		System.out.println();
		
		System.out.println("Dígite a idade de um homem : ");
		int h1 = sc.nextInt();
		System.out.println();
		
		System.out.println("Dígite a idade de mais um homem : ");
		int h2 = sc.nextInt();
		System.out.println();
		
		
		
		if (m1 > m2 ) {
			int mvelha = m1;
			int mnova = m2;
		
		} else if (m2 > m1) {
			int mvelha = m2;
			int mnova = m1;
		
		} else if (h1 > h2 ) {
			int hvelho = h1;
			int hnovo = h2;
		
		} else {
			int hvelho = h2;
			int hnovo = h1;
		}
		
		 int mvelha = 0;
		 int mnova = 0;
		 int hvelho = 0;
		 int hnovo = 0;
		
		
		 int soma = mvelha + hnovo;
		 int produto = hvelho * mnova;
		 
		 
		 System.out.println("A soma da mulher mais com o homem mais novo é : "+soma);
		 System.out.println();
		 
		 System.out.println("O resultado do produto entre a mulher mais nova com o homem mais velho é  : "+produto);
		 
		sc.close();
		
		
		

	}

}
