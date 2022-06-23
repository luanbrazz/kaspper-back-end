package PetShop;

public class Principal {

	public static void main(String[] args) {
		
		// instanciar um objeto da classe animal
		Animal a1 = new Animal("Rex", "cachorro", 2);
		Animal a2 = new Animal("Bixano", "gato", 1);
		Animal a3 = new Animal("Loro", "passarinho", 3);
		
//		System.out.println("O animal " + a1.nome + " é um " + a1.especie + " ele tem " + a1.idade + " anos." );
//		System.out.println("O animal " + a2.nome + " é um " + a2.especie + " ele tem " + a2.idade + " anos." );
//		System.out.println("O animal " + a3.nome + " é um " + a3.especie + " ele tem " + a3.idade + " anos." );
		
		System.out.println("O animal " + a1.getNome() + " é um " + a1.getEspecie() + " ele tem " + a1.getIdade() + " anos." );
		System.out.println("O animal " + a2.getNome() + " é um " + a2.getEspecie() + " ele tem " + a2.getIdade() + " anos." );
		System.out.println("O animal " + a3.getNome() + " é um " + a3.getEspecie() + " ele tem " + a3.getIdade() + " anos." );
		
		a1.vacinar();
		a1.consultar();
		a1.fazerAniversario();
		
		a1.setIdade(56);
		//a1.idade = -3;
	}
	
	
}
