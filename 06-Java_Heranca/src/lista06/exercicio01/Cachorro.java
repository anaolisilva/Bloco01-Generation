package lista06.exercicio01;

public class Cachorro extends Animal {
	
	private boolean correr = true;

	public Cachorro (String nome, int idade, boolean correr) {
		super (nome, idade);
		this.correr = correr;
	}
	
	public void EmiteSom (String latido) {
		latido = "Au au au";
		System.out.println(latido);
	}

	
	public boolean isCorrer() {
		return correr;
	}

	public void setCorrer(boolean correr) {
		this.correr = correr;
	}
	

}
