package br.com.geekuniversity.secao16;

import java.util.Scanner;

public class Programa37 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número para divisão: ");
		int num1 = teclado.nextInt();
		
		System.out.println("Informe o segundo número para divisão: ");
		int num2 = teclado.nextInt();
		
		try {
			System.out.println("A divisão de "+num1+" por "+num2+" é = "+num1 / num2);			
		}catch(ArithmeticException e) {
			System.out.println("Divisão por zero não é permitida!");
		}finally {
			System.out.println("Faça isto também.");
		}
		
		teclado.close();
	}

}
