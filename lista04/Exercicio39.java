package lista04;
import java.util.Scanner;

public class Exercicio39 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Dígite o nome do produto : ");
		String nome = sc.next();
		System.out.println();

		System.out.println("Insira a quantidade adquirida : ");
		int quantidade = sc.nextInt();
		System.out.println();
		
		System.out.println("Insira o valor de cada produto comprado : ");
		int pUnitario = sc.nextInt();
		System.out.println();
		
		if (quantidade <= 5) {
			float total = (float) (quantidade * pUnitario);
			float desconto = (float) (total - 0.02);
			System.out.println("O total a ser pago é : "+desconto + " R$");
		
		} else if (quantidade > 5 || quantidade <= 10) {
			float total = (float) (quantidade * pUnitario);
			float desconto = (float) (total - 0.03);
			System.out.println("O total a ser pago é : "+desconto + " R$");
		
		} else if (quantidade > 10) {
			float total = (float) (quantidade * pUnitario);
			float desconto = (float) (total - 0.05);
			System.out.println("O total a ser pago é : "+desconto + " R$");
		}
	}

}
