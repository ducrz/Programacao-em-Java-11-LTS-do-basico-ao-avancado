package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.List;

public class Programa76 {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		
		
		cursos.add(new Curso("Programação para Leigos", 170));
		cursos.add(new Curso("Algoritmos e Programação: Essencial", 280));
		cursos.add(new Curso("Programação em C: Essencial", 125));
		cursos.add(new Curso("Programação em Java: Essencial", 0));
		cursos.add(new Curso("Programação em Python: Essencial", 0));
		cursos.add(new Curso("Banco de Dados: Essencial", 0));
		
		//Cursos com mais de cem alunos
		
		//Lambda
		//cursos.stream().filter(c ->  c.getAlunos() >= 100).forEach(c -> 
		//System.out.println(c.getNome()));
		
		
		cursos.stream().filter(c ->  c.getAlunos() >= 100).forEach(System.out::println);
		
		
	}

}
