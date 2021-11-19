package br.com.geekuniversity.secao06;

public class Programa14 {
	//Tipos Booleanos
	public static void main(String[] args) {
		//Tipos Primitivos		
		boolean verdadeiro = true;
		boolean falso = false;
		
		boolean ativo = true;
		
		
		//Tipos Não Primitivos
		Boolean v = true;
		Boolean f = false;
		
		System.out.println("Verdadeiro "+verdadeiro);
		System.out.println("Falso "+falso);
		System.out.println("V "+v);
		System.out.println("F "+f);;
		
		
		if(verdadeiro == true) {
			System.out.println("É Verdadeiro");			
		}
		else {
			System.out.println("É Falso");			
		}
		
		if(1 == 3) {			
			System.out.println("1=1 é Verdadeiro");			
		}
		else {
			System.out.println("... é falso!");
		}
		
		if (ativo) {
			System.out.println("Pode acessar o sistema");			
		}
		else {
			System.out.println("Acesso negado");
		}
	}

}
