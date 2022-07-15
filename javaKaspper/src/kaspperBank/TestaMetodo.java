package kaspperBank;

public class TestaMetodo {
	public static void main(String[] args) {
		
		Conta contaDoUbiraci = new Conta();
		Conta contaDaRosilene = new Conta();
		
		contaDoUbiraci.saldo = 2000;
		contaDaRosilene.saldo = 0;
		
//		contaDoUbiraci.depositar(50);
//		contaDaRosilene.depositar(150);
		
//		contaDoUbiraci.sacar(120);
//		contaDaRosilene.sacar(56);
		
		contaDoUbiraci.transferir(100, contaDaRosilene);
		
		System.out.println("Saldo Ubiraci: " + contaDoUbiraci.saldo);
		System.out.println("Saldo Rosilene: " + contaDaRosilene.saldo);
		
	}
}

