package com.derrick.cursojava.aula27;

public class Carro {
		String marca;
		String modelo;
		int numPassageiros;
		double capCombustivel;
		double consumoCombustivel;
		
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
