package com.derrick.cursojava.aula19.labs;

import java.util.Scanner;

public class exer27 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[]A = new int[10];
		char[]B = new char[10];
		
		for (int i = 0; i  < A.length; i++) {
			System.out.println("Digite um valor: ");
			A[i] = sc.nextInt();
			if (A[i] < 7) {
				B[i] = 'a';
			} else if (A[i] == 7) {
				B[i] = 'b';
			} else if (A[i] > 7 && A[i] < 10) {
				B[i] = 'c';
			} else if (A[i] == 10) {
				B[i] = 'd';
			} else if (A[i] > 10) {
				B[i] = 'e';
			}
		}
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Vetor A: " + A[i]);
			System.out.println("Vetor B: " + B[i]);
		}

	}

}
