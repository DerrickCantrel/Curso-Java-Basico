package com.derrick.cursojava.aula45;

public class Teste2 {

	public static void main(String[] args) {
		
		/*
		 * DownCasting s� funciona quando estiver se referenciando
		 * um tipo em particular.
		 */
		Object obj1 = obterString();
		String s1 = (String) obj1; //downCasting
		
		Object obj2 = "Minha String";
		String s2 = (String) obj2;
		
		Object obj3 = new Object(); //N�o referencia nenhum objeto;
		String s3 = (String) obj3;
		
		//Falha em tempo de execu��o
		Object obj4 = obterInteiro();
		String s4 = (String) obj4;
	}
	
	public static String obterString() {
		return "Minha String";
	}
	
	public static int obterInteiro() {
		return 1;
	}

}
