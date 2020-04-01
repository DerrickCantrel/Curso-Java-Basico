package com.derrick.cursojava.aula30;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	public Carro() {
		System.out.println("Classe Carro foi instaciada");
		numPassageiros = 4;
	}
	
	public Carro(String marca, String modelo, int numPassageiros) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println("Chamando construtor com 3 par�metros");
	}

	public Carro(String marca, String modelo) {
		this(marca, modelo, 10);
		System.out.println("Chamando construtor com 2 par�metros");
	}
	
	//M�TODO SEM RETORNO
	void exibirAutonomia() {
		System.out.println("A autonomia do carro �: " + capCombustivel * consumoCombustivel + " km");
	}
	//M�TODO COM RETORNO
	double obterAutonomia() {
		System.out.println("M�todo obterAutonomia foi chamado");
		return capCombustivel * consumoCombustivel;
	}
	//M�TODO COM PAR�METRO
	double calcularCombustivel(double km) {
		
		double qtdCombustivel = km/consumoCombustivel;
		
		return qtdCombustivel;
	}
}
