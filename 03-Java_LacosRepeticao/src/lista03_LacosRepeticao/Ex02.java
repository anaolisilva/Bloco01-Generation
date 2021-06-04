package lista03_LacosRepeticao;

import java.util.Scanner;

public class Ex02 {
	/*Laços de repeticao - Java: 2
	 *  Autora: Ana Oliveira
	 *  04/06/21
	 *  Enunciado: Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR).
	 */

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int i = 0, par = 0, impar = 0;
		double x;
		
		for (; i < 10; i++) {
			System.out.println("Digite um número: ");
			x = entrada.nextDouble();
			
			if (x % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		
		entrada.close();
		
		System.out.println("Quantidade de números pares: " + par);
		System.out.println("Quantidade de números ímpares: " + impar);

	}

}
