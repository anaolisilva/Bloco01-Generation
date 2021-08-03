package ex01;

import java.util.Scanner;
public class Ex06 {
	/* Programação sequencial Java: 6
	 *  Autora: Ana Oliveira
	 *  02/06/21
	 */

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double x1, x2, y1, y2, dx, dy, d;
		
		System.out.println("Digite x1: ");		
		x1 = entrada.nextDouble();

		System.out.println("Digite y1: ");		
		y1 = entrada.nextDouble();
		
		System.out.println("Digite x2: ");		
		x2 = entrada.nextDouble();
		
		System.out.println("Digite y2: ");		
		y2 = entrada.nextDouble();
		
		dx = (x2 - x1) * (x2 - x1);
		dy = (y2 - y1) * (y2 - y1);
		
		d = Math.sqrt(dx + dy);
		
		System.out.println("A distância entre os dois pontos é: " + d);
		
		entrada.close();
		
	}
}
