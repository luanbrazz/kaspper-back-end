package EstruturaCondicional;

import java.util.Scanner;

public class EstruturaIfComposta {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.println("Que horas sao? ");
		hora = sc.nextInt();
		
		if(hora < 12) {
			System.out.println("bom dia!!");
		}
		else {
			System.out.println("boa tarde!!");
		}

		sc.close();
	}

}
