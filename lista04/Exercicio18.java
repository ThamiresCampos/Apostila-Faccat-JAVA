package lista04;
import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela poder� ou n�o votar este ano");
		System.out.println();
		
		System.out.println("Insira o ano em que estamos :");
		int ano = sc.nextInt();
		System.out.println();
		
		System.out.println("Insira o ano em que voc� nasceu :");
		int nascimento = sc.nextInt();
		System.out.println();
		
		int idade = ano - nascimento;
		
		if (idade < 16) {
			System.out.println("Voc� ainda n�o pode votar!");

		}else if (idade == 16 || idade > 65) {
			System.out.println("O voto n�o � obrigat�rio!");
	  
		} else {
		System.out.println("Votar � obrigat�rio!: ");
	   }
		sc.close();

}
}
