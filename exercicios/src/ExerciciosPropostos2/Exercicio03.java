package ExerciciosPropostos2;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		int num1, num2, resto1, resto2;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite dois numeros INTEIROS e de ENTER: ");
		num1 = entrada.nextInt();
		num2 = entrada.nextInt();

		resto1 = num1 % num2;
		resto2 = num2 % num1;

		if (resto1 == 0 || resto2 == 0) {
			System.out.println("São multiplos");
		} else {
			System.out.println("Não são multiplos");
		}

		entrada.close();

	}

}