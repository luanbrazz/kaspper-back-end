package kaspperBank;

public class Conta {	// classes são tipos
	// propriedades são variaveis
	String titular;
	double saldo;
	int agencia;
	int numero;
	
	void depositar(double valor){
		this.saldo = this.saldo + valor;
	}
	
	void sacar(double valor){
		
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
		} else {
			System.out.println("Saldo insuficiente para sacar R$" + valor);
		}
	}
	
	public boolean transferir(double valor, Conta destino) {
		// conta do Ubiraci trasfere para Rosilene
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.saldo += valor;
			return true;
		} else {
			return false;
		}
		
	}
}
