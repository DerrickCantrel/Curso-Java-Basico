package com.derrick.cursojava.aula29;

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
	
	public Carro(String marca_, String modelo_) {
		marca = marca_;
		modelo = modelo_;
	}
	
	//MÉTODO SEM RETORNO
	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
	}
	//MÉTODO COM RETORNO
	double obterAutonomia() {
		System.out.println("Método obterAutonomia foi chamado");
		return capCombustivel * consumoCombustivel;
	}
	//MÉTODO COM PARÂMETRO
	double calcularCombustivel(double km) {
		
		double qtdCombustivel = km/consumoCombustivel;
		
		return qtdCombustivel;
	}
}
