package lista06.exercicio01;

public class Preguica extends Animal {
	
	private boolean subirArvores = true;

	public Preguica (String nome, int idade, boolean subirArvores) {
		super (nome, idade);
		this.subirArvores = subirArvores;
	}
	
	public void EmiteSom (String som) {
		som = "ZzzzzzZzzzzz";
		System.out.println(som);
	}

	
	public boolean isSubirArvores() {
		return subirArvores;
	}

	public void setSubirArvores(boolean subirArvores) {
		this.subirArvores = subirArvores;
	}
	
	

}
