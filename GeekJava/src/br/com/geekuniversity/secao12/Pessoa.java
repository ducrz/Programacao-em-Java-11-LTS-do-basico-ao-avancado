package br.com.geekuniversity.secao12;

//Classe base, classe mãe, super classe
public class Pessoa {	
	private String nome;
	private int ano_nascimento;
	private String email;	
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, int ano_nascimento, String email) {
		this.nome = nome;
		this.ano_nascimento = ano_nascimento;
		this.email = email;
	}	

	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAno_nascimento() {
		return this.ano_nascimento;
	}
	public String getEmail() {
		return this.email;
	}	
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAno_nascimento(int ano_nascimento) {
		this.ano_nascimento = ano_nascimento;
	}
	//Overriding / Sobrescrita de método
	public String toString() {
		return "Nome: "+this.nome + "\nAno Nascimento: " +this.ano_nascimento;
	}
	//Overloading / Sobrecarga de método
	public void mensagem() {
		System.out.println("Esta é a minha mensagem...");
	}
	
	public void mensagem(String msg) {
		System.out.println(msg);
	}
	
	public void mensagem(String msg, int num) {
		System.out.println(msg+num);
	}
}
