package br.com.alura;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TestaCursoAlunos {
	public static void main(String[] args) {
		
		Curso curso = new Curso("Refatorando aulas", "Paulo Silveira");
		
		curso.adiciona(new Aulas("Programação", 21));
		curso.adiciona(new Aulas("Trabalhando com ArrayList", 22));
		curso.adiciona(new Aulas("Criando uma Aula", 11));
		curso.adiciona(new Aulas("Trabalhando com ArrayList", 15));
		
		Alunos aluno = new Alunos("Guilherme", 158973);
		Alunos aluno2 = new Alunos("Steppat", 183573);
		Alunos aluno3 = new Alunos("Saulo", 238973);
		
		curso.matricula(aluno);
		curso.matricula(aluno2);
		curso.matricula(aluno3);
		
		curso.getAlunos().forEach(a -> {
			System.out.println(a);
		});
			
		//Temos que receber um objeto e encontrá-lo dentro do Set<T> e mostrá-lo como se ele estivesse sido recuperado do Set<T>
		
		System.out.println("O aluno: " + aluno.getNome() + " está matriculado ?");
		System.out.println(curso.estaMatriculado(aluno));
		
		
		Alunos gui = new Alunos("Guilherme", 158973);
		System.out.println("O aluno: " + gui + " está matriculado ?");
		System.out.println(curso.estaMatriculado(gui));
		
		System.out.println("O aluno é igual ao aluno que veio do formulário, pelo método ");
		System.out.println(aluno.equals(gui)); 
		
		System.out.println("O aluno é igual ao aluno que veio do formulário");
		System.out.println(aluno.hashCode() == gui.hashCode()); 
	}
}
