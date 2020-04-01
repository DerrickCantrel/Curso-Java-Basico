package com.derrick.cursojava.aula27.labs;

public class ContaCorrente {
	String numero;
	double saldo;
	boolean especial;
	double limite;
	
	double sacarDinheiro(double valor) {
		if (saldo == 0 || saldo < valor) {
			System.out.println("Seu saque n�o foi poss�vel.");
		} else {
			saldo = saldo  - valor;
		}
		
		return valor;
	}
	
	double depositarDinheiro(double valor) {
		if (limite < valor) {
			System.out.println("Tente fazer um dep�sito menor");
		} else {
			saldo = saldo + valor;
		}
		
		return valor;
	}
	
	double consultarSaldo() {
		return saldo;
	}
	
	boolean verificarCheque(boolean chequeEspecial) {
		if (chequeEspecial == true) {
			System.out.println("Cheque Especial");
		} else {
			System.out.println("N�o � Cheque Especial");
		}
		return chequeEspecial;
	}
}
