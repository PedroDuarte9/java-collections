package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteCurso2 {

	public static void main(String[] args) {
		Curso curso = new Curso("Refatorando aulas", "Paulo Silveira");
		
		List<Aulas> aulasImutaveis = curso.getAulas();
		
		System.out.println(aulasImutaveis);
		
		curso.adiciona(new Aulas("Programação", 21));
		curso.adiciona(new Aulas("Trabalhando com ArrayList", 22));
		curso.adiciona(new Aulas("Criando uma Aula", 11));
		curso.adiciona(new Aulas("Wrapper Classe", 15));
		
		aulasImutaveis.forEach(aula -> {
			System.out.println(aula);
		});
		
		List<Aulas> aulas = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulas);
		System.out.println(" ");
		aulas.forEach(aula -> {
			System.out.println(aula);
		});
		

		System.out.println(curso.getTempoTotal());
		
		System.out.println(curso);
		
	}

}
