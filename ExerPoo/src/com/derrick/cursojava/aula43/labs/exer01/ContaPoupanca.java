package com.derrick.cursojava.aula43.labs.exer01;

public class ContaPoupanca extends ContaBancaria{
	private double diaRendimento;

	public double getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(double diaRendimento) {
		this.diaRendimento = diaRendimento;
	}

	public double calcularNovoSaldo(double taxa) {
		this.setDiaRendimento(taxa);
		super.setSaldo(super.getSaldo() + (super.getSaldo() * this.getDiaRendimento()));
		
		return super.getSaldo();
	}
	
	  @Override
	public String toString() {
		String s = super.toString() + "\n" + 
				"Conta Poupanca" + "\n" + 
				"dia Rendimento: " + diaRendimento + "\n" +
				"----------------------\n" ;
		return s;
	}
	
}
