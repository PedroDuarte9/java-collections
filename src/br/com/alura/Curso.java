package br.com.alura;

import java.lang.instrument.UnmodifiableClassException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {
	private String titulo;
	private String nomeProf;
	private List<Aulas> aulas = new ArrayList<>();
	
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
	
	
}
