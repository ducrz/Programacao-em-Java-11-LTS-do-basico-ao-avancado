package br.com.geekuniversity.secao21;

import br.com.geekuniversity.secao11.Cliente;

//LinkedList
public class Programa57 {

	public static void main(String[] args) {
	
//		
//		
//		System.out.println(lista);
//		
//		lista.adicionaNoComeco("Maria");
//		
//		System.out.println(lista);
//		
//		lista.adicionaNoComeco("Angelina");
//		
//		System.out.println(lista);
//		
//		lista.adicionaNoComeco("Felicity");
//		System.out.println(lista);
//		
//		String nome= "Pedro";
//
//		lista.adicionaNoComeco(nome);
//		System.out.println(lista);
//		
//		
//		int numero= 42;
//		lista.adicionaNoComeco(numero);
//		System.out.println(lista);
//		
//		Cliente cli1 = new Cliente(31, "Eduardo", "Rua x");
//		lista.adicionaNoComeco(cli1);
//		System.out.println(lista);
		
//		System.out.println(lista);
//
//		lista.adiciona("Angela");
//		
//		System.out.println(lista);
//		
//		lista.adiciona("Maria");
//		System.out.println(lista);
//		
//		lista.adicionaNoComeco("Felicity");
//		System.out.println(lista);
//		
//		lista.adiciona(1, "Xuxa");
//		System.out.println(lista);
//		
//		Object ret = lista.pega(1);
//		System.out.println(ret);
//
//		System.out.println(lista.tamanho());
		
		ListaLigada lista = new ListaLigada(); //Instanciando Objeto


		System.out.println(lista);
		
		lista.adiciona("Angelina");
		System.out.println(lista);
		
		lista.adiciona("Maria");
		lista.adiciona("Felicity");
		
		System.out.println(lista);
		lista.removeDoComeco();
		System.out.println(lista);
	}

}
