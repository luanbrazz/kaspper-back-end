package ExerciciosPropostos;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double raio;
		double area;
		final double PI = 3.14159;
		
		System.out.println("Qual o valor do raio? ");
		raio = entrada.nextDouble();
		
		area = PI * (raio * raio);
		
		System.out.println("O valor da área é " + area);
		
		entrada.close();
		
	}

}