package lista04;
import java.util.Scanner;

public class Exercicio38 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int codigoCerto = 1234;
		int senhaCerta = 9999;
		
		System.out.println("Insira o c�digo : ");
		int codigo = sc.nextInt();
		System.out.println();
		
		if (codigo != codigoCerto) {
			System.out.println("C�digo Incorreto");
			
		}else {
			System.out.println("Insira sua senha : ");
			int senha = sc.nextInt();
			System.out.println();
			
			if (senha != senhaCerta) {
				System.out.println("Senha inv�lida");
			
			} else {
				System.out.println("Acesso permitido");
			}
			sc.close();
		}

	}

}
