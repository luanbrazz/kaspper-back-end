package ExerciciosPropostos2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		double numero;
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite um némero: ");
		numero = entrada.nextDouble();
		
		if (numero < 0 || numero > 100) {
			System.out.printf("%.2f esta fora de intervalo.", numero);
		} else if (numero < 25) {
			System.out.printf("%.2f esta no intervalo [0, 25]", numero);
		} else if (numero < 50) {
			System.out.printf("%.2f esta no intervalo [25, 50]", numero);
		} else if (numero < 75) {
			System.out.printf("%.2f esta no intervalo [50, 75]", numero);
		}else if (numero < 100) {
			System.out.printf("%.2f esta no intervalo [75, 100]", numero);
		}
		
		entrada.close();
	}

}