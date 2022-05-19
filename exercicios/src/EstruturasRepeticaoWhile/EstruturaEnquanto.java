package EstruturasRepeticaoWhile;

import java.util.Scanner;

public class EstruturaEnquanto {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int soma = 0;
		while (x != 0) {
//			soma = soma + x;
			soma += x;
			x = sc.nextInt();
		}
		
		System.out.println(soma);

		sc.close();
	}

}
