package br.com.fiap.exercicio1;

public class StringEx {

	public static void main(String[] args) {
		String string = "";
		int z = 0;
		for (int i = 0; i < 12; i++) {
			z++;
			string += "string";
		}
	}
}

// Quantos objetos do tipo string serão criados?
/*
 *  R: 12, pois a cada nova iteração é criado um novo objeto String na memória.
 */

// Qual seria a forma mais eficiente de manipular os dados em memória?
/*
 *  R: Uma das maneiras mais eficiente de manipular strings em memória é utilizar a classe StringBuilder que é mutável e a cada novo valor
 *  concatena de fato o novo valor da String na String já existente anteriormente.
 */
