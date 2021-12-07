package br.com.geekuniversity.secao21;

//Armazenamento Sequencial
public class Programa55 {

	public static void main(String[] args) {
		
//		int numeros[] = new int[5];
//		
//		numeros[4]=9;
//		
//		System.out.println(numeros[4]);
//		
//		for(int i=0; i < numeros.length; i++) {
//			System.out.println(numeros[i]);
//		}
		Aluno a1 = new Aluno("Angelina");
		Aluno a2 = new Aluno("Felicity");
		
		Vetor lista = new Vetor();
		
		System.out.println("Total de Alunos: "+lista.tamanho());
		
		lista.adiciona(a1);
		System.out.println("Total de Alunos: "+lista.tamanho());

		lista.adiciona(a2);
		System.out.println("Total de Alunos: "+lista.tamanho());

		
		System.out.println(lista);
		
		System.out.println(lista.contem(a1));
		
		try {
			System.out.println(lista.pega(101));
		}
		catch(IllegalArgumentException e) {
			System.out.println("O Aluno da Posição não existe!");
			System.out.println(e.getMessage());
			
		}
		
		Aluno a3= new Aluno("Clara");
		try {
			lista.adiciona(1, a3);
		}
		catch (IllegalArgumentException e) {
			System.out.println("A posição é inválida");
		}
		System.out.println(lista);
		
	
	}

}
