package com.derrick.cursojava.aula19.labs;

import java.util.Scanner;

public class exer25 {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		int[]A = new int[10];
		int []B = new int[10];
		
		for (int i = 0; i  < A.length; i++) {
			System.out.println("Digite um valor: ");
			A[i] = sc.nextInt();
			if (A[i] % 2 == 0) {
				B[i] = 1;
			} else {
				B[i] = 0;
			}
		}
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Vetor A: " + A[i]);
			System.out.println("Vetor B: " + B[i]);
		}

	}

}
