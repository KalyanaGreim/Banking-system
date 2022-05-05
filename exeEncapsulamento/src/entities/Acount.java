package entities;

public class Acount {
	private int conta;
	private String titular;
	private double saldo;
	
	public Acount(int conta, String titular) {
		this.conta = conta;
		this.titular = titular;
	}

	public Acount(int conta, String titular, double saldoInicial) {
		this.conta = conta;
		this.titular = titular;
		deposito(saldoInicial);
	}

	public int getConta() {
		return conta;
	}


	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double dinheiro) {
		saldo += dinheiro;
	}
	
	public void saque(double dinheiro) {
		saldo -= dinheiro + 5.0;
	}
	
	public String toString() {
		return "Conta "
				+ conta
				+ ", Titular: "
				+ titular
				+ ", saldo: $ "
				+ String.format("%.2f", saldo);
	}

	
	
	
}
