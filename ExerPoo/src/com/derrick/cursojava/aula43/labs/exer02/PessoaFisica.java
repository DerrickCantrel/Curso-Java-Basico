package com.derrick.cursojava.aula43.labs.exer02;

public class PessoaFisica extends Contribuintes {
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public double calcularImposto() {
		double renda = getRendaBruta();
		
		if (renda <= 1400) {
			return 0;
		}
		
		if (renda > 1400 && renda <= 2100) {
			return (renda * 0.1) - 100;
		}
		
		if (renda > 2100 && renda <= 2800) {
			return (renda * 0.15) - 270;
		}
		
		if (renda > 2800 && renda <= 3600) {
			return (renda * 0.25) - 500;
		}
		
		// maior que 3600
		return (renda * 0.3) - 700;
	}
	
	@Override
	public String toString() {
		String s = "\nPessoa Física\n";
		s += super.toString();
		s += "\n" + "Cpf: " + cpf;
		s += "\nImposto a ser pago: " + calcularImposto();
		
		return s;
	}
	
}
