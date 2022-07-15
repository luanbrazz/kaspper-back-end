package exerciciosJavaBasico;

import java.util.Scanner;

public class SalMinimo05 {

	public static void main(String[] args) {

		final double salMinimo = 788.00;
		double salUsuario;
		int qtdSalario;
		int resto;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o seu salário:");
		salUsuario = sc.nextDouble();
		
		qtdSalario = (int) (salUsuario / salMinimo);
		resto = (int) (salUsuario % salMinimo);
				
		System.out.println("Você recebe " + qtdSalario + " salário Mínimo" + " mais R$" + resto );
		sc.close();
	}

}
