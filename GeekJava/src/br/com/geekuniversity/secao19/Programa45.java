package br.com.geekuniversity.secao19;

import java.util.ArrayList;
import java.util.Collections;

//Listas
public class Programa45 {

	public static void main(String[] args) {
		
		ArrayList<String> nomes = new ArrayList<String>();
		
		nomes.add("Maria");
		nomes.add("Felicity");
		nomes.add("Angelina");
		nomes.add("Izabela");
		nomes.add("Maria");
		
//		nomes.add(44);
//		nomes.add(true);
//		nomes.add(12.4);
//		nomes.add('e');
		
		
		//System.out.println(nomes.get(0));
		//System.out.println(nomes.get(3));
		
//		for(int i=0; i < nomes.size(); i++) {
//			System.out.println(nomes.get(i));
//			
//		}
		
		Collections.sort(nomes);
		
		for(Object nome: nomes) {
			System.out.println(nome);
		}


		
	}

}
