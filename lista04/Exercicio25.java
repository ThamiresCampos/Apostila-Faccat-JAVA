package lista04;
import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dígite o número da sua conta : ");
		int conta = sc.nextInt();
		System.out.println();
		
		System.out.println("Insira o seu saldo : ");
		int saldo = sc.nextInt();
		System.out.println();
		
		System.out.println("Dígite o seu débito : ");
		int debito = sc.nextInt();
		System.out.println();
		
		System.out.println("Dígite o seu crédito : ");
		int credito = sc.nextInt();
		System.out.println();
		
		int saldoAtual = saldo - debito + credito;
		
		if (saldoAtual >= 0) {
			System.out.println("O seu saldo é positivo!" +saldoAtual);
			
		}else {
			System.out.println("O seu saldo é negativo!" +saldoAtual);
		}
		sc.close();
	}

}
