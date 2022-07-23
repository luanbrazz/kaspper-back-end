package exerciciosLogProg;

import java.util.Scanner;

//Converter um inteiro informado menor que 32 para sua representação em binário
public class Ex10 {

	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro para ser convertido para binario: ");
		numero = sc.nextInt();
		
		decimalParaBinario(numero);
		
		
		sc.close();
	}
	public static void decimalParaBinario(int n) {
		if (n > 0) {
			decimalParaBinario(n / 2);
			System.out.print(n % 2);
		}
	}
}
