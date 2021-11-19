package br.com.geekuniversity.secao06;

public class Programa13 {
	//Tipos de Dados Alfanuméricos
	//Caracteres e Strings
	public static void main(String[] args) {
		
		//Tipos primitivos
		char letra1 = 'a'; //Precisa ser aspas simples
		char letra2 = 97;
		
		System.out.println("Letra2 " +letra2);

		letra2 = (char) (letra2+1);
		
		System.out.println("Letra1 " +letra1);
		
		System.out.println("Letra2 " +letra2);

		
		//Tipos não primitivos
		
		Character letra3 = 'A';
		
		String nome = "Eduardo";
		
		
		System.out.println("Letra3 " + letra3);
		
		System.out.println("Nome " + nome);
		
		System.out.println("Tamanho da String "+ nome.length());
		
		System.out.println("char/Charactere "+ Character.SIZE + " bits");	
		
		System.out.println("String "+(Character.SIZE * nome.length()) + " bits");	


		System.out.println("Valor Min char/Character " +Character.MIN_VALUE);
		System.out.println("Valor Max char/Character " +Character.MAX_VALUE);
	}
}
