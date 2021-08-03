package ex01;

import java.util.Scanner;

public class Ex05 {
	/* Programação sequencial Java: 5
	 *  Autora: Ana Oliveira
	 *  02/06/21
	 */

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		double n1, n2, n3, media;
		
		System.out.println("Digite a nota 1: ");		
		n1 = entrada.nextDouble();
		System.out.println("Digite a nota 2: ");		
		n2 = entrada.nextDouble();
		System.out.println("Digite a nota 3: ");		
		n3 = entrada.nextDouble();
		
		media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10;
		
		System.out.println("A média do aluno é: " + media);
		
		entrada.close();

	}

}
