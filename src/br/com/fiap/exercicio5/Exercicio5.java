package br.com.fiap.exercicio5;

import java.io.IOException;

import javax.swing.JOptionPane;

public class Exercicio5 {

	public static void main(String[] args) throws IOException {

		String mensagem = JOptionPane.showInputDialog("Digite uma mensagem para ser codificada: ");
		
		StringBuilder mensagemCriptografada = criptografar("C:\\mensagemCodificada.txt", mensagem);
		StringBuilder mensagemDescriptografada = descriptografar("C:\\mensagemDecodificada.txt", mensagemCriptografada.toString());
		
		System.out.println(mensagemCriptografada);
		System.out.println(mensagemDescriptografada);
		
	}

	public static StringBuilder criptografar(String caminho, String mensagem) throws IOException {
		
		StringBuilder codificacao = new StringBuilder();
		
		for (int j = 0; j <= mensagem.length() - 1; j++) {
			codificacao.append((char) ((int) mensagem.charAt(j) + 1));
		}
		
		//Necessário permissão de acesso ao diretório
		FileUtils.salvarArquivo(caminho, codificacao);
		return codificacao;
		
	}

	public static StringBuilder descriptografar(String caminho, String mensagem) throws IOException {
		
		StringBuilder descodificacao = new StringBuilder();
		
		for (int j = 0; j <= mensagem.length() - 1; j++) {
			descodificacao.append((char) ((int) mensagem.charAt(j) - 1));
		}
		
		//Necessário permissão de acesso ao diretório
		FileUtils.salvarArquivo(caminho, descodificacao);
		return descodificacao;
		
	}

}