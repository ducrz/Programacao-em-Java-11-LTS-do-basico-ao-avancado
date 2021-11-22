package br.com.geekuniversity.secao12;

public class Programa28 {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Eduardo Monteiro", 1989, "eduardo@gmail.com");
		
		System.out.println(p1);		
		System.out.println(p1.getNome());	
		System.out.println("\n");

		
		Aluno a1 = new Aluno("Vanessa da Silva", 2001, "vanessa@gmail.com",  "123456");
		System.out.println(a1);
		System.out.println(a1.getNome());
		System.out.println("\n");

		
		Professor prof1 = new Professor("Pedro da Silva", 1976, "pedro@gmail.com", "ABC000");
		
		System.out.println(prof1);
		System.out.println(prof1.getNome());
		System.out.println("\n");

	}

}
