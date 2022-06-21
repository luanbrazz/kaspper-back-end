package revisao;

public class metodo_revisao {
	public static void main(String[] args) {
		impressao();
		
		mensagem("Estudando java ...");
		
		System.out.println("O dobro do núemro é: " + dobro(2));
		
		System.out.println("O resultado da soma dos números é: " + calcular(2.3, 1.5));
		System.out.println("O resultado da soma dos números é: " + calcular(2, 1));
		System.out.println("O resultado da soma dos números é: " + calcular(2, 1,5));
		
		double[] notas = {8.9, 7.4, 5.6, 9};
		System.out.println(notas.length);
		System.out.println("A média das notas é: " + calcular(notas));
		System.out.printf("%s%.1f%n", "a média das notas é: ", calcular(notas));
		
		System.out.println("O fatorial é: " + fatorial(8));
	}
	
	// método sem retorno e sem passagem de parâmetro
	public static void impressao() {
		System.out.println("Java - Academia Kaspper.");
	}
	
	// método sem retorno, mas com passagem de parametro
	public static void mensagem(String msg) {
		System.out.println(msg);
	}
	
	// método com retorno
	public static int dobro(int numero) {
		return numero * 2;
	}
	
	// sobrecarga de métodos
	public static double calcular(double num1, double num2) {
		return num1 + num2;
	}
	
	public static int calcular(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int calcular(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	public static double calcular(double[] numeros) {
		double soma = 0;
		
//		for (int i = 0; i < numeros.length; i++) {
//			soma += numeros[i];
//		}
		
		for (double n : numeros) {
			soma += n;
		}
		return soma/numeros.length;
	}
	
	public static int fatorial(int numero) {
		int fatorial = 1;
		for(int contador = numero; contador > 0; contador --) {
			fatorial *= contador;
		}
		return fatorial;
	}
}
