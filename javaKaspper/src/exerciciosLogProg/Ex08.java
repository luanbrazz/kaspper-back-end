package exerciciosLogProg;

import java.util.Scanner;

//Dado que a fórmula para conversão de Fahrenheit para Celsius é C = 5/9 (F – 32), leu um
//valor de temperatura em Fahrenheit e exibi-lo em Celsius
public class Ex08 {

	public static void main(String[] args) {
		double fahrenheit, celsius;
		
		System.out.println("Informe o valor da temperatura em Fahrenheit: ");
		
		Scanner sc = new Scanner(System.in);
		fahrenheit = sc.nextDouble();
		
		celsius = (5 * (fahrenheit - 32)) / 9;
		
		System.out.println("O valor convertido é " + celsius + " Celsius.");
		
		sc.close();
		
	}

}
