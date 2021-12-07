package br.com.geekuniversity.secao21;

import java.util.LinkedList;

//Conjuntos

public class Programa64 {

	public static void main(String[] args) {
		
//		LinkedList <String> conjunto = new LinkedList<String>();
//		
//		if(!conjunto.contains("Angelina")) {
//			conjunto.add("Angelina");
//		}
//		if(!conjunto.contains("Felicity")) {
//			conjunto.add("Felicity");
//		}
//		if(!conjunto.contains("Angelina")) {
//			conjunto.add("Angelina");
//		}
//		
//		System.out.println(conjunto);
		
//		String nome = "Angelina";
//		
//		System.out.println(nome.toLowerCase().charAt(0) % 26);
		
		Conjunto conjunto = new Conjunto();
		
		System.out.println(conjunto);
		
		conjunto.adiciona("Angelina");
		
		System.out.println(conjunto);
		
		
		conjunto.adiciona("Ana");
		conjunto.adiciona("Felicity");
		conjunto.adiciona("Gabriela");
		conjunto.adiciona("Júlia");
		conjunto.adiciona("Fabiana");
		conjunto.adiciona("Felicity"); //Não é permitido repetido
		
		conjunto.remove("Júlia");

		
		
		
		System.out.println(conjunto);
	
	}

}
