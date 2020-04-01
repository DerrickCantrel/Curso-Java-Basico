package com.derrick.cursojava.aula19.labs;

public class exer04 {

	public static void main(String[] args) {
		double[] A = new double[15];
		double[] B = new double[15];
		for (int i = 0; i < A.length; i++) {
			A[i] = i;
			B[i] = Math.sqrt(A[i]); 
			System.out.println("Vetor A: " + A[i]);
			System.out.println("Vetor B: " + B[i]);
		}
	}

}
