package lista03_LacosRepeticao;

import java.util.Scanner;

public class Ex03 {
	/*Laços de repeticao - Java: 3
	 *  Autora: Ana Oliveira
	 *  04/06/21
	 *  Enunciado: Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
	21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
	idade for =-99.
	 */
	public static void main(String[] args) {
		int idade = 0, menor21 = 0, maior50 = 0;
		
		Scanner in = new Scanner(System.in);
		
		while(idade != -99) {
			System.out.println("Digite a idade: ");
			idade = in.nextInt();
			
			if(idade < 21 && idade > 0) {
				menor21++;
			} else if (idade > maior50) {
				maior50++;
			}
		}
		
		in.close();
		
		System.out.println("Pessoas com menos de 21 anos: " + menor21);
		System.out.println("Pessoas com mais de 21 anos: " + maior50);
	}
}
