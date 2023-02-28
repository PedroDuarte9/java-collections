package br.com.alura;

public class Alunos {
	private String nome;
	private int matricula;
	
	public Alunos(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public int getMatricula() {
		return matricula;
	}
	@Override
	public String toString() {
		return "Alunos [nome=" + nome + ", matricula=" + matricula + "]";
	}
	
	
}
