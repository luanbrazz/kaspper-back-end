package ExerciciosPropostos;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double numero, horasTrabalhadas, recebePorHora, salario;
		
		System.out.println("Digite o n�mero do funcion�rio: ");
		numero = entrada.nextDouble();
		
		System.out.println("Digite seu n�mero de horas trabalhadas: ");
		horasTrabalhadas = entrada.nextDouble();
		
		System.out.println("Digite quanto ele recebe por hora: ");
		recebePorHora = entrada.nextDouble();
		
		salario = (horasTrabalhadas * recebePorHora);
		
		System.out.println("O n�mero do funcion�rio � " + numero + " e seu sal�rio � R$" + salario);
		
		entrada.close();
	}

}