package Biblioteca;

public class Livro {
	
	private String nome;
	private String autor;
	private int quantidadeLivro;
	private int quantLivrosDisponiveis;
	
	private final double valorEmpDiario = 3.10;
	
	public Livro(String nome, String autor, int quantidadeLivro) {
	
		this.nome = nome;
		this.autor = autor;
		this.quantidadeLivro = quantidadeLivro;
		this.quantLivrosDisponiveis = quantidadeLivro;
	}
	
	public void mostrarFicha() {
		System.out.println("O nome do livro é: " + this.nome);
		System.out.println("O nome do autor é: " + this.autor);
		System.out.println("Temos " + this.quantLivrosDisponiveis + " livros disponíveis");
		System.out.println("-----------------------------------------------------");
	}
	
	public boolean verificarDisponibilidade() {
		if(this.quantLivrosDisponiveis > 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void emprestarLivro() {
		if(verificarDisponibilidade()) {
			this.quantLivrosDisponiveis -= 1;
			System.out.println("O livro foi emprestado com sucesso");
		}else {
			System.out.println("Não temos esse livro disponível para empréstimo");
		}
	}
	
	public void devolverLivro() {
		if(this.quantLivrosDisponiveis < this.quantidadeLivro) {
			this.quantLivrosDisponiveis += 1;
			System.out.println("Livro devolvido com sucesso!");
			System.out.println("Agora temos " + this.quantLivrosDisponiveis + " livros disponiveis");
			
		}else {
			System.out.println("Nenhum livro desse está emprestado atualmente");
		}
		
	}
	
	public double calcularValor(int quantDias) {
		if(this.quantLivrosDisponiveis < this.quantidadeLivro) {
			return quantDias * this.valorEmpDiario;
		}else {
			System.out.println("Esse livro não está emprestado");
			return 0;
		}
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getQuantidadeLivro() {
		return quantidadeLivro;
	}

	public void setQuantidadeLivro(int quantidadeLivro) {
		this.quantidadeLivro = quantidadeLivro;
	}

	public int getQuantLivrosDisponiveis() {
		return quantLivrosDisponiveis;
	}

	public void setQuantLivrosDisponiveis(int quantLivrosDisponiveis) {
		this.quantLivrosDisponiveis = quantLivrosDisponiveis;
	}

	
	
	
	

}