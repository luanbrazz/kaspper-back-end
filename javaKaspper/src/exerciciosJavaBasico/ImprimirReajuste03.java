package exerciciosJavaBasico;

import java.util.Scanner;

public class ImprimirReajuste03 {

	public static void main(String[] args) {

		double sd;
		final double reajuste = 0.01;
		double sdtotal;

		System.out.print("Informe o seu saldo: ");

		Scanner sc = new Scanner(System.in);
		
		sd = sc.nextDouble();
		
		sdtotal = sd + (sd * reajuste);
		
		System.out.println("Seu saldo com o reajuste é de : " + sdtotal);
		
		sc.close();
	}

}
