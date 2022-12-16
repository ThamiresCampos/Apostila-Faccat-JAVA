package lista04;
import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50. Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas");
		System.out.println();
		
		System.out.println("Insira as horas trabalhadas em um mês :  ");
		int horas = sc.nextInt();
		System.out.println();
		
		System.out.println("Dígite o valor do salário por hora :  ");
		int salarioHora = sc.nextInt();
		System.out.println();
		
		int salario = salarioHora  * horas;
		
		if (horas > 160) {
			int HoraExtra = horas - 160;
			int SalarioExtra = salario + (salarioHora * 50 / 100);
			System.out.println("O seu novo salario com horas extras é  : "+SalarioExtra);
			
		}else {
			System.out.println("O valor do seu salário mensal : "+salario);
		}
		sc.close();
	}
	

}
