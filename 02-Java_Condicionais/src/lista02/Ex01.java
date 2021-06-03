package lista02;

import java.util.Scanner;

public class Ex01 {

	/*Laços condicionais - Java: 1
	 *  Autora: Ana Oliveira
	 *  03/06/21
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int a, b, c, maior = 0;
		System.out.println("Digite três némeros: ");
		a = entrada.nextInt();
		b = entrada.nextInt();
		c = entrada.nextInt();
		
		entrada.close();
		
		if (a > b && a > c) {
			maior = a;
		} else if (b > a && b > c) {
			maior = b;
		}else if (c > a && c > b) {
			maior = c;
		}
		
		System.out.println("\nO maior número é: " + maior);
		
	}

}
