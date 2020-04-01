package com.derrick.cursojava.aula19.labs;

import java.util.Scanner;

public class exer29 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[]A = new int[10];
		int[]B = new int[10];
		int[]C = new int[20];
		int j = 0;
		
		for (int i = 0; i  < A.length; i++) {
			System.out.println("Digite um valor para 'A': ");
			A[i] = sc.nextInt();
			System.out.println("Digite um valor para 'B': ");
			B[i] = sc.nextInt();
		}
		
		for (int i = 0; i < C.length; i++) {
			if (i < A.length) {
				C[i] = A[i];
			}
			if (i >= B.length) {
				C[i] = B[j];
				j++;
			}
		}
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Vetor A: " + A[i]);
		}
		
		for (int i = 0; i < B.length; i++) {
			System.out.println("Vetor B: " + B[i]);
		}
		
		for (int i = 0; i < C.length; i++) {
			System.out.println("Vetor C: " + C[i]);
		}

	}

}
