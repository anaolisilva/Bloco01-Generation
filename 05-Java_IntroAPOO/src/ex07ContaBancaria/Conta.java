package ex07ContaBancaria;

public class Conta {
	
	//Atributos
	private int numero, idadeDono, cpfDono;
	private String nomeDono;
	private double saldo;

	//Funções
	double depositar (double quantia) {
		saldo += quantia;
		return saldo;
	}
	
	double sacar (double quantia) {
		saldo -= quantia;
		return saldo;
	}
	
	public void checarSaldo () {
		System.out.println("Seu saldo é: " + saldo);
	}
	
	//getters e setters

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getIdadeDono() {
		return idadeDono;
	}

	public void setIdadeDono(int idadeDono) {
		this.idadeDono = idadeDono;
	}

	public int getCpfDono() {
		return cpfDono;
	}

	public void setCpfDono(int cpfDono) {
		this.cpfDono = cpfDono;
	}

	public String getNomeDono() {
		return nomeDono;
	}

	public void setNomeDono(String nomeDono) {
		this.nomeDono = nomeDono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}	
	
}
