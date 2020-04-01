package com.derrick.cursojava.aula19.labs;

import java.util.Scanner;

public class exer30 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[]A = new int[5];
		int[]B = new int[5];
		int[]C = new int[5];
		int par = 0;
		int impar = 0;
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Digite um valor para 'A': ");
			A[i] = sc.nextInt();
			if (A[i] % 2 == 0) {
				B[par] = A[i];
				par++;
			} else {
				C[impar] = A[i];
				impar++;
			}
		}
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Vetor A: " + A[i]);
			if (B[i] != 0) {
				System.out.println("Vetor B: " + B[i]);	
			} 
			if (C[i] != 0) {
				System.out.println("Vetor C: " + C[i]);
			}
		}
	}
}
