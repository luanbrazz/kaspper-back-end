package ExerciciosPropostos;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double numero, horasTrabalhadas, recebePorHora, salario;
		
		System.out.println("Digite o número do funcionário: ");
		numero = entrada.nextDouble();
		
		System.out.println("Digite seu número de horas trabalhadas: ");
		horasTrabalhadas = entrada.nextDouble();
		
		System.out.println("Digite quanto ele recebe por hora: ");
		recebePorHora = entrada.nextDouble();
		
		salario = (horasTrabalhadas * recebePorHora);
		
		System.out.println("O número do funcionário é " + numero + " e seu salário é R$" + salario);
		
		entrada.close();
	}

}