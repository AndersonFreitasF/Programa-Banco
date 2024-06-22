package entidades;

public class Conta {
	private int numConta;
	private String nomeTitular;
	private double saldo;
	
	public int getNumConta() {
		return numConta;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public double getSaldo() {
		return saldo;
	}
	public Conta(int numConta, String nomeTitular, double depositoInicial) {
		
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
		depositar(depositoInicial);
	}
	
	public Conta(int numConta, String nomeTitular) {
		super();
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
		
	}
	public void depositar (double saldo) {
		this.saldo += saldo;
		
	}
	public void saque (double saldo) {
		this.saldo -= saldo + 5; 
	}
	public String toString() {
		return "Numera da conta:"  
				+ numConta
				+ ", Nome do titular:" 
				+nomeTitular 
				+ ", Saldo atual: " 
				+ String.format("%.2f", getSaldo());	
	}	
}




	