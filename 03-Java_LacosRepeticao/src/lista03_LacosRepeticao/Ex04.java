package lista03_LacosRepeticao;

import java.util.Scanner;

public class Ex04 {
	/*Laços de repeticao - Java: 4
	 *  Autora: Ana Oliveira
	 *  04/06/21
	 *  Enunciado: Uma empresa desenvolveu uma pesquisa para saber as características
	psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
	era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
	(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
	agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
	pessoas, calcule e mostre: (WHILE)
	 o número de pessoas calmas;
	 o número de mulheres nervosas;
	 o número de homens agressivos;
	 o número de outros calmos;
	 o número de pessoas nervosas com mais de 40 anos;
	 o número de pessoas calmas com menos de 18 anos.
	 */
	
	public static void main(String[] args) {
		int n = 1, idade, genero, temperamento, total = 150, calmos = 0, m_nervosas = 0, h_agressivos = 0, o_calmes = 0,
				nervose_maior_40 = 0, calmes_menor_18 = 0;
		
		Scanner in = new Scanner(System.in);
		
		while (n <= total) {
			System.out.println("Digite a idade: ");
			idade = in.nextInt();
			
			System.out.println("Digite o gênero:\n1 - Feminino\n2 - Masculino\n3- Outros");
			genero = in.nextInt();
			
			System.out.println("Digite o temperamento:\n1 - Calme\n2 - Nervose\n3- Agressive");
			temperamento = in.nextInt();
			
			if (temperamento == 1) {
				calmos++;
			}
			if (temperamento == 2 && genero == 1) {
				m_nervosas++;
			}
			if (temperamento == 3 && genero == 2) {
				h_agressivos++;
			}
			if (genero == 3 && temperamento == 1) {
				o_calmes++;
			}
			if (idade > 40 && temperamento == 2) {
				nervose_maior_40++;
			}
			if (idade < 18 && temperamento == 1) {
				calmes_menor_18++;
			}
			n++;
		}
		
		in.close();
		System.out.println("Número de pessoas calmas: " + calmos);
		System.out.println("Número de mulheres nervosas: " + m_nervosas);
		System.out.println("Número de homens agressivos: " + h_agressivos);
		System.out.println("Número de outros calmes: " + o_calmes);
		System.out.println("Número de pessoas nervosas com mais de 40 anos: " + nervose_maior_40);
		System.out.println("Número de pessoas calmas com menos de 18 anos: " + calmes_menor_18);
	}

}
