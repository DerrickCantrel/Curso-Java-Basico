package com.derrick.cursojava.aula19;

public class Arrays {

	public static void main(String[] args) {

		double[] temperatura = new double[365];
		
		temperatura[0] = 34.1;
		
		System.out.println("O valor da temperatura do dia 001, é: " + temperatura[0]);
		
		System.out.println("O tamanho do array: " + temperatura.length);
		
		
		for (int i = 0; i < temperatura.length; i++) {
			System.out.println("O valor da temperatura do dia "+ (i + 1) + ", é: " + temperatura[i]);
		}
		
		//for melhorado
		for (double temp : temperatura) {
			System.out.println(temp);
		}
	}

}
