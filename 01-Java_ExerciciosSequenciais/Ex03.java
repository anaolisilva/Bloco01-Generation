package ex01;

import java.util.Scanner;

public class Ex03 {
	/* Programação sequencial Java: 3
	 *  Autora: Ana Oliveira
	 *  02/06/21
	 */

	public static void main(String[] args) {
		int duracao, horas, min, seg;		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a duração do evento em segundos: ");		
		duracao = entrada.nextInt();
		
		
		horas = duracao / (60*60);
		duracao = duracao % (60*60);
		min = duracao / 60;
		seg = duracao % 60;
		
		System.out.println("A duração do evento foi de " + horas + "H " + min + "min " + seg + "s");

		entrada.close();

	}

}
