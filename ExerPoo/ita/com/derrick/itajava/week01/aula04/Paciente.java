package com.derrick.itajava.week01.aula04;

public class Paciente {
	String nome;
	int idade;
	double peso;
	double altura;
	
	//Construtores
	Paciente() {}
	
	Paciente(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}
	
	//Métodos Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	//Métodos da Classe
	public double calcularIMC() {
		double imc = peso/(altura*altura); 
		
		return imc;
	}
	
	public String diagnostico() {
		double aux = calcularIMC();
		String resultado = "";
		
		if (aux <= 16) {
			resultado = "Baixo peso muito grave";
		} 
		else if(aux > 16 && aux <= 16.99) {
			resultado = "Baixo peso grave";
		}
		else if (aux > 17 && aux <= 18.49) {
			resultado = "Baixo peso";
		}
		else if (aux > 18.50 && aux <= 24.99) {
			resultado = "Peso normal";
		}
		else if (aux > 25 && aux <= 29.99) {
			resultado = "Sobrepeso";
		}
		else if (aux > 30 && aux <= 34.99) {
			resultado = "Obesidade grau I";
		}
		else if (aux > 35 && aux <= 39.99) {
			resultado = "Obesidade grau II";
		}
		else {
			resultado = "Obesidade grau III";
		}
		
		return resultado;
	}
}
