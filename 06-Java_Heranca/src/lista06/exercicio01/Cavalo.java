package lista06.exercicio01;

public class Cavalo extends Animal implements AnimalInterf {
	
	private boolean correr = true;
	
	public Cavalo (String nome, int idade, boolean correr) {
		super (nome, idade);
		this.correr = correr;
	}
	
	public void EmiteSom (String relincha) {
		relincha = "Relincha";
		System.out.println(relincha);
	}
	
	public void correr() {
		System.out.println("Cavalgando...");
	}

	public boolean isCorrer() {
		return correr;
	}

	public void setCorrer(boolean correr) {
		this.correr = correr;
	}
	
	

}
