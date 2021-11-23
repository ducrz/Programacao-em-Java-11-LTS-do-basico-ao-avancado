package br.com.geekuniversity.secao14;

//Interfaces
public class Programa33 {

	public static void main(String[] args) {

		Ventilador vent = new Ventilador();
		
		System.out.println("A marca do ventilador é: "+vent.MARCA);
		
		vent.desligar();//Não imprimir a mensagem
		
		vent.ligar(); //Imprimir a mensagem
		vent.desligar(); //Deve imprimir a mensagem
		
		
	}

}
