package lista04Matrizes;

import java.util.*;
public class Ex02 {
	/*Vetores e matrizes - Java: 2
	 *  Autora: Ana Oliveira
	 *  07/06/21
	 *  Enunciado: 2- Faça um programa que receba 6 números inteiros e mostre: 
	• Os números pares digitados;  
	• A soma dos números pares digitados; 
	• Os números ímpares digitados; 
	• A quantidade de números ímpares digitados.
	 */
	public static void main(String[] args) {
		
		int[] vetor = new int[6];
		int somaPar = 0, quantImpar = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite 6 valores: ");
		
		for(int i=0; i < 6; i++) {
			vetor[i] = in.nextInt();
			
			if (vetor[i] % 2 == 0) {
				somaPar += vetor[i];
				
			}else 
				quantImpar++;
		}
		
		in.close();
		
		System.out.println("Pares:");
		for (int i = 0; i < 6; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + " ");
			}
		}
		
		System.out.println("\n\nÍmpares:");
		for (int i = 0; i < 6; i++) {
			if (vetor[i] % 2 != 0) {
				System.out.print(vetor[i] + " ");
			}
		}
		
		System.out.println("\n\nQuantidade de números ímpares digitados: " + quantImpar);
		System.out.println("Soma dos números pares: " + somaPar);
	}

}
