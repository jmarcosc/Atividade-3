package br.com.fiap.exercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Exercicio4 {
	
	private static ArrayList<Pessoa> pessoas = new ArrayList<>();
	
	public static void main(String[] args) {
		
		inserirPessoas();
		
		System.out.println("LISTA DE PESSOAS INICIAL: ");
		listarPessoas();
 
		Random sorteio = new Random();
		pessoas.remove(pessoas.get(sorteio.nextInt(pessoas.size())));
		
		System.out.println("\nLISTA DE PESSOAS APÓS REMOÇÃO: ");
		listarPessoas();
		
		Collections.sort(pessoas, new Comparator<Pessoa>(){
			  public int compare(Pessoa p1, Pessoa p2){
			    return p1.nome.compareTo(p2.nome);
			  }
		});
		
		System.out.println("\nLISTA DE PESSOAS ORDENADA: ");
		listarPessoas();

		Collections.sort(pessoas, new Comparator<Pessoa>(){
			  public int compare(Pessoa p1, Pessoa p2){
			    return p2.nome.compareTo(p1.nome);
			  }
		});
		
		System.out.println("\nLISTA DE PESSOAS INVERTIDA: ");
		listarPessoas();
		
	} 

	private static void inserirPessoas() {
		
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		Pessoa pessoa4 = new Pessoa();
		Pessoa pessoa5 = new Pessoa();

		pessoa1.setNome("João Garcia");
		pessoa2.setNome("Maria Martins");
		pessoa3.setNome("Henrique Fernando");
		pessoa4.setNome("Inácio Luis");
		pessoa5.setNome("Fernando Ferreira");
		
		pessoa1.setIdade(20);
		pessoa2.setIdade(44);
		pessoa3.setIdade(43);
		pessoa4.setIdade(33);
		pessoa5.setIdade(87);
		
		pessoa1.setSexo('M');
		pessoa2.setSexo('F');
		pessoa3.setSexo('M');
		pessoa4.setSexo('M');
		pessoa5.setSexo('M');
		
		pessoa1.setEmpresa("AIK Enterprises");
		pessoa2.setEmpresa("Simples");
		pessoa3.setEmpresa("AIK Enterprises");
		pessoa4.setEmpresa("Magazine André");
		pessoa5.setEmpresa("Casas Recifes");

		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);
		pessoas.add(pessoa5);

	}
	
	private static void listarPessoas() {
		
		for(Pessoa pessoa: pessoas) {
			System.out.println(pessoa.getNome());
		}
		
	}
	
}