package ExerciciosEstruturaRepeticaoFor;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int n = sc.nextInt();
		 
		 int in = 0;
		 int out = 0;
		 
		 for (int i=0; i<n; i++) {
			 int x = sc.nextInt();
			 if (x >= 10 && x <= 20) {
				 in += 1;
			 }
			 else {
				 out += 1;
			 }
		 }
		 
		 System.out.println("in: " + in);
		 System.out.println("out: " + out);
		 System.out.println("Fim do programa");

		 sc.close();
	}

}
