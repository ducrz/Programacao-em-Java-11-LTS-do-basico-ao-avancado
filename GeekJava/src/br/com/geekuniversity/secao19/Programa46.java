package br.com.geekuniversity.secao19;

import java.util.ArrayList;
import java.util.Collections;

public class Programa46 {
	
	//Listas

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(42);
		numeros.add(20);
		numeros.add(22);
		numeros.add(12);
		numeros.add(02);
		
		//System.out.println(numeros.get(0));
		
		Collections.sort(numeros);
		
		for(int i=0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));
		}

	}

}
