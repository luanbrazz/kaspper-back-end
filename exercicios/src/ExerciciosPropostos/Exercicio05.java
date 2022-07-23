package ExerciciosPropostos;

import java.util.Scanner;

public class Exercicio05 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int codUm, codDois, numUm, numDois; 
		
		double valorUnitUm, valorUnitDois, precoTotal;
		
		System.out.println("Digite o c�digo da pe�a 1: ");
		codUm = entrada.nextInt();
		
		System.out.println("Digite a quantidade de pe�as a ser comprada da pe�a 1: ");
		numUm = entrada.nextInt();
		
		System.out.println("Digite o valor unit�rio da pe�a 1: ");
		valorUnitUm = entrada.nextDouble();
		
		System.out.println("Digite o c�digo da pe�a 2: ");
		codDois = entrada.nextInt();
		
		System.out.println("Digite a quantidade de pe�as a ser comprada da pe�a 2: ");
		numDois = entrada.nextInt();
		
		System.out.println("Digite o valor unit�rio da pe�a 2: ");
		valorUnitDois = entrada.nextDouble();
		
		precoTotal = ((numUm * valorUnitUm) + (numDois * valorUnitDois));
				
		System.out.printf("O valor total a ser pago �: R$%.2f", precoTotal);
		
		entrada.close();
	}

}