package br.com.geekuniversity.secao01;

import br.com.geekuniversity.secao11.Cliente;

public class Programa26 {

	public static void main(String[] args) {

			Cliente cli = new Cliente(46, "Angelina Jolie", "Rua H");
			
			//System.out.println("Nome: "+cli.nome);
			//System.out.println("Endereço: "+cli.endereco);
			
			//cli.dizer_oi();
			
			cli.hashCode();
			
			System.out.println(cli.hashCode());

	}

}
