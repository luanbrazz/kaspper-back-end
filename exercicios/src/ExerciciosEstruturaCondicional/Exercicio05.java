package ExerciciosEstruturaCondicional;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();

		double total;

		if (codigo == 1) {
			total = quantidade * 4.0;
		} else if (codigo == 2) {
			total = quantidade * 4.5;
		} else if (codigo == 3) {
			total = quantidade * 5.0;
		} else if (codigo == 4) {
			total = quantidade * 2.0;
		} else if (codigo == 5) {
			total = quantidade * 1.5;
		} else {
			System.out.println("PRODUTO INEXISTENTE");
			total = 0.0;
		}

		if (total != 0.0) { 
			System.out.printf("Total: R$ %.2f%n", total);
		}
		

		sc.close();
	}
}
