package com.derrick.cursojava.aula35;

	public class Calculadora {
		
		public static int soma(int num1, int num2) {
			return num1 + num2;
		}
		
		public static int subtr(int num1, int num2) {
			return num1 - num2;
		}
		
		public static double divi(int num1, int num2) {
			return num1/num2;
		}
		
		public static int multi(int num1, int num2) {
			return num1 * num2;
		}
		
		// Método Estático para Potencia
		public static int poten(int num1, int num2) {
			int aux = num1;
			for (int i = 1; i < num2; i++) {
				num1 = num1 * aux;
			}
			return num1;
		}
		
		public static int fator(int num1) {
			int aux = num1;
			
			if (num1 == 0) {
				
				return 1;
			
			} else {
			
				for (int i = num1; i > 1; i--) {
					num1--;
					aux *= num1;
				}
				
				return aux;
			}
		}
		
		//MÉTODO RECURSIVO
		/*
		 * fatorial(n) = n * fatorial(n-1); GENERALIZAÇÃO
		 * fatorial(5) = 5 * fatorial(4);
		 * fatorial(4) = 4 * fatorial(3);
		 * fatorial(3) = 3 * fatorial(2);
		 * fatorial(2) = 2 * fatorial(1);
		 * fatorial(1) = 1 * fatorial(0);
		 * fatorial(0) = 1;
		 */
		public static int fatorRecur(int num) {
			
			if (num == 0) {
				return 1;
			}
			
			return num * fatorRecur(num - 1);
		}
	}
