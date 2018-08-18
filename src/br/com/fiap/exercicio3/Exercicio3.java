package br.com.fiap.exercicio3;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.WeakHashMap;

public class Exercicio3 {

	private static int entradas = 1000000;
	private static ArrayList<String> Arraylist = new ArrayList<>();
	private static LinkedList<String> Linkedlist = new LinkedList<>();
	private static Stack<String> stack = new Stack<String>();
	private static HashSet<String> hashSet = new HashSet<String>();
	private static HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
	private static WeakHashMap<Integer, String> weakHashMap = new WeakHashMap<Integer, String>();

	public static void main(String[] args) {

		tempoInsercaoArrayList();
		tempoBuscaArrayList();
		tempoInsercaoLinkedList();
		tempoBuscaLinkedList();

		System.out.println("******************************************************************");
		
		tempoInsercaoStack();
		tempoBuscaStack();
		tempoInsercaoHashSet();
		tempoBuscaHashSet();
		
		System.out.println("******************************************************************");

		tempoInsercaoHashMap();
		tempoBuscaHashMap();
		tempoInsercaoWeakHashMap();
		tempoBuscaWeakHashMap();

	}

	public static void tempoInsercaoArrayList() {

		LocalDateTime inicio = LocalDateTime.now();

		for (int e = 0; e <= entradas; e++) {
			Arraylist.add("ENTRADA: " + e);
		}
		
		LocalDateTime fim = LocalDateTime.now();
		long segundos = ChronoUnit.NANOS.between(inicio, fim);
		System.out.println("TEMPO TOTAL DE INSER플O EM ARRAYLIST: " + segundos + " SEGUNDOS");
	}
	
	public static void tempoBuscaArrayList() {
		
		LocalDateTime inicio = LocalDateTime.now();
		
		Arraylist.get(500000);
		
		LocalDateTime fim = LocalDateTime.now();
		long segundos = ChronoUnit.NANOS.between(inicio, fim);
		System.out.println("TEMPO TOTAL DE BUSCA DE BUSCA EM ARRAYLIST: " + segundos + " SEGUNDOS");
	}

	public static void tempoInsercaoLinkedList() {

		LocalDateTime inicio = LocalDateTime.now();

		for (int e = 0; e <= entradas; e++) {
			Linkedlist.add("ENTRADA: " + e);
		}
		
		LocalDateTime fim = LocalDateTime.now();
		long segundos = ChronoUnit.NANOS.between(inicio, fim);
		System.out.println("TEMPO TOTAL DE INSER플O EM LINKEDLIST: " + segundos + " SEGUNDOS");
	}

	public static void tempoBuscaLinkedList() {
		
		LocalDateTime inicio = LocalDateTime.now();
		
		Linkedlist.get(500000);
		
		LocalDateTime fim = LocalDateTime.now();
		long segundos = ChronoUnit.NANOS.between(inicio, fim);
		System.out.println("TEMPO TOTAL DE BUSCA EM LINKEDLIST: " + segundos + " SEGUNDOS");
	}
	
	public static void tempoInsercaoStack() {
		
		LocalDateTime inicio = LocalDateTime.now();
		
		for (int e = 0; e <= entradas; e++) {
			stack.push("ENTRADA: " + e);
		}
		
		LocalDateTime fim = LocalDateTime.now();
		long segundos = ChronoUnit.NANOS.between(inicio, fim);
		System.out.println("TEMPO TOTAL DE INSER플O EM STACK: " + segundos + " SEGUNDOS");
	}
	
	public static void tempoBuscaStack() {
		
		LocalDateTime inicio = LocalDateTime.now();
		
		stack.get(500000);
		
		LocalDateTime fim = LocalDateTime.now();
		long segundos = ChronoUnit.NANOS.between(inicio, fim);
		System.out.println("TEMPO TOTAL DE BUSCA EM STACK: " + segundos + " SEGUNDOS");
	}
	
	public static void tempoInsercaoHashSet() {
		
		LocalDateTime inicio = LocalDateTime.now();
		
		for (int e = 0; e <= entradas; e++) {
			hashSet.add("ENTRADA: " + e);
		}
		
		LocalDateTime fim = LocalDateTime.now();
		long segundos = ChronoUnit.NANOS.between(inicio, fim);
		System.out.println("TEMPO TOTAL DE INSER플O EM HASHSET: " + segundos + " SEGUNDOS");
	}
	
	@SuppressWarnings("unlikely-arg-type")
	public static void tempoBuscaHashSet() {
		
		LocalDateTime inicio = LocalDateTime.now();
		
		hashSet.contains(500000);
		
		LocalDateTime fim = LocalDateTime.now();
		long segundos = ChronoUnit.NANOS.between(inicio, fim);
		System.out.println("TEMPO TOTAL DE BUSCA EM HASHSET: " + segundos + " SEGUNDOS");
	}
	
	public static void tempoInsercaoHashMap() {
		
		LocalDateTime inicio = LocalDateTime.now();
		
		for (int e = 0; e <= entradas; e++) {
			hashMap.put(e, "ENTRADA: ");
		}
		
		LocalDateTime fim = LocalDateTime.now();
		long segundos = ChronoUnit.NANOS.between(inicio, fim);
		System.out.println("TEMPO TOTAL DE INSER플O EM HASHMAP: " + segundos + " SEGUNDOS");
	}
	
	public static void tempoBuscaHashMap() {
		
		LocalDateTime inicio = LocalDateTime.now();
		
		hashMap.get(500000);
		
		LocalDateTime fim = LocalDateTime.now();
		long segundos = ChronoUnit.NANOS.between(inicio, fim);
		System.out.println("TEMPO TOTAL DE BUSCA EM HASHMAP: " + segundos + " SEGUNDOS");
	}

	public static void tempoInsercaoWeakHashMap() {
		
		LocalDateTime inicio = LocalDateTime.now();
		
		for (int i = 0; i <= entradas; i++) {
			weakHashMap.put(i, "NOME" + i);
		}
		
		LocalDateTime fim = LocalDateTime.now();
		long segundos = ChronoUnit.NANOS.between(inicio, fim);
		System.out.println("TEMPO TOTAL DE INSER플O EM WEAKHASHMAP: " + segundos + " SEGUNDOS");
	}
	
	public static void tempoBuscaWeakHashMap() {
		
		LocalDateTime inicio = LocalDateTime.now();
		
		weakHashMap.get(500000);
		
		LocalDateTime fim = LocalDateTime.now();
		long segundos = ChronoUnit.NANOS.between(inicio, fim);
		System.out.println("TEMPO TOTAL DE BUSCA EM WEAKHASHMAP: " + segundos + " SEGUNDOS");
	}

}