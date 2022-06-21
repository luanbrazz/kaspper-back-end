//Fazer um programa para ler um número inteiro N e os dados (nome e
//preço) de N Produtos. Armazene os N produtos em um vetor. Em
//seguida, mostrar o preço médio dos produtos.
package vetores.aplicacao;

import java.util.Locale;
import java.util.Scanner;

import vetores.entidades.Produto;

public class Programa2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Produto[] vetor = new Produto[n];
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vetor[i] = new Produto(nome, preco);
		}
		
		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma += vetor[i].getPreco();
		}
		
		double media = soma /n;
		
		System.out.printf("O preço médio dos produtos é: %.2f%n ", media);
		
		sc.close();
	}

}
