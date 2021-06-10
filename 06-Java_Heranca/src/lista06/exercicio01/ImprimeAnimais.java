package lista06.exercicio01;

public class ImprimeAnimais {

	public static void main(String[] args) {
		
		Cachorro rex = new Cachorro("Rex, o cão", 3, true);
		Cavalo spirit = new Cavalo("Spirit, o cavalo", 5, true);
		Preguica bob = new Preguica("Bob, a preguiça", 8, true);
		TestaAnimais a1 = new TestaAnimais();
		
		System.out.println("===Cachorro===");
		System.out.println("Nome: " + rex.getNome() + "\nIdade: " + rex.getIdade() + " anos." +"\nCorre? " + rex.isCorrer());
		a1.EmiteSom(rex);
		a1.correr(rex);
		System.out.println();
		
		System.out.println("===Cavalo===");
		System.out.println("Nome: " + spirit.getNome() + "\nIdade: " + spirit.getIdade() + " anos.\nCorre? " + spirit.isCorrer());
		a1.EmiteSom(spirit);
		a1.correr(spirit);
		System.out.println();
		
		System.out.println("===Preguiça===");
		System.out.println("Nome: " + bob.getNome() + "\nIdade: " + bob.getIdade() + " anos.\nSobe em árvores? " 
		+ bob.isSubirArvores());
		a1.EmiteSom(bob);		
		a1.correr(bob);

	}

}
