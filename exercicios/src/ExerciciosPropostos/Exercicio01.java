package ExerciciosPropostos;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.println("Digite um n�mero: ");
		n1 = entrada.nextInt();
		System.out.println("Digite outro n�mero: ");
		n2 = entrada.nextInt();
		
		int resultado = (n1 + n2);
		
		System.out.println("O resultado � " + resultado);
		
		entrada.close();
		
	}

}