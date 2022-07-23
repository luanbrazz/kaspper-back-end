package exerciciosLogProg;

import java.util.Scanner;

// Ler um número inteiro e exibir o seu sucessor.
public class Ex05 {

	public static void main(String[] args) {
		System.out.println("Digite um número inteiro:");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		int proximoNumero = numero + 1;
		
		System.out.println("O proximo número é " + proximoNumero);
		sc.close();
		
	}

}
