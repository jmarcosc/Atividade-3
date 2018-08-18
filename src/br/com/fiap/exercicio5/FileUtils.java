package br.com.fiap.exercicio5;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileUtils {

	public static void salvarArquivo(String caminho, StringBuilder texto) throws IOException {

		FileWriter arq = new FileWriter(caminho);
		PrintWriter salvarArquivo = new PrintWriter(arq);
		salvarArquivo.printf(texto.toString());
		arq.close();

	}

}
