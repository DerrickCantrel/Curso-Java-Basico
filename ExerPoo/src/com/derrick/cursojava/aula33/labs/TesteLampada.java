package com.derrick.cursojava.aula33.labs;

public class TesteLampada {

	public static void main(String[] args) {
		MinhaLampada lampada = new MinhaLampada();
		
		lampada.DesligarLampada();
		
		lampada.LigarLampada();
		lampada.LigarLampada();
		lampada.LigarLampada();
		
		lampada.DesligarLampada();
		lampada.DesligarLampada();
	}

}
