package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Programa71 {

	public static void main(String[] args) {
	List<String> palavras = new ArrayList<String>();
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		
		
		palavras.add("Nerd");
		palavras.add("Geek");
		palavras.add("Java");
		palavras.add("PS5");
		palavras.add("Chip");
		
		palavras.sort(comparador);
		
		//Expressão Lambda - Forma 1
		palavras.forEach((String s) -> {
			System.out.println(s);
		});
		
		//Expressão Lambda - Forma 2
		palavras.forEach(s -> System.out.println(s));

	}

}
