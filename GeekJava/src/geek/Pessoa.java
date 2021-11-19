package geek;
//Classes
//Atributos
public class Pessoa {

	String nome, email;
	int ano_nascimento;
	
	//Construtor vazio, criado por padrão pela JVM em tempo de execução.
	public Pessoa() {
		
	}
	
	//Construtor com parâmetros	
	public Pessoa(String nome, String email, int ano_nascimento) {
		//this == Este objeto
		this.nome = nome;
		this.email = email;
		this.ano_nascimento = ano_nascimento;
	}
	
	void imprime_informacoes() {
		System.out.println("Nome: "+this.nome);
		System.out.println("E-mail: "+this.email);
		System.out.println("Ano de Nascimento: "+this.ano_nascimento);
	}
	
}
