package br.com.geekuniversity.secao04;

public class Programa06 {
	//Instrução Switch
	public static void main(String[] args) {
		
		int numero = 1;
		
		switch (numero) {
			case 1:
				System.out.println("O número é 1");
				break;
			case 3:
				System.out.println("O Número é 3");
				break;
			case 5:
				System.out.println("O Número é 5");
				break;
			default:
				System.out.println("[Default] O Número é "+numero);
				break;
		}
	}
}
