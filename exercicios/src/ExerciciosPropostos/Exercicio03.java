package ExerciciosPropostos;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int A, B, C, D;
		
		System.out.println("Digite um n�mero: ");
		A = entrada.nextInt();
		
		System.out.println("Digite um segundo n�mero: ");
		B = entrada.nextInt();
		
		System.out.println("Digite um terceiro n�mero: ");
		C = entrada.nextInt();
		
		System.out.println("Digite um quarto n�mero: ");
		D = entrada.nextInt();
		
		int diferenca = ((A * B) - (C * D));
		
		System.out.println("A diferen�a do produto �: " + diferenca);
		
		entrada.close();
	}

}