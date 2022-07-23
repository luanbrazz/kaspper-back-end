package exerciciosLogProg;

import java.util.Scanner;

// Ler dois números inteiros e exibir o quociente e o resto da divisão inteira entre eles.
public class Ex06 {

	public static void main(String[] args) {
		int n1, n2, resto;
		double quociente; 
		
		System.out.println("Digite 2 numeros:");
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		quociente =  ( n1 / n2);
		resto = n1 % n2;
		
		System.out.println("O quociente é " + quociente + " e o resto é " + resto);
		
		sc.close();

	}

}
