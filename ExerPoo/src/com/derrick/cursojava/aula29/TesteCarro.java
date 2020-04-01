package com.derrick.cursojava.aula29;


public class TesteCarro {

	public static void main(String[] args) {
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		Carro van2 = new Carro("Fiat", "Ducato");
		System.out.println(van2.marca);
		System.out.println(van2.modelo);
	}
	
	Carro2 carro2 = new Carro2();

}
