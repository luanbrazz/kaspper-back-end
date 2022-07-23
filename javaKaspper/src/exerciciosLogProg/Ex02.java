package exerciciosLogProg;

import java.util.Scanner;

//Dado o tamanho do lado de um quadrado, calcular a área e o perímetro do mesmo.
public class Ex02 {

	public static void main(String[] args) {
		double lado, area, perimetro;
		
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do lado do quadrado: ");
		lado = sc.nextDouble();
		
		perimetro = lado * 4;
		area = lado * lado;
		
		System.out.println("O perímetro do quadrado é " + perimetro + " unidMedida\nSua área é "
				+ area);
		sc.close();
		
	}

}
