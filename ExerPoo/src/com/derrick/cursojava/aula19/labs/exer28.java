package com.derrick.cursojava.aula19.labs;

import java.util.Scanner;

public class exer28 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[]A = new int[10];
		int[]B = new int[10];
		int j = 9;
		
		for (int i = 0; i  < A.length; i++) {
			System.out.println("Digite um valor: ");
			A[i] = sc.nextInt();
		}
		
		for (int i = 0; i  < A.length; i++) {
			B[i] = A[j];
			j--;
		}
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Vetor A: " + A[i]);
		}
		
		for (int i = 0; i < B.length; i++) {
			System.out.println("Vetor B: " + B[i]);
		}
	}

}
