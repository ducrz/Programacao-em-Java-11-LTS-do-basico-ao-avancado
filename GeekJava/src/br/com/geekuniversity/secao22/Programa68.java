package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Programa68 {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		
		//System.out.println(palavras);
		
		Consumer<String> consumidor = new ImprimeNaLinha();
		
		palavras.add("Nerd");
		palavras.add("Geek");
		palavras.add("Java");
		palavras.add("PS5");
		palavras.add("Chip");
		
//		System.out.println(palavras);
//
////		for(int i =0; i < palavras.size(); i++) {
////			System.out.println(palavras.get(i));
////		}
//		
//		for(String p : palavras) {
//			System.out.println(p);
//		}
		
		
		palavras.forEach(consumidor);

	}

}
