package br.com.alura;

public class Aulas implements Comparable<Aulas> {
	
	private String titulo;
	private int tempo;
	
	public Aulas(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public int getTempo() {
		return tempo;
	}

	@Override
	public String toString() {
		return "Aulas [titulo=" + titulo + ", tempo=" + tempo + "]";
	}

	@Override
	public int compareTo(Aulas outrasAulas) {
		return this.titulo.compareTo(outrasAulas.titulo);
	}
	
	
}
