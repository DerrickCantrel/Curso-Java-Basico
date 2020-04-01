package com.derrick.cursojava.aula27.labs;

public class TesteConta {

	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente();
		c1.numero = "9895654";
		c1.saldo = 100.00;
		c1.especial = false;
		c1.limite = 1000.00;

		
		double depositoC1 = c1.depositarDinheiro(300.00);
		System.out.println("N° da Conta: " + c1.numero);
		System.out.println("Depositado: " + depositoC1);
		
		System.out.println();
		
		double saqueC1 = c1.sacarDinheiro(200.00);
		System.out.println("N° da Conta: " + c1.numero);
		System.out.println("Sacado: " + saqueC1);
		
		System.out.println();
		
		double saldoC1 = c1.consultarSaldo();
		System.out.println("N° da Conta: " + c1.numero);
		System.out.println("Saldo: " + saldoC1);
		
		System.out.println();
		
		c1.verificarCheque(false);
	}
}
