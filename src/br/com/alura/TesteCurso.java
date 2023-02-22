package br.com.alura;

import java.util.List;

public class TesteCurso {

	public static void main(String[] args) {
		Curso curso = new Curso("Refatorando aulas", "Paulo Silveira");
		
		List<Aulas> aulas = curso.getAulas();
		
		System.out.println(aulas);
		
		curso.adiciona(new Aulas("Programação", 21));
		curso.adiciona(new Aulas("Trabalhando com ArrayList", 22));
		curso.adiciona(new Aulas("Criando uma Aula", 11));
		curso.adiciona(new Aulas("Trabalhando com ArrayList", 15));
		
		aulas.forEach(aula -> {
			System.out.println(aula);
		});
		

	}

}
