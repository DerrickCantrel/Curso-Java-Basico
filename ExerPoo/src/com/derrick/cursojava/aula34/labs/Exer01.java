package com.derrick.cursojava.aula34.labs;

public class Exer01 {

	public static void main(String[] args) {
		System.out.println("Primeira Instancia");
		Contador contador = new Contador();
		
		contador.ValorCont(); //1
		
		System.out.println("Segunda Instancia");
		Contador contador2 = new Contador();
		
		contador2.ValorCont(); //2
		
		System.out.println("Terceira Instancia");
		Contador contador3 = new Contador();
		
		contador3.ValorCont(); //3
		contador3.ZerarCont();
		contador3.ValorCont();
		
		System.out.println("");
		System.out.println("Resultado: " + Contador.cont);
	}

}
