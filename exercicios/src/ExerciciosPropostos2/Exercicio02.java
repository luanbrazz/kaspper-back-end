package ExerciciosPropostos2;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int num, ParOuImpar;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um número INTEIRO: ");
		num = entrada.nextInt();
		
		ParOuImpar = num % 2;
		
		if (ParOuImpar == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("ÍMPAR");
			
		}
		
		entrada.close();
	}

}