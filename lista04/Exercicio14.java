package lista04;
import java.util.Scanner;

public class Exercicio14 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ler um valor e escrever a mensagem � MAIOR QUE 10! se o valor lido for maior que 10,contr�rio escrever N�O � MAIOR QUE 10!");
		System.out.println();
		
		System.out.println("D�gite um n�mero : ");
		int numero = sc.nextInt();
		System.out.println();
		
		if  (numero > 10){
			System.out.println("� maior que 10!");
			
		} else if (numero == 10) {
			System.out.println("� igual a 10!");
		} else {
			System.out.println("N�o � maior que 10!");
		}
		sc.close();
	}

}
