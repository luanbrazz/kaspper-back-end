package vetores.desafio.entidades;

public class Aluguel {

	private String name;
	private String email;

	public Aluguel(String nome, String email) {
	this.name = nome;
	this.email = email;
	}

	public String getNome() {
		return name;
	}

	public void setNome(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return name + ", " + email;
	}
}