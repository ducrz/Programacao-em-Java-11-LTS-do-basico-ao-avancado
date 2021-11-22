package br.com.geekuniversity.secao12;

public class Professor extends Pessoa{
	
	private String matricula;
	public Professor(String nome, int ano_nascimento, String matricula, String email) {
		super(nome, ano_nascimento, email);
		this.matricula = matricula;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	//Overriding / Sobrescrita de método
	public String toString() {
		return super.toString()+"\nMatrícula: "+this.matricula;
	}
	//Overriding / Sobrescrita de método
	public String getNome() {
		return "Professor: \n"  + super.getNome();
	}
}
