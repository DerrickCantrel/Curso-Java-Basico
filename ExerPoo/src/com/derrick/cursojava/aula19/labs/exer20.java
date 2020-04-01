package com.derrick.cursojava.aula19.labs;

import java.util.Scanner;

public class exer20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a cotação do dólar(U$) em relação ao real(R$): ");
		double dolar = sc.nextDouble();
		
		double[]A = new double[20];
		
		for (int i = 0; i < A.length; i++) {
			A[i] = dolar * i;
		}

	}

}
