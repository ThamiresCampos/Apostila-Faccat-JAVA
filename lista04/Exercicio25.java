package lista04;
import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("D�gite o n�mero da sua conta : ");
		int conta = sc.nextInt();
		System.out.println();
		
		System.out.println("Insira o seu saldo : ");
		int saldo = sc.nextInt();
		System.out.println();
		
		System.out.println("D�gite o seu d�bito : ");
		int debito = sc.nextInt();
		System.out.println();
		
		System.out.println("D�gite o seu cr�dito : ");
		int credito = sc.nextInt();
		System.out.println();
		
		int saldoAtual = saldo - debito + credito;
		
		if (saldoAtual >= 0) {
			System.out.println("O seu saldo � positivo!" +saldoAtual);
			
		}else {
			System.out.println("O seu saldo � negativo!" +saldoAtual);
		}
		sc.close();
	}

}
