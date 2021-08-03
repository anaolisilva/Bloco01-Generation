package ex01;

import java.util.Scanner;

public class Ex01 {
	/* Programação sequencial Java: 1
	 *  Autora: Ana Oliveira
	 *  02/06/21
	 */


	public static void main(String[] args) {
		int meses, dias, anos, idade;		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite sua idade em anos: ");		
		anos = entrada.nextInt();
		
		System.out.println("Quantos meses faz que você fez aniversário? ");		
		meses = entrada.nextInt();
		
		System.out.println("Quantos dias fazem desde o último dia que é igual ao seu dia de aniversário?");		
		dias = entrada.nextInt();
		
		idade = anos * 365 + meses * 30 + dias;
		
		System.out.println("Sua idade em dias é: " + idade + " dias.");

		entrada.close();
	}

}
