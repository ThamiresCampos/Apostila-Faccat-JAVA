package lista04;
import java.util.Scanner;

public class Exercicio41 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);

		System.out.println("D�gite seu n�mero");
		int numero = sc.nextInt();
		System.out.println();
		
		System.out.println("D�gite seu ano de nascimento");
		int aNasc = sc.nextInt();
		System.out.println();
		
		System.out.println("D�gite o ano que entrou na empresa");
		int aEmpre = sc.nextInt();
		System.out.println();
		
		System.out.println("D�gite o ano em que estamos");
		int aEstamos = sc.nextInt();
		System.out.println();
		
		int idade = aEstamos - aNasc;
		int ano = aEstamos - aEmpre;
		
		if (idade >= 65) {
			 System.out.println("Voc� tem "+idade+ " anos");
			 System.out.println("Requerer aposentadoria por idade");
		
		} else if (ano >= 30) {
			System.out.println("Voc� trabalha a "+ano + " anos na empresa");
			System.out.println("Requerer aposentadoria por tempo trabalhado");
			
		}else {
			System.out.println("N�o requer aposentadoria");
		}
		sc.close();
	}

}
