package lista02;

import java.util.Scanner;

public class Ex02 {
	/*Laços condicionais - Java: 2
	 *  Autora: Ana Oliveira
	 *  03/06/21
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Digite três números inteiros: ");
		a = entrada.nextInt();
		b = entrada.nextInt();
		c = entrada.nextInt();
		
		entrada.close();
		
		int i;
		
		if (a > b) {
			i = a;
			a = b;
			b = i;
		} 
		if (a > c) {
			i = a;
			a = c;
			c = i;
		}
		if (b > c) {
			i = c;
			c = b;
			b = i;
		}
		
		System.out.println("Os números em ordem crescente são:\n" + a + " " + b + " " + c);
		
	}

}
