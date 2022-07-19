package diversos.JOpition;

import javax.swing.JOptionPane;

public class CalculaMedia {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Digite seu nome");
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota"));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota"));
		double n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota"));

		double media = (n1 + n2 + n3) / 3;

		if (media >= 6) {
			JOptionPane.showConfirmDialog(null, "Sua media foi: " + media + "\nAluno Aprovado!!!");
		} else {
			JOptionPane.showConfirmDialog(null, "Sua media foi: " + media + "\nAluno Reprovado!!!");
		}
	}

}
