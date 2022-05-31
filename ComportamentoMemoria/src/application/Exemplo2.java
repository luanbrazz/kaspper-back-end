package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Exemplo2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Produto[] vetor = new Produto[n];
		
		for (int i = 0; i < vetor.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vetor[i] = new Produto(nome, preco);
		}
		
		double soma = 0;
		for (int i = 0; i < n; i++) {
			soma += vetor[i].getPreco();
		}
		
		double media = soma / n;
		
		System.out.printf("MEDIA DE PREÇOS: %.2f%n", media);

		sc.close();

	}

}
