package br.com.geekuniversity.secao14;

public interface IEletronico {
	//Interface para servir de contrato para produtos eletrônicos.
	//Todo produto eletrônico que implementar esta interface OBRIGATORIAMENTE
	//deverão implementar os métodos abstratos.
	
	public String MARCA= "Geek";
	public void ligar();
	public void desligar();
	

}
