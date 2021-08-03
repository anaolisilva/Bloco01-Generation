package ex01;

import java.util.Scanner;

public class ex02 {
	/* Programação sequencial Java: 2
	 *  Autora: Ana Oliveira
	 *  02/06/21
	 */

	public static void main(String[] args) {
		
		int idade, anos, meses, dias;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua idade em dias: ");		
		idade = entrada.nextInt();
		
		anos = idade / 365;
		idade = idade % 365;
		meses = idade / 30;
		dias = idade % 30;
		
		System.out.println("Você tem " + anos + " anos, " + meses + " meses e " + dias + " dias.");
		entrada.close();
		
	}

}
