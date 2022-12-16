package lista04;
import java.util.Scanner;

public class Exercicio14 {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10,contrário escrever NÃO É MAIOR QUE 10!");
		System.out.println();
		
		System.out.println("Dígite um número : ");
		int numero = sc.nextInt();
		System.out.println();
		
		if  (numero > 10){
			System.out.println("É maior que 10!");
			
		} else if (numero == 10) {
			System.out.println("É igual a 10!");
		} else {
			System.out.println("Não é maior que 10!");
		}
		sc.close();
	}

}
