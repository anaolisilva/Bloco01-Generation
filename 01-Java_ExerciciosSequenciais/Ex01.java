package ex01;

import java.util.Scanner;

public class Ex01 {
	/* Programa��o sequencial Java: 1
	 *  Autora: Ana Oliveira
	 *  02/06/21
	 */


	public static void main(String[] args) {
		int meses, dias, anos, idade;		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua idade em anos: ");		
		anos = entrada.nextInt();
		
		System.out.println("Quantos meses faz que voc� fez anivers�rio? ");		
		meses = entrada.nextInt();
		
		System.out.println("Quantos dias fazem desde o �ltimo dia que � igual ao seu dia de anivers�rio?");		
		dias = entrada.nextInt();
		
		idade = anos * 365 + meses * 30 + dias;
		
		System.out.println("Sua idade em dias �: " + idade + " dias.");

		entrada.close();
	}

}
