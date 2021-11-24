package br.com.geekuniversity.secao11;

public class Programa25 {

	public static void main(String[] args) {

		Cliente joao = new Cliente(21, "João Silva", "Rua X, Nº 0");
		Cliente maria = new Cliente(22, "Maria Silva", "Rua X, Nº 0");
		
		Conta conta_joao = new Conta(1, 100.0f, 200.0f, joao);
		Conta conta_maria = new Conta(2, 300.0f, 600.0f, maria);
		
		System.out.println("Saldo João (antes do Saque): R$ "+conta_joao.getSaldo());
		System.out.println("Saldo Maria: R$ "+conta_maria.getSaldo());

		//Saque
		conta_joao.sacar(150);
		
		System.out.println("Saldo João (depois do Saque): R$ "+conta_joao.getSaldo());

		//Encapsulamento não permite mudanças indevidas
		//conta_joao.saldo = -9000;		
		//conta_joao.limite =100000.000f;
		

	}

}
