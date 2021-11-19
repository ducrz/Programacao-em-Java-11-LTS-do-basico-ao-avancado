package br.com.geekuniversity.secao05;

import java.util.Scanner;

public class Programa09 {
	//FOR
	public static void main(String[] args) {
		
		int idade;
		String nome;
		Scanner teclado = new Scanner(System.in);
		
		for(int i=0; i <5; i++) {
			
			System.out.println("Informe seu Nome: ");
			nome = teclado.nextLine();	
			
			System.out.println("Informe sua Idade: ");
			idade = Integer.parseInt(teclado.nextLine());
			
			if(idade <0) {
				System.out.println(nome+ " tem "+idade+" anos!");
			}
		}
		
		teclado.close();
		
	}
}
