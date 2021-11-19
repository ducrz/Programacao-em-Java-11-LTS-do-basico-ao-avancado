package geek;

public class Programa04 {
	
	//If, else, if else
	public static void main(String[] args) {
		//Declarando e inicializando a variável
		int numero = 2;
		
		//Se numero > 5 então faça
		if(numero > 5){
			System.out.println("Sim, o número "+numero+" é maior que 5!");
		}
		else if(numero == 5){
			System.out.println("O número "+numero+" é igual a 5!");

		}
		else if(numero %2 == 0) { //Se eh Par
			System.out.println("O número "+numero+" é PAR!");

		}
		else {
			System.out.println("Não, o número "+numero+ " não é maior que 5!");
		}
	}

}
