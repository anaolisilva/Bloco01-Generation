package lista06.exercicio01;

public class Animal implements AnimalInterf {
	
	private String nome;
	private int idade;
	
	public void EmiteSom (String som) {

	}
	
	public Animal (String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void correr() {		
	}
	
	

}
