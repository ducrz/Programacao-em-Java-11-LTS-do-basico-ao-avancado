package br.com.geekuniversity.secao22;

import java.util.Comparator;
//Ordenando String pelo tamanho e não pela ordem alfabética
public class ComparadorPorTamanho implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		
		if(s1.length() < s2.length()) {
			return -1;
		}
		if(s1.length() > s2.length()) {
			return 1;
		}
		return 0;
	}

}
