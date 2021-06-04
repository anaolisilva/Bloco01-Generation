package lista03_LacosRepeticao;

import java.util.Scanner;

public class Ex05 {
	/*La�os de repeticao - Java: 5
	 *  Autora: Ana Oliveira
	 *  04/06/21
	 *  Crie um programa que leia um n�mero do teclado at� que encontre um
	n�mero igual a zero. No final, mostre a soma dos n�meros
	digitados.(DO...WHILE)
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int x, soma = 0;
		
		System.out.println("Programa de soma. Para quando voc� digitar 0.");
		
		do {
			System.out.println("Digite um n�mero: ");
			x = in.nextInt();
			soma += x;
			
		} while(x != 0);
		
		in.close();
		
		System.out.println("Soma de todos os n�meros: " + soma);

	}

}
