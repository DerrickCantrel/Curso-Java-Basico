package com.derrick.cursojava.aula43.labs.exer01;

public class Teste {

	public static void main(String[] args) {
		
		//ContaBancaria contaBancaria = new ContaBancaria();
		ContaPoupanca contaPoupanca = new ContaPoupanca();
		ContaEspecial contaEspecial = new ContaEspecial();
		
		contaPoupanca.setNomeCliente("Derrick");
		contaPoupanca.setNumConta("28073");
		
		contaEspecial.setNomeCliente("Maria");
		contaEspecial.setNumConta("89098");
		contaEspecial.setLimite(1500);
		
		//DEPÓSITOS
		contaPoupanca.depositar(10000);
		contaEspecial.depositar(5000);
		
		//SAQUE
		contaPoupanca.sacar(1000);
		contaEspecial.sacar(2000);
		
		//NOVO RENDIMENTO
		//contaPoupanca.calcularNovoSaldo(1.5);
		
		//DADOS DAS CONTAS
		System.out.println(contaPoupanca);
		System.out.println(contaEspecial);
		
		//SAQUE
		System.out.println(contaPoupanca.sacar(1000));
		System.out.println(contaEspecial.sacar(2000));
	}

}
