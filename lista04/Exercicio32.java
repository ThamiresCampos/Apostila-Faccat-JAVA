package lista04;
import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Dígite o nome do primeiro time : ");
		String time1 = sc.next();
		System.out.println();
		
		System.out.println("Insira quantos gols o primeiro time fez : ");
		int golt1 = sc.nextInt();
		System.out.println();
		
		System.out.println("Dígite o nome do segundo time : ");
		String time2 = sc.next();
		System.out.println();
		
		System.out.println("Insira quantos gols o segundo time fez : ");
		int golt2 = sc.nextInt();
		System.out.println();
		
		if (golt1 > golt2 ) {
			System.out.println("Parabéns, o " + time1 + " foi o vencedor");
		
		} else if (golt2 > golt1) {
			System.out.println("Parabéns, o " + time2 + " foi o vencedor");
		
		} else {
			System.out.println(time1 + " e " + time2 + " empataram");
		}
		sc.close();
		
	}

}
