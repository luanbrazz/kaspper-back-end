package Matematica;

public class Circulo extends Figura {
	
	private double raio;
	private final double PI = Math.PI;
	

	public Circulo(String nome, String cor, double raio) {
		super(nome, cor);
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return this.PI * Math.pow(this.raio, 2);
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	public double getPI() {
		return PI;
	}
	
	
	
}
