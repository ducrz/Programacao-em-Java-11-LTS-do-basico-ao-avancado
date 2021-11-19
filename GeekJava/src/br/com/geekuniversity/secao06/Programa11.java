package br.com.geekuniversity.secao06;

public class Programa11 {
	
	//Tipos de Dados
	//Numéricos (Inteiros e Reais)
	
	public static void main(String[] args) {
		
		//Tipos primários / Primitivos
		long num0 = 99;
		int num1 = 4; //Inteiro cabe número manior
		
		short num2 = 4; //Inteiro  cabe menor(curto,menor,baixo)
		
		byte num3 = 4; //Inteiro, menor
		char num8= 34;
		
		
		//Tipos não primários / Não Primitivos
		Long num7 = (long) 9999; //Cast
		
		Integer num4 = 98;
		
		Short num5 =7;
		
		Byte num6 = 9;
		Character num9 = 35;
		
		System.out.println("long -> Num0= "+num0);
		System.out.println("int -> Num1= "+num1);
		System.out.println("short -> Num2= "+num2);
		System.out.println("byte -> Num3= "+num3);
		System.out.println("char -> Num8= "+num8);

		System.out.println("Long -> Num7= "+num7);
		System.out.println("Integer -> Num4= "+num4);
		System.out.println("Short -> Num5= "+num5);
		System.out.println("Byte -> Num6= "+num6);
		System.out.println("Charactere -> Num9= "+num9);

		
		System.out.println("long/Long "+ Long.SIZE +" bits");

		System.out.println("int/Integer "+ Integer.SIZE +" bits");
		System.out.println("short/Short "+ Short.SIZE + " bits");
		System.out.println("byte/Byte "+ Byte.SIZE + " bits");	
		System.out.println("char/Charactere "+ Character.SIZE + " bits");	

		
		System.out.println("Valor Min long/Long " +Long.MIN_VALUE);
		System.out.println("Valor Max long/Long " +Long.MAX_VALUE);
		
		System.out.println("Valor Min int/Integer " +Integer.MIN_VALUE);
		System.out.println("Valor Max int/Integer " +Integer.MAX_VALUE);
		
		System.out.println("Valor Min short/Short " +Short.MIN_VALUE);
		System.out.println("Valor Max short/Short " +Short.MAX_VALUE);
		
		System.out.println("Valor Min byte/Byte " +Byte.MIN_VALUE);
		System.out.println("Valor Max byte/Byte " +Byte.MAX_VALUE);
		
		System.out.println("Valor Min char/Character " +Character.MIN_VALUE);
		System.out.println("Valor Max char/Character " +Character.MAX_VALUE);
		
	}

}
