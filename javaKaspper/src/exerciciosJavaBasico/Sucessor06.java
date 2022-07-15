package exerciciosJavaBasico;

import java.util.Scanner;

public class Sucessor06 {

	public static void main(String[] args) {

		int n1 = 0;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");

		n1 = sc.nextInt();
		
		int sucessor = n1 + 1;
		int antecessor = n1 - 1;
		
		System.out.println("Seu número antecessor é: " + antecessor);
		System.out.println("Seu número sucessor é: " + sucessor);
		sc.close();
	}

}
