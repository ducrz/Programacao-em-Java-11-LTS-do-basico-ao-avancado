package geek;

import java.util.Scanner;
//Funções
public class Programa20 {
	
	//Declaração vetor
	static String frutas[];
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {		
		int qtd;
		
		System.out.println("Informe a quantidade de frutas para cadastro");
		
		qtd= Integer.parseInt(teclado.nextLine());		
		
		cadastrarDados(qtd);
		
		mostrarDados(qtd);
		
		
		teclado.close();	

	}
	//void - vazio, função sem retono
	static void cadastrarDados(int quantidade){
		//Definindo Tamanho
				frutas = new String[quantidade];
				
				for(int i=0; i < quantidade; i++) {		
					System.out.println("Informa a "+(i+1)+" fruta: ");
					frutas[i]= teclado.nextLine();		
					//System.out.println("Quantidade: "+qtd);
				}
	}
	static void mostrarDados(int quantidade) {
		//For para impressão do último item para o primeiro
				for(int i= (quantidade-1); i >= 0; i--) {
					System.out.println(frutas[i]);
				}
	}

}
