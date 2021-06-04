package lista03_LacosRepeticao;

import java.util.Scanner;

public class Ex05 {
	/*Laços de repeticao - Java: 5
	 *  Autora: Ana Oliveira
	 *  04/06/21
	 *  Crie um programa que leia um número do teclado até que encontre um
	número igual a zero. No final, mostre a soma dos números
	digitados.(DO...WHILE)
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int x, soma = 0;
		
		System.out.println("Programa de soma. Para quando você digitar 0.");
		
		do {
			System.out.println("Digite um número: ");
			x = in.nextInt();
			soma += x;
			
		} while(x != 0);
		
		in.close();
		
		System.out.println("Soma de todos os números: " + soma);

	}

}
