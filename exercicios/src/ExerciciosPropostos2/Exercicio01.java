package ExerciciosPropostos2;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double num;

		System.out.println("Digite um n�mero: ");
		num = entrada.nextDouble();

		if (num >= 0) {
			System.out.println("N�O NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}

		entrada.close();
	}

}