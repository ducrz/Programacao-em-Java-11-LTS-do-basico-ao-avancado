package br.com.geekuniversity.secao21;

//Pilhas
public class Programa60 {

	public static void main(String[] args) {
		
		Pilha pilha = new Pilha();
		
		System.out.println(pilha);
		
		pilha.insere("Angelina");
		
		pilha.insere("Felicity");
		
		System.out.println(pilha);
		
		String ret = pilha.pegaTopo();
		System.out.println(ret);
		
		String r1 = pilha.remove();
		System.out.println(r1);
		
		System.out.println(pilha);
		
		pilha.remove();
		System.out.println(pilha.vazia());

	}

}
