package geek;

import java.util.Scanner;

public class Programa08 {
	
	//Do While
	public static void main(String[] args) {		
		int idade;
		String nome;
		
		Scanner teclado = new Scanner(System.in);
		//Primeiro executa o código, depois verifica
		do{ //Faça
			System.out.println("Informe seu Nome: ");
			nome = teclado.nextLine();			
			System.out.println("Informe sua Idade: ");
			//idade = teclado.nextInt();	
			idade = Integer.parseInt(teclado.nextLine());
			if(idade <0) {
				System.out.println(nome+ " tem "+idade+" anos!");
			}
		}while(idade > 0);
		
		teclado.close();
	}
}
