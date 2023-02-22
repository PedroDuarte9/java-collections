package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestandoListas {

	public static void main(String[] args) {
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";
		
		
		ArrayList<String> listaAulas = new ArrayList<>();
		
		listaAulas.add(aula1);
		listaAulas.add(aula2);
		listaAulas.add(aula3);
		
		System.out.println(listaAulas);
		
		listaAulas.remove(1);
		
		System.out.println(listaAulas);//Visualizando uma coleção de maneira simples
		
		System.out.println(" ");
		
		System.out.println("Usando for normal");
		for(int i = 0; i < listaAulas.size(); i++) {
			System.out.println(listaAulas.get(i));
		}
		
		System.out.println(" ");
		
		System.out.println("Usando foreach");
		for (String aula : listaAulas) {
			System.out.println("Aula: " + aula);
		}
		
		System.out.println(" ");
		System.out.println("Usando método foreach com lambda");
		listaAulas.forEach(aula ->{
			System.out.println("Percorrendo: ");
			System.out.println("Aula: " + aula);
		});
		
		listaAulas.add("Aula Orientação a Objetos");
		System.out.println(listaAulas);
		
		System.out.println(" ");
		System.out.println("Usando Collections.sort(nomeDaLista)");
		Collections.sort(listaAulas);
		for (String string : listaAulas) {
			System.out.println(string);
		}
		
		
		
		
	}

}
