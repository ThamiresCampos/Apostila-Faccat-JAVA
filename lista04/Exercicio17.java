package lista04;
import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que aluno é aprovado). Escrever também a média calculada.");
		System.out.println();
		
		System.out.println("Primeira nota : ");
		float nota1 = sc.nextFloat();
		System.out.println();
		
		System.out.println("Segunda nota : ");
		float nota2 = sc.nextFloat();
		System.out.println();
		
		float media = (nota1 + nota2) / 2;
		System.out.println("A sua média é : " + media);
		System.out.println();
		
		if (media > 6 || media == 6) {
			System.out.println("Aluno foi aprovado");
			
		} else {
			System.out.println("Aluno não foi aprovado");
		}
		sc.close();
	}

}
