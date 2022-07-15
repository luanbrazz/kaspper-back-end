package exerciciosJavaBasico;

import java.util.Scanner;

public class ImprimirMedia02 {

	public static void main(String[] args) {

		int n1;
		int n2;
		int n3;
		int n4;
		int n5;
		int n6;
		
		double media1;
		double media2;
		double somaMedias;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inicie digitando 3 numeros inteiros...");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		media1 = (n1 + n2 + n3) / 3;
		System.out.println("A media dos 3 numeros é " + media1);
		
		System.out.println("Agora digite mais 3 numeros inteiros...");
		n4 = sc.nextInt();
		n5 = sc.nextInt();
		n6 = sc.nextInt();
		media2 = (n4 + n5 + n6) / 3;
		System.out.println("A media dos 3 numeros é " + media2);
		
		somaMedias = media1 + media2;
		System.out.println("A soma das duas medias é " + somaMedias);
		
		sc.close();
		
	}

}
