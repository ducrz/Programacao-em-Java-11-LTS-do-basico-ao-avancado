package br.com.geekuniversity.secao24;

public class Pessoa {

	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void falar(String msg) {
		msg = msg.replace("o", "0");
		System.out.println(this.getNome()+" disse "+msg);
	}
}
