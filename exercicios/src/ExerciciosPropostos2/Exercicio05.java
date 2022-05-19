package ExerciciosPropostos2;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		int codigo, quantidade;
		double preco, valorTotal;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o código de seu pedido: ");
		codigo = entrada.nextInt();
		
		System.out.println("Digite a quantidade: ");
		quantidade = entrada.nextInt();
		
		
		if (codigo == 1) {
			preco = 4.0;
			valorTotal = preco * quantidade;
			System.out.printf("O valor total é R$" + valorTotal);
		}
		else if (codigo == 2) {
			preco = 4.5;
			valorTotal = preco * quantidade;
			System.out.printf("O valor total é R$" + valorTotal);
		}
		else if (codigo == 3) {
			preco = 5.0;
			valorTotal = preco * quantidade;
			System.out.printf("O valor total é R$" + valorTotal);
		}
		else if (codigo == 4) {
			preco = 2.0;
			valorTotal = preco * quantidade;
			System.out.printf("O valor total é R$" + valorTotal);
		}
		else if (codigo == 5) {
			preco = 1.5;
			valorTotal = preco * quantidade;
			System.out.printf("O valor total é R$" + valorTotal);
		}
		else {
			System.out.println("Código inválido!");
		}
		
						
		entrada.close();
	}

}