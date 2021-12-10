package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

//Lambdas
public class Programa73 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();

		palavras.add("Nerd");
		palavras.add("Geek");
		palavras.add("Java");
		palavras.add("PS5");
		palavras.add("Chip");

		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		palavras.forEach(s -> System.out.println(s));
		
		Consumer<String> consumer = s-> System.out.println(s);
		palavras.forEach(consumer);

	}

}
