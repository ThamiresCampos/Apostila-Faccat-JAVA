package lista04;
import java.util.Scanner;

public class Exercicio26 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual � a quantidade do seu estoque: ");
		int estoqueAtual = sc.nextInt();
		System.out.println();
		
		System.out.println("Qual � a capacidade m�xima do estoque:");
		int estoqueMaximo = sc.nextInt();
		System.out.println();
		
		System.out.println("Qual � a capacidade m�nima do estoque:");
		int estoqueMinimo = sc.nextInt();
		System.out.println();
		
		int quantidadeMedia = estoqueMaximo + estoqueMinimo / 2;
		
		if (estoqueAtual >= quantidadeMedia) {
			System.out.println("N�o efetuar compra! : "+estoqueAtual);
			
		}else {
			System.out.println("Efetuar compra! : "+estoqueAtual);
		}
		sc.close();

	}

}
