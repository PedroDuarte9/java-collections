package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestandoAulaListas {

	public static void main(String[] args) {
		Aulas a1 = new Aulas("Revistando ArrayList", 21);
		Aulas a2 = new Aulas("Montando Querys", 12);
		Aulas a3 = new Aulas("Lista de Objetos", 20);
		Aulas a4 = new Aulas("Relacionamento de listas e objetos", 15);
		
		ArrayList<Aulas> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		aulas.add(a4);
		
		System.out.println("Antes de ordenar por ordem alfabética");
		aulas.forEach(aula -> {
			System.out.println("Aula:" + aula);
		});
		
		System.out.println(" ");
		Collections.sort(aulas);//Colections é a classe, .sort é a ordenação e dentro dos parenteses o nome da lista.
		System.out.println("Ordenando a lista pelo Nome da aula");
		aulas.forEach(aula -> {
			System.out.println("Aula: " + aula);
		});
		
		System.out.println(" ");
		aulas.sort(Comparator.comparing(Aulas::getTempo));
		System.out.println("Ordenando a lista pelo tempo da aula");
		aulas.forEach(aula -> {
			System.out.println("Aula: " + aula);
		});

		
		
	}
}
