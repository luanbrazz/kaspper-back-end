package exerciciosLogProg;

import java.util.Scanner;

//Dado o tamanho da base e da altura de um retângulo, calcular a sua área e o seu
//perímetro.
public class Ex01 {

	public static void main(String[] args) {
		double base, altura, area;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o tamanho da base e em seguida sua altura");
		base = sc.nextDouble();
		altura = sc.nextDouble();
		
		area= ((base * altura) / 2);
		
		System.out.println("A área do triangulo é " + area + " unidMedida");
		
		sc.close();
	}

}
