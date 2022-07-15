package exerciciosJavaBasico;

import java.util.Scanner;

public class LerIdade01 {

	public static void main(String[] args) {
		
		final int diasDoAno = 365;
		final int diasDoMes = 30;
		int dias ;
		int meses;
		int anos;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe sua idade: ");
		System.out.print("Anos: ");
		anos = sc.nextInt();
		
		System.out.print("Meses: ");
		meses = sc.nextInt();
		
		System.out.print("Dias: ");
		dias = sc.nextInt();
		
		dias += (anos * diasDoAno) + (meses * diasDoMes);
		
		System.out.println("Sua idade em dias é " + dias + "dias");
		
		sc.close();
	}

}
