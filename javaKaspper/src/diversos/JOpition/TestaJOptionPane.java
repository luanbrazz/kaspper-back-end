package diversos.JOpition;

import javax.swing.JOptionPane;

public class TestaJOptionPane {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		int premio = 10;
		double salario = 123.56;
		float pl = 1000.00f;
		
		double valorTotal = salario + premio;
		
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade "));
		JOptionPane.showMessageDialog(null, "Olá " +  nome + " sua idade é: " + idade + "\nSalario + pl: " + valorTotal);
		
	}

}
