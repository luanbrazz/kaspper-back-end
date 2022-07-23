package exerciciosLogProg;

import java.util.Scanner;

//Faça um algoritmo que calcule e apresente o valor do volume de uma lata de óleo, dado
//seu raio e sua altura.
public class Ex09 {

	public static void main(String[] args) {
//		VOLUME = 3.14159 * R2 * ALTURA
		double volume, raio, altura;
		
		System.out.println("Informe o raio e em seguida a altura da lata de oleo: ");
		
		Scanner sc = new Scanner(System.in);
		
		altura = sc.nextDouble();
		raio = sc.nextDouble();
		
		volume = Math.PI * (Math.pow(raio, 2)) * altura;
		
		System.out.println("O volume é " + volume + " unidMedida.");
		
		sc.close();
		
	}

}
