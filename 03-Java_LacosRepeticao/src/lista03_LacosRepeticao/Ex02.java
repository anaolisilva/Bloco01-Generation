package lista03_LacosRepeticao;

import java.util.Scanner;

public class Ex02 {
	/*La�os de repeticao - Java: 2
	 *  Autora: Ana Oliveira
	 *  04/06/21
	 *  Enunciado: Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR).
	 */

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int i = 0, par = 0, impar = 0;
		double x;
		
		for (; i < 10; i++) {
			System.out.println("Digite um n�mero: ");
			x = entrada.nextDouble();
			
			if (x % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		
		entrada.close();
		
		System.out.println("Quantidade de n�meros pares: " + par);
		System.out.println("Quantidade de n�meros �mpares: " + impar);

	}

}
