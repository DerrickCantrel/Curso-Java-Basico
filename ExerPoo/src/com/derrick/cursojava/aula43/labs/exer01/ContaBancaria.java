package com.derrick.cursojava.aula43.labs.exer01;

public abstract class ContaBancaria {
	private String nomeCliente;
	private String numConta;
	private double saldo;
	
	public ContaBancaria() {}
	
	public ContaBancaria(String nomeCliente, String numConta, double saldo) {
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double sacar(int valor) {
		if (this.getSaldo() != 0) {
			if (valor < getSaldo()) {
				setSaldo(getSaldo() - valor);
			} else {
				System.out.println("Saldo Insuficiente");
			}
		}
		return getSaldo();
	}
	
	public double depositar(double valor) {
		setSaldo(valor);
		return getSaldo();
	}

	@Override
	public String toString() {
		return "Conta Bancaria" + "\n" +
				"Nome do Cliente: " + nomeCliente + "\n" +
				"Número da Conta: " + numConta + "\n" +
				"Saldo: " + saldo;
	}
	
	
}
