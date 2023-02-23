package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {

	public static void main(String[] args) {

		Collection<String> alunos = new HashSet<>();
		alunos.add("Pedro Duarte");
		alunos.add("José Henrique");
		alunos.add("José Henrique");
		alunos.add("Leo Bentes");
		alunos.add("Humberto Junior");
		alunos.add("Nico Steppad");
		alunos.add("Carlos Gonçalves");
		alunos.add("Jesse Monteiro");
		alunos.add("Bruno Barba");
		alunos.add("Claudio Jorge");
		alunos.add("Carlos Gonçalves");

		
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		int size = alunos.size();
		System.out.println(size);
		
		//Organizando a ordem do conjunto passando o conjunto pelo construtor de uma nova lista;
		List<String> alunoss = new ArrayList<>(alunos);
		
		Collections.sort(alunoss);
		alunoss.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		
		
	}

}
