package lista04;
import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A jornada de trabalho semanal de um funcion�rio � de 40 horas. O funcion�rio que trabalhar mais de 40 horas receber� hora extra, cujo c�lculo � o valor da hora regular com um acr�scimo de 50. Escreva um algoritmo que leia o n�mero de horas trabalhadas em um m�s, o sal�rio por hora e escreva o sal�rio total do funcion�rio, que dever� ser acrescido das horas extras, caso tenham sido trabalhadas");
		System.out.println();
		
		System.out.println("Insira as horas trabalhadas em um m�s :  ");
		int horas = sc.nextInt();
		System.out.println();
		
		System.out.println("D�gite o valor do sal�rio por hora :  ");
		int salarioHora = sc.nextInt();
		System.out.println();
		
		int salario = salarioHora  * horas;
		
		if (horas > 160) {
			int HoraExtra = horas - 160;
			int SalarioExtra = salario + (salarioHora * 50 / 100);
			System.out.println("O seu novo salario com horas extras �  : "+SalarioExtra);
			
		}else {
			System.out.println("O valor do seu sal�rio mensal : "+salario);
		}
		sc.close();
	}
	

}
