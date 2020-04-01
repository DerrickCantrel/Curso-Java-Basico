package com.derrick.cursojava.aula43.labs.exer01;

public class ContaEspecial extends ContaBancaria{
	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double sacar(int valor) {
		if (this.getSaldo() != 0 && valor < this.limite) {
			if (valor < getSaldo()) {
				setSaldo(getSaldo() - valor);
			} else {
				System.out.println("Saldo Insuficiente");
			}
		} else {
			System.out.println("Limite Indisponível");
		}
		return getSaldo();
	}
	
	@Override
	public String toString() {
		String s = super.toString() + "\n" +
				"Conta Especial" + "\n" +
				"Limite: " + limite + "\n" +
				"----------------------\n" ;
		
		return s;
	}
	
}
