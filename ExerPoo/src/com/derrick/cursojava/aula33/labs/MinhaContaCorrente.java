package com.derrick.cursojava.aula33.labs;

public class MinhaContaCorrente {
	private int numero;
	private int saldo;
	private boolean especial;
	private int limite;
	
	public MinhaContaCorrente() {};
	
	public MinhaContaCorrente(int numero, int saldo, int limite) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
	}

	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public boolean getEspecial() {
		return especial;
	}

	public void setEspecial(boolean especial) {
		this.especial = especial;
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}
	
	private int AuxSaque(int valor) {
		int aux;
		
		if (getSaldo() != 0) {
			if (valor > getSaldo()) {
				aux  = 1;
			} else {
				if (valor > getLimite()) {
					aux = 2;
				} else {
					aux = 3;
				}
			}
		} else {
			aux = 0;
		}
		
		return aux;
	}
	
	public void Sacar(int valor) {
		int aux;
		aux = AuxSaque(valor);
		if (aux == 1) {
			System.out.println("Saldo indisponível");
		} else if (aux == 2) {
			System.out.println("O limite para o saque é: " + getLimite());
		} else if (aux == 3){
			setSaldo(getSaldo() - valor);
			System.out.println("Saque realizado com sucesso.");
		} else {
			System.out.println("Você não possui saldo.");
		}
	}
	
	public void Deposito(int valor) {
		setSaldo(getSaldo() + valor);
		System.out.println("Depósito realizado com sucesso!");
	}
	
	public void VerificarSaldo() {
		System.out.println("Seu saldo é:" + getSaldo());
	}
	
	public void ContaEspecial() {
		if (getEspecial() == false) {
			System.out.println("Essa conta não do tipo especial");
		} else {
			System.out.println("Essa conta é do tipo especial");
		}
	}
}