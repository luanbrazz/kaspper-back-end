package ExerciciosPropostos;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int A, B, C, D;
		
		System.out.println("Digite um número: ");
		A = entrada.nextInt();
		
		System.out.println("Digite um segundo número: ");
		B = entrada.nextInt();
		
		System.out.println("Digite um terceiro número: ");
		C = entrada.nextInt();
		
		System.out.println("Digite um quarto número: ");
		D = entrada.nextInt();
		
		int diferenca = ((A * B) - (C * D));
		
		System.out.println("A diferença do produto é: " + diferenca);
		
		entrada.close();
	}

}