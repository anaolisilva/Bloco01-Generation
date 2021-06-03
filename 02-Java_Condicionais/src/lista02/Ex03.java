package lista02;

import java.util.Scanner;

public class Ex03 {
	/*Laços condicionais - Java: 3
	 *  Autora: Ana Oliveira
	 *  03/06/21
	 */
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite a idade da pessoa: ");
		idade = entrada.nextInt();
		
		entrada.close();
		
		if (idade >= 10 && idade <=14) {
			System.out.println("Categoria: INFANTIL");
		} else if (idade >= 15 && idade < 18) {
			System.out.println("Categoria: JUVENIL");
		}else if (idade >= 18 && idade <= 25) {
			System.out.println("Categoria: ADULTO");
		}else {
			System.out.println("Idade inválida!");
		}
		
	}

}
