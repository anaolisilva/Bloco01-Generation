package ex01;

import java.util.Scanner;

public class Ex07 {
	/* Programação sequencial Java: 7
	 *  Autora: Ana Oliveira
	 *  02/06/21
	 */
	
	public static void main (String args[]){
		
		int a, b, c, d, e, f;
		double x, y;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o coeficiente a: ");		
		a = entrada.nextInt();
		
		System.out.println("Digite o coeficiente b: ");		
		b = entrada.nextInt();		
		
		System.out.println("Digite o coeficiente c: ");		
		c = entrada.nextInt();		
		
		System.out.println("Digite o coeficiente d: ");		
		d = entrada.nextInt();		
		
		System.out.println("Digite o coeficiente e: ");		
		e = entrada.nextInt();		
		
		System.out.println("Digite o coeficiente f: ");		
		f = entrada.nextInt();	
		
		x = ((c * e)-(b * f))/(a * e)-(b * d);
		y =  ((a * f)-(c * d)) / (a * e)-(b * d);
		
		System.out.println("x = : " + x + "\ny = " + y);
		
		entrada.close();
		
	}
}
