package br.com.geekuniversity.secao11;

public class Conta {
	
	@SuppressWarnings("unused")
	private int numero;
	private float saldo;
	private float limite;
	
	Cliente cliente;	
	
	public Conta(int numero, float saldo, float limite, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
		this.cliente = cliente;		
	}
	
	public void sacar(float valor) {
		if(valor <= this.saldo) {			
			this.saldo= this.saldo - valor;	
			System.out.println("Saque realizado com sucesso.");

		}
		else if(valor <= (this.saldo + this.limite)) {
			//Calculando o valor excedente do saque acima do saldo.
			float val_ret = this.saldo - valor;
			if(val_ret < 0) {
				this.saldo = 0;
			}
			val_ret = this.limite + (val_ret);
			//Novo limite
			this.limite = val_ret;
			System.out.println("Saque realizado com sucesso.");
		}
		else {
			System.out.println("Saldo insuficiente!");
		}
	}
	/**
	*Método para realizar depósito
	*
	*@param valor a ser depositado
	*/
	
	public void depositar(float valor) {
		this.saldo = this.saldo + valor;
		
	}
	/**
	*Método getter do atributo Saldo
	*
	*@return a soma do saldo + limite
	*/
	public float getSaldo() {
		return this.saldo+ this.limite;
	}
	

}
