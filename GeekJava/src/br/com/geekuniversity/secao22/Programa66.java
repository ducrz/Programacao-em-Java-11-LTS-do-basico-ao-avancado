package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Default Methods
public class Programa66 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		
		
		palavras.add("Nerd");
		palavras.add("Geek");
		palavras.add("Java");
		palavras.add("PS5");
		palavras.add("Chip");
		
		//Collections.sort(palavras);
		//Collections.sort(palavras,comparador);
		
		palavras.sort(comparador);
		
//		for(int i=0; i< palavras.size(); i++) {
//			System.out.println("A palavra "+palavras.get(i)+" tem tamanho "+palavras.get(i).length());
//		}
		
		System.out.println(palavras);




		

	}

}
