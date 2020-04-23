package com.derrick.itajava.week02.example01;

public class Somador {
	String nome;
	int valorInstancia = 0;
	static int valorEstatica = 0;
	
	void somar() {
		valorInstancia++;
		valorEstatica++;
	}
	
	void imprimir() {
		System.out.println("O Somador "+ nome +": Instancia= "+ valorInstancia +
					" e Estática= " + valorEstatica);
	}
}
