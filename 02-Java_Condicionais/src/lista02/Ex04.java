package lista02;

import java.util.Scanner;

public class Ex04 {
	/*La�os condicionais - Java: 4
	 *  Autora: Ana Oliveira
	 *  03/06/21
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		double n = entrada.nextDouble();
		
		entrada.close();
		
		if (n % 2 == 0) {
			System.out.println("N�mero par. Raiz quadrada de " + n + " = " + (Math.sqrt(n)));
		} else {
			System.out.println("N�mero �mpar. " + n + "� = " + (Math.pow(n, 2)));
		}
	}
}
