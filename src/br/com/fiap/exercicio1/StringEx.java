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

// Quantos objetos do tipo string ser�o criados?
/*
 *  R: 12, pois a cada nova itera��o � criado um novo objeto String na mem�ria.
 */

// Qual seria a forma mais eficiente de manipular os dados em mem�ria?
/*
 *  R: Uma das maneiras mais eficiente de manipular strings em mem�ria � utilizar a classe StringBuilder que � mut�vel e a cada novo valor
 *  concatena de fato o novo valor da String na String j� existente anteriormente.
 */
