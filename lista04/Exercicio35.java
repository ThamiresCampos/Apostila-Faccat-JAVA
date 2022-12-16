package lista04;
import java.util.Scanner;

public class Exercicio35 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner ( System.in);
		
		System.out.println("Insira qual foi o combustível escolhido : ");
		String combustivel = sc.next();
		System.out.println();
		
		System.out.println("Quantos litros deseja abastecer? : ");
		float litros = sc.nextFloat();
		System.out.println();

		if (combustivel == "g" || litros <=20) {
			float desconto = (float) (3.30 * 0.03);
			float preco = (float) litros - desconto;
			System.out.println("O valor a ser pago é : "+preco + " R$ ");
			
		}else if (combustivel == "g" || litros > 20) {
			float desconto = (float) (3.30 * 0.05);
			float preco = (float) (litros - desconto);
			System.out.println("O valor a ser pago é : "+preco + " R$ ");
		
		}else if (combustivel == "a" || litros <= 20) {
			float desconto = (float) (2.90 * 0.04);
			float preco = (float) (litros - desconto);
			System.out.println("O valor a ser pago é : "+preco + " R$ ");
			
		}else if (combustivel == "a" || litros > 20) {
			float desconto = (float) (2.90 * 0.06);
			float preco = (float) (litros - desconto);
			System.out.println("O valor a ser pago é : "+preco + " R$ ");
		
		}
		sc.close();
		
	}

}
