//	Fazer um programa para ler um número inteiro N e uma matriz de
//	ordem N contendo números inteiros. Em seguida, mostrar a diagonal
//	principal e a quantidade de valores negativos da matriz.

package matrizes;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] mat = new int[n][n];	// ARRANJO BIDIMENSIONAL NxN

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("Diagonal Principal:");
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();

		int contar = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					contar++;
				}
			}
		}
		System.out.println("Números negativos = " + contar);

		sc.close();
	}
}
