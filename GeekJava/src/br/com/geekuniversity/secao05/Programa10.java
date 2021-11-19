package br.com.geekuniversity.secao05;

public class Programa10 {
	
	//Foreach

	public static void main(String[] args) {

		String nome = "Eduardo";
		//Para cada caractere da string, imprima o caractere
		for (char letra : nome.toCharArray() ) {
			System.out.println(letra);
			//System.out.print(letra);
			
		}
	}

}
