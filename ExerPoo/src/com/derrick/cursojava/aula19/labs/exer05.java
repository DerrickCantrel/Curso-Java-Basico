package com.derrick.cursojava.aula19.labs;

public class exer05 {

	public static void main(String[] args) {
		double[] A = new double[10];
		double[] B = new double[10];
		for (int i = 0; i < A.length; i++) {
			A[i] = i;
			B[i] = A[i] * i; 
			System.out.println("Vetor A: " + A[i]);
			System.out.println("Vetor B: " + B[i]);
		}

	}

}