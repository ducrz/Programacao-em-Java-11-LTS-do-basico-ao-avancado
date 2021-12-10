package br.com.geekuniversity.secao22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

//Classes Anônimas

public class Programa70 {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		
		Comparator<String> comparador = new ComparadorPorTamanho();
		
		
		palavras.add("Nerd");
		palavras.add("Geek");
		palavras.add("Java");
		palavras.add("PS5");
		palavras.add("Chip");
		
		palavras.sort(comparador);
		
		palavras.forEach(new Consumer<String>() {

			@Override
			public void accept(String s) {
				System.out.println(s);
				
			}
			
		});
		
	}

}
