package geek;

public class Programa24 {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa(); //(Método) Construtor da Classe Pessoa
		
		pessoa1.nome = "Eduardo Monteiro";
		pessoa1.email = "eduardo@gmail.com";
		pessoa1.ano_nascimento = 1989;
		
		//System.out.println("Nome: "+pessoa1.nome);
		//System.out.println("E-mail: "+pessoa1.email);
		//System.out.println("Ano de Nascimento: "+pessoa1.ano_nascimento);
		
		pessoa1.imprime_informacoes();
		
		Pessoa pessoa2 = new Pessoa("Angelina Jolie", "angelina.jolie@gmail.com", 1975);
		
		pessoa2.imprime_informacoes();

	}

}
