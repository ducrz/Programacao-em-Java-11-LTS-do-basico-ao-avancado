package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.List;

//Lambdas
public class Programa72 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();

		palavras.add("Nerd");
		palavras.add("Geek");
		palavras.add("Java");
		palavras.add("PS5");
		palavras.add("Chip");

		// Forma 1
//		palavras.sort((s1,s2) ->{
//			
//			if(s1.length() < s2.length()) {
//				return -1;
//			}
//			if(s1.length() > s2.length()) {
//				return 1;
//			}
//			return 0;
//		});
		// Forma 2
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		// Expressão Lambda - Forma 2
		palavras.forEach(s -> System.out.println(s));

	}

}
