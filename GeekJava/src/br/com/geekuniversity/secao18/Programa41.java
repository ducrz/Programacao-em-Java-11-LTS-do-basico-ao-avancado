package br.com.geekuniversity.secao18;

//Strings
public class Programa41 {

	public static void main(String[] args) {
		
		String curso = "Programação em Java: Essencial";
		
		
		//curso = curso.replace("Java", "Java + Spring Boot");
		
		curso = curso.toLowerCase();
		
		System.out.println(curso);
		
		curso = curso.toUpperCase();
		
		System.out.println(curso);
		
		System.out.println(curso.charAt(0));
		
		for(int i=0; i< curso.length(); i++) {
			System.out.println(curso.charAt(i));
		}



	}

}
