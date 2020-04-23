package com.derrick.itajava.week01.example02;

public class Carro {
	int potencia;
	int velocidade;
	String nome;
	
	void acelerar() {
		velocidade += potencia;
	}
	
	void frear() {
		velocidade = velocidade/2;
	}
	
	int getVelocidade() {
		return velocidade;
	}
	
	void imprimir() {
		System.out.println("O Carrro " + nome + " Está a velocidade: " + getVelocidade() + " km/h");
	}
	
	Carro(String nome) {
		this.nome = nome;
		velocidade = 0;
	}
}
