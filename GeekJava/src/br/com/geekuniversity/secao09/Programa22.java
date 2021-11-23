package br.com.geekuniversity.secao09;

public class Programa22 {
	//Objetos
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int numero = 4;
		
		//Declaração de um objeto
		Produto p0;
		
		//Declaração e instanciação/iniciação do Objeto	
		//p1 -> instância do objeto / objeto
		Produto p1 = new Produto();	//Construtor
		p1.nome = "Notebook";
		p1.preco= 2.551f; //Float
		p1.desconto= 15.0f; //Float
		
		System.out.println("============== Produtos ==========");
		System.out.println(p1.nome);
		System.out.println("R$ "+p1.preco);
		System.out.println(p1.desconto+" %");
		
		p0 = new Produto(); //Construtor
		p0.nome="Caneta Bic";
		p0.preco = 3.5f;
		p0.desconto= 5;
		System.out.println("");
		
		System.out.println(p0.nome);
		System.out.println("R$ "+p0.preco);
		System.out.println(p0.desconto+" %");
		
		
		Pessoa pessoa1 = new Pessoa(); //Construtor
		pessoa1.nome="Eduardo Monteiro";
		pessoa1.email = "eduardo@gmail.com";
		pessoa1.ano_nascimento= 1989;
		
		System.out.println("============= Pessoas =============");
		System.out.println("Nome: "+pessoa1.nome);
		System.out.println("E-mail: "+pessoa1.email);
		System.out.println("Ano de Nascimento: "+pessoa1.ano_nascimento);
		
	
		
		//System.out.println(p1);
		

	}

}
