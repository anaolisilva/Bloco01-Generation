package ex01;

import java.util.Scanner;

public class Ex08 {
	/* Programa��o sequencial Java: 8
	 *  Autora: Ana Oliveira
	 *  02/06/21
	 */

	public static void main(String[] args) {

			double fabrica, consumidor;
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Digite o custo de f�brica de um carro: ");		
			fabrica = entrada.nextDouble();
		
			consumidor = (1 + 0.28 + 0.45) * fabrica;

			System.out.println("O custo para o consumidor, considerando impostos a 45% e a cobran�a do "
					+ "distribuidor a 28%, �: R$" + consumidor);
			
			entrada.close();
			
	}

}
