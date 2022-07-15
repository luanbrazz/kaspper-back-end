package IF;

public class TestaCondicionalIf {

	public static void main(String[] args) {
		
		System.out.println("Testando os comandos Condicionais");
		System.out.println("----------------------------------------");
		int idade = 15;
		boolean pais = true;
		
		if (idade >= 18 || pais == true) {
			System.out.println("Pode entrar...");
		} else {
			System.out.println("Não pode entrar...");
		}
		
	}

}

