package diversos;

import javax.swing.JOptionPane;

public class ResolucaoDesafio2 {

	public static void main(String[] args) {
		String[] cliente = new String[3];
        double[] precoProduto = new double[3];
        double[] totalCompra = new double[3];
        int a = 0;
        int s = 0;
        int d = 0;
        while (a < cliente.length) {
            cliente[a] = JOptionPane.showInputDialog(null, "Informe o seu nome aqui: ");
            a++;

 
            while (s < precoProduto.length) {
                precoProduto[s] = Double.parseDouble(JOptionPane.showInputDialog(null, "O Preço do produto é de R$: "));
                s++;
            }
            totalCompra[d] = (precoProduto[0] + precoProduto[1] + precoProduto[2]);
            d = d + 1;
            s = 0;

        }
        
        JOptionPane.showMessageDialog(null,     cliente[0], "Nome do Cliente:",  -1);
        JOptionPane.showMessageDialog(null, totalCompra[0], "O total da compra é de R$: ", 1);
        
        JOptionPane.showMessageDialog(null,     cliente[1], "Nome do Cliente:",  -1);
        JOptionPane.showMessageDialog(null, totalCompra[1], "O total da compra é de R$: ", 1);
        
        JOptionPane.showMessageDialog(null,     cliente[2], "Nome do Cliente:",  -1);
        JOptionPane.showMessageDialog(null, totalCompra[2], "O total da compra é de R$: ", 1);
        
        JOptionPane.showMessageDialog(null, "Obrigado por comprar conosco!");

	}

}
