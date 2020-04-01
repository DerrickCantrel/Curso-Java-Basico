package com.derrick.cursojava.aula33.labs;

public class TesteConta {

	public static void main(String[] args) {
		
		MinhaContaCorrente conta1 = new MinhaContaCorrente();
		
		conta1.setEspecial(false);
		conta1.ContaEspecial();
		
		conta1.Deposito(10000);
		conta1.setLimite(1500);
		System.out.println("");
		
		conta1.VerificarSaldo();
		conta1.Sacar(1000);
		conta1.VerificarSaldo();
	}
}
