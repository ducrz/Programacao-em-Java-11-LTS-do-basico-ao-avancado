package br.com.geekuniversity.secao21;

import java.util.LinkedList;
import java.util.Queue;

public class Programa63 {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<String>();
		
		System.out.println(fila);
		
		fila.add("Angelina"); //Inserir
		fila.add("Angelina"); //Inserir
		fila.add("Angelina"); //Inserir
		fila.add("Felicity"); //Inserir
		
		System.out.println(fila);
		
		
		String ret = fila.poll(); //Remover
		System.out.println(ret);
		
		System.out.println(fila);
		
	}

}
