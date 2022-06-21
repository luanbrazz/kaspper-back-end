//exemplo 01 - Fazer um programa para ler um número inteiro N e a altura de N
//pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a
//altura média dessas pessoas.
package vetores.aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vetor = new double [n];
		
		for (int i = 0; i < n; i++) {
			vetor[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma += vetor[1];
		}
		
		double media = soma / n;
		
		System.out.println("A média das alturas é: " + media);
		
		sc.close();
	}

}
