package com.derrick.cursojava.aula56.labs;


public class Calculadora {

	public static void main(String[] args) {
		
		double x = 10;
		double y = 2;
		
		//values() itera os elementos do enum
		for (Operacoes op : Operacoes.values()) {
			System.out.print(x + " ");
			System.out.print(op.toString() + " ");
			System.out.print(y + " = ");
			System.out.print(op.executarOperacao(x, y));
			System.out.println();
		}
	}
	
	public static enum Operacoes {
		SOMA("+") {
			@Override
			public double executarOperacao(double num1, double num2) {
				return num1 + num2;
			}
		},
		SUBTRACAO("-") {
			@Override
			public double executarOperacao(double num1, double num2) {
				return num1 - num2;
			}
		},
		MULTIPLICACAO("*") {
			@Override
			public double executarOperacao(double num1, double num2) {
				return num1 * num2;
			}
		},
		DIVISAO("/") {
				@Override
				public double executarOperacao(double num1, double num2) {
					return num1 / num2;
				}
		};

		private String operacao;
		
		Operacoes(String operacao){
			this.operacao = operacao;
		}
		
		public abstract double executarOperacao(double num1, double num2);
		
		@Override
		public String toString() {
			return this.operacao;
		}
	}
}
