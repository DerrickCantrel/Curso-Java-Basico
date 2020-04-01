package com.derrick.cursojava.aula30;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro("Fiat", "Ducato");
		van.consumoCombustivel = 20;
		
		System.out.println(van.numPassageiros);
		
		System.out.println(van.calcularCombustivel(50));
	}

}
