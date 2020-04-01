package com.derrick.cursojava.aula27.labs;

public class ContaCorrente {
	String numero;
	double saldo;
	boolean especial;
	double limite;
	
	double sacarDinheiro(double valor) {
		if (saldo == 0 || saldo < valor) {
			System.out.println("Seu saque não foi possível.");
		} else {
			saldo = saldo  - valor;
		}
		
		return valor;
	}
	
	double depositarDinheiro(double valor) {
		if (limite < valor) {
			System.out.println("Tente fazer um depósito menor");
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
			System.out.println("Não é Cheque Especial");
		}
		return chequeEspecial;
	}
}
