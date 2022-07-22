/*criar um jogo que receba o numero sorteado e compare-o
com um palpite do usuario
 
caso o usuario acerte o programa deve informar que ele acertou.
 
no caso de errar o programa deve informar o erro e perguntar se o usuário deseja continuar... se a resposta for afirmativa o jogo deve perguntar novamente qual o palpite do usuário até que o mesmo acerte ou não queira mais jogar...
 
ao final do programa, caso ele encerre antes, o programa deve informar o número sorteado.
 
melhoria: o programa deve registrar a quantidade de chutes do usuário e ao final quando ele acertar informar em quantos palpites ele acertou.
 
e quando errar informar "insultos leves"....*/

package diversos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class DesafioJogoAdvinhacao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opcao = 1;

		int contadorAcertos = 0;
		int contadorJogos = 0;

		List<String> listaMensagems = new ArrayList<String>();
		listaMensagems.add("Você errou!!!");
		listaMensagems.add("Ihhhh... Vai ter que jogar de novo!!!");
		listaMensagems.add("Caramba, você é muito ruim einh!!!");
		listaMensagems.add("Essa foi quase!!!");
		listaMensagems.add("Poxa, não foi dessa vez!!! Não desista!!!");

		System.out.println("BEM VINDO AO JOGO DE ADVINHAÇÃO!");

		while (opcao == 1) {
			int numeroSorteado = new Random().nextInt(10) + 1;

			// Math.random é utilizado para gerar um número aleatório entre 0 e 1,
			// multiplica por 4.9 para gerar algo até 4,9 e realiza Cast para int para tirar
			// a casa decimal.
			Integer numeroRandomico = (int) (Math.random() * 4.9);

			System.out.println("Chute um número de 0 a 10: ");
			int palpite = sc.nextInt();

			if (palpite == numeroSorteado) {
				contadorAcertos++;
				contadorJogos++;
				System.out.println("Você acertou, parabéns!!!");
				System.out.println("Deseja jogar novamente?");
				System.out.println("1- SIM \n2- NÃO");
				opcao = sc.nextInt();
				if (opcao != 1 && opcao != 2) {
					System.out.println("Numero digitado inválido! \nJogo Encerrado!");
					opcao = 2;
				} else {
					numeroSorteado = new Random().nextInt(10) + 1;
				}

			} else {
				contadorJogos++;
				System.out.println(listaMensagems.get(numeroRandomico));
				System.out.println("Deseja tentar novamente?");
				System.out.println("1- SIM \n2- NÃO");
				opcao = sc.nextInt();
				if (opcao != 1 && opcao != 2) {
					System.out.println("Numero digitado inválido! \nJogo Encerrado!");
					opcao = 2;
				}
			}
		}

		System.out.println("Você jogou " + contadorJogos + "vezes e acertou " + contadorAcertos + "tentativas!");

		sc.close();
	}
}