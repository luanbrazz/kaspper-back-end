package exerciciosLogProg;

import java.util.Scanner;

//Dado o tamanho do raio de uma circunferência, calcular a área 
public class Ex03 {

	public static void main(String[] args) {
		double raio, circunferencia, area;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do lado do raio: ");
		raio = sc.nextDouble();
		circunferencia = Math.PI * raio * raio;
		
		area  = Math.PI* (raio * raio);
		
		System.out.println("O valor da circunferencia é " + circunferencia + " e a área é " + area);

		sc.close();

	}

}
