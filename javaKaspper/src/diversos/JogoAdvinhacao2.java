package diversos;

import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhacao2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int opcao = 1;
		
		int numeroSorteado = new Random().nextInt(10) + 1;
		
		while (opcao == 1) {
			System.out.println("digite o numero: ");
			int palpite = sc.nextInt();

			if (palpite == numeroSorteado) {
				System.out.println("vc acertou");
				opcao = 2;
			} else {
				System.out.println("vc errou");
				System.out.println("Quer chutar um numero? ");
				System.out.println("1 - sim / 2 - não");
				opcao = sc.nextInt();
			}
		}

		sc.close();

	}

}
