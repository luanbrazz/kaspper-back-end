package diversos;

import java.util.Random;

import javax.swing.JOptionPane;

public class JogoDaAdvinhacao {

	public static void main(String[] args) {

		int numeroSorteado = new Random().nextInt(10) + 1;
		int palpite = Integer.parseInt(JOptionPane.showInputDialog(null, "Chute um numero"));

		if (numeroSorteado == palpite) {
			System.out.println("Acertou!");
		} else {
			System.out.println("Errou!!!");
			System.out.println("O número sorteado foi " + numeroSorteado);
		}
	}

}
