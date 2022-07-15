package exerciciosJavaBasico;

import java.util.Scanner;

public class Peças04 {

	public static void main(String[] args) {
		
		double porcIPI;
		
		@SuppressWarnings("unused")
		int cod1;
		double valorUn1;
		int qtdPeca1;
		
		@SuppressWarnings("unused")
		int cod2;
		double valorUn2;
		@SuppressWarnings("unused")
		int qtdPeca2;
		
		double vrTotal;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor do IPI:");
		porcIPI = sc.nextDouble();
		
		System.out.println("Informe o codigo da peça 1:");
		cod1 = sc.nextInt();
		
		System.out.println("Informe o valor da peça 1: ");
		valorUn1 = sc.nextDouble();
		
		System.out.println("Informe a quantidade a quantidade de peças 1:");
		qtdPeca1= sc.nextInt();
		
		System.out.println("Informe o codigo da peça 2:");
		cod2 = sc.nextInt();
		
		System.out.println("Informe o valor da peça 2: ");
		valorUn2 = sc.nextDouble();
		
		System.out.println("Informe a quantidade a quantidade de peças 2:");
		qtdPeca2= sc.nextInt();
		
		vrTotal = (((valorUn1 * qtdPeca1)+ (valorUn2 * valorUn2)) * ((porcIPI / 100)+ 1));
		
		System.out.println("A valor total da sua compra é de R$" + vrTotal);
		sc.close();
	}

}
