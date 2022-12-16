package lista04;
import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa. Sabendo-se que ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu salário total.");
		System.out.println();
		
		System.out.println("Insira o valor do seu salário fixo : ");
		int salarioFixo = sc.nextInt();
		System.out.println();
		
		System.out.println("Insira o valor do seu salário fixo : ");
		int Valorvendas = sc.nextInt();
		System.out.println();
		
		if (Valorvendas == 0) {
			System.out.println("O seu salário continua o mesmo valor : "+salarioFixo);
			
		}else if (Valorvendas <= 1.500) {
			int comissao = Valorvendas + (salarioFixo + Valorvendas * 5 / 100);
			System.out.println("O seu salário com o acréscimo ficou em : "+comissao);
			
		} else {
			int comissao2 = Valorvendas + (salarioFixo + Valorvendas * 3 / 100);
			System.out.println("O seu salário com o acréscimo ficou em : "+comissao2);
		}
		sc.close();
	}

}
