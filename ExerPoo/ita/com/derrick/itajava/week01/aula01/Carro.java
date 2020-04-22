package com.derrick.itajava.week01.aula01;

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
}
