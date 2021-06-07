package lista04Matrizes;

import java.util.Scanner;

public class Ex04 {
	/*Vetores e matrizes - Java: 4
	 *  Autora: Ana Oliveira
	 *  07/06/21
	 *  Enunciado: 
	 4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
		(1) somar as duas matrizes 
		(2) subtrair a primeira matriz da segunda 
		(3) adicionar uma constante as duas matrizes
		(4) imprimir as matrizes 
		Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor 
		da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.*/

	public static void main(String[] args) {
		
		double [][] m1 = new double[2][2];
		double [][] m2 = new double[2][2];
		double [][] mR = new double[2][2];
		int usuario = 0;
		double constante;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite a primeira matriz 2 x 2: ");
		for(int l=0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {
				System.out.printf("[%d][%d] = ", l, c);
				m1[l][c] = in.nextDouble();
			}
		}
		
		System.out.println("\nDigite a segunda matriz 2x2: ");
		for(int l=0; l < 2; l++) {
			for (int c = 0; c < 2; c++) {
				System.out.printf("[%d][%d] = ", l, c);
				m2[l][c] = in.nextDouble();
			}
		}
		
		System.out.println("==================================================================");
		System.out.println("Escolha uma das opções abaixo: ");
		System.out.println("DIGITE 1 para somar as matrizes\nDIGITE 2 para subtrair primeira matriz da segunda"
				+ "\nDIGITE 3 para adicionar uma constante as duas matrizes\nDIGITE 4 para imprimir as matrizes");
		usuario = in.nextInt();
		
		System.out.println("==================================================================");
		
		if (usuario == 1) {
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					mR[l][c] = m1[l][c] + m2[l][c];
				}
			}
			
			System.out.println("\nMatriz resultante da soma (m1 + m2): ");
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					System.out.printf("\t %.2f \t", mR[l][c]);
				}
				System.out.println();
			}
		} else if (usuario == 2) {
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					mR[l][c] = m2[l][c] - m1[l][c];
				}
			}
			
			System.out.println("\nMatriz resultante da subtração (m2 - m1): ");
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					System.out.printf("\t %.2f \t", mR[l][c]);
				}
				System.out.println();
			}
		} else if (usuario == 3) {
			System.out.println("Digite a constante: ");
			constante = in.nextDouble();
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					m1[l][c] = m1[l][c] + constante;
					m2[l][c] = m2[l][c] + constante;
				}
			}
			System.out.println("\nMatrizes resultantes da adição da constante: ");
			System.out.println("M1:");
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					System.out.printf("\t %.2f \t", m1[l][c]);
				}
				System.out.println();
			}
			System.out.println("\nM2:");
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					System.out.printf("\t %.2f \t", m2[l][c]);
				}
				System.out.println();
			}
		} else if (usuario == 4) {
			System.out.println("M1:");
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					System.out.printf("\t %.2f \t", m1[l][c]);
				}
				System.out.println();
			}
			System.out.println("\nM2:");
			for(int l=0; l < 2; l++) {
				for (int c = 0; c < 2; c++) {
					System.out.printf("\t %.2f \t", m2[l][c]);
				}
				System.out.println();
			}
		} else {
			System.out.println("Você digitou uma instrução inválida!");
		}
		
		in.close();
	}

}
