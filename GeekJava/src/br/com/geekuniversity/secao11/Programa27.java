package br.com.geekuniversity.secao11;

public class Programa27 {

	public static void main(String[] args) {

		Cliente cli1 = new Cliente("Felicity Jones", "Rua X");
		
		System.out.println("Nome: "+cli1.getNome());
		System.out.println("Endereço: "+cli1.getEndereco());

		
		cli1.dizer_oi();
		
		Cliente cli2 = new Cliente("Angelina Jolie", "Rua Y");
		
		System.out.println("Nome: "+cli2.getNome());
		System.out.println("Endereço: "+cli2.getEndereco());
		
		cli2.dizer_oi();


	}
	

}
