package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Curso {
	private String titulo;
	private String nomeProf;
	private List<Aulas> aulas = new ArrayList<>();
	private Set<Alunos> alunos = new HashSet();
	
	public Curso() {
		
	}
	
	public Curso(String titulo, String nomeProf) {
		this.titulo = titulo;
		this.nomeProf = nomeProf;
		
	}

	public String getTitulo() {
		return titulo;
	}
	
	public String getNomeProf() {
		return nomeProf;
	}
	public List<Aulas> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	public void adiciona(Aulas aula) {
		this.aulas.add(aula);
	}
	
	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aulas::getTempo).sum();
	}

	@Override
	public String toString() {
		return "Curso [titulo=" + titulo + ", nomeProf=" + nomeProf + ", aulas=" + aulas + "]";
	}

	public void matricula(Alunos aluno) {
		this.alunos.add(aluno);
		
	}

	public Set<Alunos> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Alunos aluno) {
		return this.alunos.contains(aluno);
		
	}

	
	
}
