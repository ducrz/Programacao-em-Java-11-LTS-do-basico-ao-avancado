package br.com.geekuniversity.secao19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.geekuniversity.secao11.Cliente;

//Listas
public class Programa47 {

	public static void main(String[] args) {
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		Cliente cli1 = new Cliente(18, "Maria", "Rua 1");
		Cliente cli2 = new Cliente(46, "Angelina Jolie", "Rua 1");
		Cliente cli3 = new Cliente(32, "Felicity Jones", "Rua 2");
		
		clientes.add(cli1);		
		clientes.add(cli2);
		clientes.add(cli3);
		
		
		Collections.sort(clientes);

		
		for(Cliente cliente : clientes) {
			System.out.println(cliente);
		}
	}

}
