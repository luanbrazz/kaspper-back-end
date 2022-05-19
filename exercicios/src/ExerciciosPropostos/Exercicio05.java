package ExerciciosPropostos;

import java.util.Scanner;

public class Exercicio05 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int codUm, codDois, numUm, numDois; 
		
		double valorUnitUm, valorUnitDois, precoTotal;
		
		System.out.println("Digite o código da peça 1: ");
		codUm = entrada.nextInt();
		
		System.out.println("Digite a quantidade de peças a ser comprada da peça 1: ");
		numUm = entrada.nextInt();
		
		System.out.println("Digite o valor unitário da peça 1: ");
		valorUnitUm = entrada.nextDouble();
		
		System.out.println("Digite o código da peça 2: ");
		codDois = entrada.nextInt();
		
		System.out.println("Digite a quantidade de peças a ser comprada da peça 2: ");
		numDois = entrada.nextInt();
		
		System.out.println("Digite o valor unitário da peça 2: ");
		valorUnitDois = entrada.nextDouble();
		
		precoTotal = ((numUm * valorUnitUm) + (numDois * valorUnitDois));
				
		System.out.printf("O valor total a ser pago é: R$%.2f", precoTotal);
		
		entrada.close();
	}

}