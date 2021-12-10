package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

//Method References
public class Programa74 {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		
		palavras.add("Nerd");
		palavras.add("Geek");
		palavras.add("Java");
		palavras.add("PS5");
		palavras.add("Chip");	
		
		
		
		//palavras.sort(Comparator.comparing(s -> s.length()));
		
		//Method References
		//Forma 1
		palavras.sort(Comparator.comparing(String::length));
		
		//Forma 2
		//Function<String, Integer> tamanho = s -> s.length(); Lambda

		Function<String, Integer> tamanho = String::length;
		Comparator<String> comparador = Comparator.comparing(tamanho);
		palavras.sort(comparador);
		
		
		//System.out.println(palavras);
		
		//Method Reference
		palavras.forEach(System.out::println);

		
	}

}
