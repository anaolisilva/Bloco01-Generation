package lista04Matrizes;

import java.util.Scanner;

public class Ex03 {
	/*Vetores e matrizes - Java: 3
	 *  Autora: Ana Oliveira
	 *  07/06/21
	 *  Enunciado: Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.*/

	public static void main(String[] args) {
		double[][] matriz = new double[3][3];
		int maior10 = 0;
		
		Scanner in = new Scanner(System.in);
		
		for(int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.printf("Digite a posição[%d][%d] da matriz[3][3]: ", l, c);
				matriz[l][c] = in.nextDouble();
				
				if (matriz[l][c] > 10)
					maior10++;
			}
		}
		
		in.close();
		
		System.out.println("\nA matriz tem " + maior10 + " valores maiores do que 10.\nEles são: ");
		
		for(int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				if (matriz[l][c] > 10)
					System.out.print(matriz[l][c] + " ");				
			}
		}
	}

}
