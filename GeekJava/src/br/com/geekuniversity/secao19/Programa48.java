package br.com.geekuniversity.secao19;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Programa48 {

	public static void main(String[] args) {
		Set<String> nomes = new HashSet<String>();
		Scanner teclado = new Scanner(System.in);
		boolean res;
		
		for(int i=0; i< 5; i++) {
			System.out.println("Informe o "+(i+1)+"/5 nome: ");
			String nome = teclado.nextLine();
			nomes.add(nome);
			res = nomes.add(nome);
			if(!res) {
				System.out.println("O Nome não pode ser repetido.");
				i--;
			}
			
		}
		
		System.out.println("No conjunto nomes temos "+nomes.size()+" elementos.");
		
		for(String nome : nomes) {
			System.out.println(nome);
		}
		teclado.close();
//		nomes.add("Maria");
//		nomes.add("Felicity");
//		nomes.add("Angelina");
//		nomes.add("Izabela");
//		nomes.add("Maria");
		
		//System.out.println(nomes.add("Pedro"));
		
		
//		System.out.println(nomes.size());
//		
//		System.out.println(nomes.contains("Felicity"));
//		
//		for(String nome : nomes) {
//			System.out.println(nome);
//		}
		

	}

}
