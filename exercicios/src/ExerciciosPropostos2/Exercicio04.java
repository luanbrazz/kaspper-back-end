package ExerciciosPropostos2;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		int horaInicial, horaFinal, duracaoJogo;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite a hora inicial: ");
		horaInicial = entrada.nextInt();

		System.out.println("Digite a hora final: ");
		horaFinal = entrada.nextInt();

		if (horaFinal <= horaInicial) {
			horaFinal += 24;
			duracaoJogo = horaFinal - horaInicial;

		} else {
			duracaoJogo = horaFinal - horaInicial;

		}

		System.out.printf("O jogo durou %d hora(s).", duracaoJogo);

		entrada.close();

	}

}