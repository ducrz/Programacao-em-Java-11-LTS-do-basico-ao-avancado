package br.com.geekuniversity.secao12;

//Extends- Aluno é uma pessoa, herda
//Classe específica, sub-classe, classe filha
public class Aluno extends Pessoa {	
	private String ra;	
	
	public Aluno(String nome, int ano_nascimento, String email, String ra) {
		super(nome, ano_nascimento, email);
		this.ra = ra;		
	}
	
	public String getRa() {
		return this.ra;
	}
	
	public void setRa(String ra) {
		this.ra = ra;
		
	}
	
	public String toString() {
		return super.toString()+"\nR.A.:"+this.ra;
	}
	
	public String getNome() {
		return "Aluno: \n"  + super.getNome();
	}

}
