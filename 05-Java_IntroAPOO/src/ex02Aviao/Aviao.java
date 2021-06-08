package ex02Aviao;

public class Aviao {

	//Atributos de um avião
	
	private String modelo, ciaAerea;
	private double combustivel, velocidade, rota, tempoNoAr;
	private int numPassageiros;
	private boolean turbinas;
	
	//funções do aviao
	
	void decolar () {
		
	}
	
	public double voar () {
		rota = tempoNoAr * velocidade;
		return rota;		
	}
	
	void aterrissar () {
		
	}
	
	//getters e setters
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCiaAerea() {
		return ciaAerea;
	}

	public void setCiaAerea(String ciaAerea) {
		this.ciaAerea = ciaAerea;
	}

	public double getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(double combustivel) {
		this.combustivel = combustivel;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	public double getTempoNoAr() {
		return tempoNoAr;
	}

	public void setTempoNoAr(double tempoNoAr) {
		this.tempoNoAr = tempoNoAr;
	}

	public int getNumPassageiros() {
		return numPassageiros;
	}

	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}

	public boolean isTurbinas() {
		return turbinas;
	}

	public void setTurbinas(boolean turbinas) {
		this.turbinas = turbinas;
	}

	
}
