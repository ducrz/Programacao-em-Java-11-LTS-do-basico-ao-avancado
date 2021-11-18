package geek;

public class Programa15 {
	//Operações Matemáticas
	public static void main(String[] args) {
		
		int num1=5, num2=9, res;
		float res2;
		
		//Soma
		res = num1 + num2;
		
		System.out.println("A soma de "+num1+" + "+num2+" é: "+res);
		
		//Subtração
		
		res = num2 - num1;
		System.out.println("O resto de "+num1+" - "+num2+" é: "+res);
		
		//Divisão Inteira
		
		res = num2 / num1;
		System.out.println("O quociente de "+num1+" % "+num2+" é: "+res);
		
		//Divisão Real
		
		res2 = (float) num2 / (float)num1;
		System.out.println("O quociente de "+num1+" / "+num2+" é: "+res2);
		
		
		//Multiplicação
		
		res = num2 * num1;
		System.out.println("O produto de "+num1+" * "+num2+" é: "+res);

		//Módulo
		
		res = num1 % 2;
		
		String numeroimparoupar="";
		
		if(res == 0) {
			numeroimparoupar= "Par";
		}
		else {
			numeroimparoupar= "Ímpar";
		}
		System.out.println("O resto da divisão de "+num1+" por 2 é "+res+". O número é "+numeroimparoupar+"");
		

		res = num2 % 3;
		System.out.println(num2+ " é divisível por 3? " +res);
	}

}
