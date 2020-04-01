package com.derrick.cursojava.aula19.labs;

public class exer06 {

	public static void main(String[] args) {
		double[] A = new double[10];
		double[] B = new double[10];
		double[] C = new double[10];
		for (int i = 0; i < A.length; i++) {
			A[i] = i;
			B[i] = i; 
			C[i] = A[i] + B[i];
			System.out.println("Vetor A: " + A[i]);
			System.out.println("Vetor B: " + B[i]);
			System.out.println("Vetor C: " + C[i]);
		}
	}

}
