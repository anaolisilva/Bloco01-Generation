package lista03_LacosRepeticao;

import java.util.Scanner;

public class Ex06 {
	/*La�os de repeticao - Java: 5
	 *  Autora: Ana Oliveira
	 *  04/06/21
	 *  Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
	final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
	0(zero).(DO...WHILE)
	 */
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int x, soma = 0, cont = 0;
		double media;
		System.out.println("Programa: m�dia dos m�ltiplos de 3. O programa encerra quando voc� digita 0.");
		do {
			System.out.println("Digite um n�mero: ");
			x = in.nextInt();
			
			if(x % 3 ==0) {
				soma += x;
				cont++;
			}
		} while (x != 0);
		
		in.close();
		
		media = soma / cont;
		
		System.out.println("A m�dia dos m�ltiplos de 3 � " + media);
	}

}
