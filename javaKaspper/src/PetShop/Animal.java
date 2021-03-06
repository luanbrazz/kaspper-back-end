package PetShop;

public class Animal {
	
	private String nome;				// ATRIBUTOS
	private String especie;
	private int idade;
	
	public Animal(String nome, String especie, int idade) {		// CONSTRUTOR
		this.nome = nome;
		this.especie = especie;
		this.idade = idade;
	}
	
	
	public void vacinar() {						// METODOS 
		System.out.println("O animal foi vacinado");
	}
	
	public void consultar() {
		System.out.println("O animal foi consultado");
	}
	
	public void fazerAniversario() {
		this.idade ++;
		System.out.println("Agora o animal tem " + this.idade + " anos.");
	}

	// get é para fazer a leitura de dados / leitura do conteudo de um atributo
	public String getNome() {
		return nome;
	}

	// set é para inserir ou modificar o conteúdo de um atributo
	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEspecie() {
		return especie;
	}


	public void setEspecie(String especie) {
		this.especie = especie;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		if(idade > 0) {
			this.idade = idade;
			System.out.println("A idade agora é " + this.idade);
		} else {
			System.out.println("Não existe idade negativa!");
		}
		
	}
	
}
