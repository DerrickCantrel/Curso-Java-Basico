package com.derrick.cursojava.aula27;

public class Carro {
		String marca;
		String modelo;
		int numPassageiros;
		double capCombustivel;
		double consumoCombustivel;
		
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
