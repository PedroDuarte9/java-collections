package br.com.alura;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestaBuscaAlunosNoCurso {
	public static void main(String[] args) {
//		Curso curso = new Curso("Refatorando aulas", "Paulo Silveira");
//		
//		curso.adiciona(new Aulas("Programação", 21));
//		curso.adiciona(new Aulas("Trabalhando com ArrayList", 22));
//		curso.adiciona(new Aulas("Criando uma Aula", 11));
//		curso.adiciona(new Aulas("Trabalhando com ArrayList", 15));
//		
//		Alunos aluno = new Alunos("Guilherme", 158973);
//		Alunos aluno2 = new Alunos("Steppat", 183573);
//		Alunos aluno3 = new Alunos("Saulo", 238973);
//		
//		curso.matricula(aluno);
//		curso.matricula(aluno2);
//		curso.matricula(aluno3);
//		
//		Set<Alunos> alunos = curso.getAlunos();				
//		Iterator<Alunos> iterador = alunos.iterator();	
//		while(iterador.hasNext()) {
//			Alunos proximo = iterador.next();
//			System.out.println(proximo);
//		}
//		
//		
//		Alunos al = curso.buscaMatricula(158973);
//		System.out.println(al);
//		
		//Testando Map<K,V>

		Map<String, Integer> nomesParaIdades = new HashMap<>();
		nomesParaIdades.put("Pedro", 27);
		nomesParaIdades.put("Paulo", 23);
		nomesParaIdades.put("Flávio", 25);
		nomesParaIdades.put("Flavia", 19);
		nomesParaIdades.put("Domingos", 57);
		
		Set<String> chave = nomesParaIdades.keySet();
		System.out.println(chave);
		
		Collection<Integer> valores = nomesParaIdades.values();
		System.out.println(valores);
		
		
		
		
		
		
	}
}
