package com.derrick.itajava.week01.example03;

public class Compra {
	int valorTotal;
	int numParcelas;
	
	//A vista
	public Compra(int valor) {
		valorTotal = valor;
		numParcelas = 1;
	}
	
	//Parcelado
	public Compra(int qtdParcelas, int valorParcela) {
		numParcelas = qtdParcelas;
		valorTotal = qtdParcelas * valorParcela;;
	}

	public int getValorTotal() {
		return valorTotal;
	}

	public int getNumParcelas() {
		return numParcelas;
	}
	
	public int getValorParcela() {
		return valorTotal/numParcelas;
	}
}
