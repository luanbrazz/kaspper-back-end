package diversos;
import java.util.Random;
import javax.swing.JOptionPane;

public class JogoAdvinhacao3 {

	public static void main(String[] args) {
		
		
		int numSorteado = new Random().nextInt(10)+1;
		
		String[] respostas = {
				"errou",
				"que isso torce pro vasco né?",
				"pede para sair...",
				"Desiste Cara... muito ruim"
				};
		
		int resp=JOptionPane.YES_OPTION;
		while(resp==JOptionPane.YES_OPTION) {
			int palpite = Integer.parseInt(JOptionPane.showInputDialog(null,"Seu Palpite? "));
			if(numSorteado==palpite) {
				System.out.println("Acertou");
				resp = JOptionPane.NO_OPTION;
			} else {
				int i =new Random().nextInt(3)+1;
				System.out.println(respostas[i]);
				
			}
			
			resp = JOptionPane.showConfirmDialog(null,"Deseja continuar","E aí Continua?",JOptionPane.YES_NO_OPTION);
			
		}
		
		System.out.println("o número sorteado foi: "+ numSorteado);

	}

}
