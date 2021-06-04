package lista03_LacosRepeticao;

public class Ex01 {
	/*Laços de repeticao - Java: 1
	 *  Autora: Ana Oliveira
	 *  04/06/21
	 *  Enunciado: Informar todos os números de 1000 a 1999 que quando divididos por 11
	 *  obtemos resto = 5.
	 */
	public static void main(String[] args) {


		int i;
		for (i = 1000; i % 11 != 5; i += 1) {
		}
		for (i = i - 1; i < 1999; i += 11) {
			System.out.println(i);
		}
	}

}
