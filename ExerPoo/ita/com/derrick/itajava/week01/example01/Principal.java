package com.derrick.itajava.week01.example01;

public class Principal {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		c1.potencia = 10;
		c1.nome = "Corolla";
		c1.velocidade = 0;
		
		c1.acelerar();
		c1.acelerar();
		c1.frear();
		c1.imprimir();
		
		Carro c2 = new Carro();
		c2.potencia = 20;
		c2.nome = "Civic";
		c2.velocidade = 0;
		
		c2.acelerar();
		c2.acelerar();
		c2.frear();
		c2.imprimir();
	}

}
