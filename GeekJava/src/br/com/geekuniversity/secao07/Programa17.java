package br.com.geekuniversity.secao07;

public class Programa17 {
	//Vetores Parte2
	public static void main(String[] args) {
			
		int numeros[]= new int[10];
		
		System.out.println("Tamanho do vetor: "+numeros.length);
		
		for (int i=0; i < numeros.length; i++) {
			numeros[i]= i + 3;			
		}
		
		System.out.println(numeros[0]); //First element
		System.out.println(numeros[9]); //Last element
		
		numeros[0]=7;
		System.out.println(numeros[0]);
		
		for(int i=0; i< numeros.length; i++) {
			numeros[i]= (int)Math.round(Math.random() * 10);
		}
		
		System.out.println(numeros[0]); //First element
		System.out.println(numeros[9]); //Last element
		
		for(int i: numeros) {
			System.out.println(i);
			
		}

	}

}
