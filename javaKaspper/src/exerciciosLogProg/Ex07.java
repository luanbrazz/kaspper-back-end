package exerciciosLogProg;

import java.util.Scanner;

//Solicitar a idade de uma pessoa em dias e informar na tela a idade em anos, meses e dias.
public class Ex07 {

	public static void main(String[] args) {
		
		final int umAno = 365;
		final int umMes = 30;
		int dias, idadeEmDias, ano, mes;
		
		
		System.out.println("Informe sua idade em dias: ");
		Scanner sc = new Scanner(System.in);
		
		idadeEmDias = sc.nextInt();
		
		ano = idadeEmDias / umAno;
		mes = ((idadeEmDias % umAno) / umMes);
		dias = ((idadeEmDias % umAno) % umMes);
		
		System.out.println("Sua idade é " + ano + " anos, " + mes + " meses e " + dias + " dias.");
		
		
		
		
		sc.close();
	}

}
