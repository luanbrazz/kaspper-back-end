package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
//		DESAFIO
//		armazenar o 32 como uma contante e o calculo 5/9 tambem como 
//		uma constante
//		C = (F - 32) * 5.0/9.0;
		
	

		final double FATOR = 5.0 / 9.0;
		final double AJUSTE = 32;

		double fahrenheit;
		
		fahrenheit = 86;
		double celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado eh: " + celsius + "°C");
		
		fahrenheit = 0;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado eh: " + celsius + "°C");
		
	}
}
