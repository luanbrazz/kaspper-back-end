package revisao;

public class aula02 {

	public static void main(String[] args) {
		
		int posicao = 9;
		switch (posicao) {
		case 1:
			System.out.println("Você chegou em 1° lugar");
			break;
		case 2:
			System.out.println("Você chegou em 2° lugar");
			break;
		case 3:
			System.out.println("Você chegou em 3° lugar");
			break;
		case 4: case 5: case 6:
			System.out.println("Você vai ganhar um premio de participação!");
			break;
		default:
			System.out.println("Nenhuma premiação");
			break;
		}
	}

}
