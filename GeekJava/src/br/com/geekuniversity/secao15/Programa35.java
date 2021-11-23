package br.com.geekuniversity.secao15;

public class Programa35 {
	//Métodos estáticos

	public static void main(String[] args) {
		
		Conta c1 = new Conta("Meu cliente");
		System.out.println("Número da conta: "+c1.getNumero());
		System.out.println("Cliente: "+c1.getCliente());
		System.out.println("A próxima conta será: "+Conta.proximaConta());

	}

}
