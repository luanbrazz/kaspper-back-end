package kaspperBank;

public class CriarConta {

	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		
		c1.saldo = 1000;
		c2.saldo = 2000;
		c1.saldo +=500;
		
		System.out.println("Saldo conta 1: " + c1.saldo);
		System.out.println("Saldo conta 1: " + c2.saldo);
	}

}
