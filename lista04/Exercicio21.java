package lista04;
import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.");
		System.out.println();
		
		System.out.println("Insira a hora do início do jogo : ");
		int inicio = sc.nextInt();
		System.out.println();
		
		System.out.println("Insira a hora do fim do jogo : ");
		int termino = sc.nextInt();
		System.out.println();
		
		int duracao = termino - inicio;
		
		if (duracao < 0) {
			int total = duracao + 24;
			System.out.println("A duração foi de : " + total);
			
		}else {
			System.out.println("A duração foi de : " + duracao);
		}
		sc.close();

	}

}
