package com.derrick.cursojava.aula19.labs;

import java.util.Scanner;

public class exer26 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[]A = new int[10];
		int []B = new int[10];
		int []C = new int[10];
		
		for (int i = 0; i  < A.length; i++) {
			System.out.println("Digite um valor para 'A': ");
			A[i] = sc.nextInt();
			System.out.println("Digite um valor para 'B': ");
			B[i] = sc.nextInt();
			if (A[i] > B[i]) {
				C[i] = 1;
			} else if (A[i] == B[i]) {
				C[i] = 0;
			} else if (A[i] < B[i]) {
				C[i] = -1;
			}
		}
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Vetor A: " + A[i]);
			System.out.println("Vetor B: " + B[i]);
			System.out.println("Vetor C: " + C[i]);
		}

	}

}
