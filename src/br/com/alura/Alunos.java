package br.com.alura;

public class Alunos {
	private String nome;
	private int matricula;
	
	public Alunos(String nome, int matricula) {
		if (nome == null) {
			throw new NullPointerException("O nome não pode ser nulo");
		}
		
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
	
	@Override
	public boolean equals(Object obj) {
		Alunos outroAluno = (Alunos) obj;
		return super.equals(outroAluno);
	}
	
	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
}
