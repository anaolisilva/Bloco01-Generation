package ex01;

import java.util.Scanner;

public class Ex04 {
	/* Programação sequencial Java: 4
	 *  Autora: Ana Oliveira
	 *  02/06/21
	 */

	public static void main(String[] args) {
		int a, b, c;
		double r, s, d;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a: ");		
		a = entrada.nextInt();
		System.out.println("Digite b: ");		
		b = entrada.nextInt();
		System.out.println("Digite c: ");		
		c = entrada.nextInt();

		r = (a + b) * (a + b);
		s = (b + c) * (b + c);

		d = (r + s)/2;
		
		System.out.println("D = " + d);

		entrada.close();
	}

}
