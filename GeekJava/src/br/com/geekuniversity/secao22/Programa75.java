package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

//Streams
public class Programa75 {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		
	
		cursos.add(new Curso("Programação para Leigos", 170));
		cursos.add(new Curso("Algoritmos e Programação: Essencial", 280));
		cursos.add(new Curso("Programação em C: Essencial", 125));
		cursos.add(new Curso("Programação em Java: Essencial", 0));
		cursos.add(new Curso("Programação em Python: Essencial", 0));
		cursos.add(new Curso("Banco de Dados: Essencial", 0));
		
		
		//System.out.println(cursos);
		
		cursos.sort(Comparator.comparing(c -> c.getAlunos()));

		//System.out.println(cursos);
		
		//Method References
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		
		//Lambda
		//cursos.forEach(c -> System.out.println(c.getNome()));
		
		//Method Reference
		cursos.forEach(System.out::println);
	}
	

}
