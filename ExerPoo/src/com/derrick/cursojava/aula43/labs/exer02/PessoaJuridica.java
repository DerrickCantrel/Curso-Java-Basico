package com.derrick.cursojava.aula43.labs.exer02;

public class PessoaJuridica extends Contribuintes{
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public double calcularImposto() {

		return this.getRendaBruta() * 0.1;
	}
	
	@Override
	public String toString() {
		String s = "\nPessoa Jurídica\n";
		s += super.toString();
		s += "\n" + "Cnpj: " + cnpj;
		s += "\nImposto a ser pago: " + calcularImposto();
		
		return s;
	}
}
