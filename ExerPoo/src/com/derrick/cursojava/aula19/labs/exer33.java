package com.derrick.cursojava.aula19.labs;

import java.util.Scanner;

public class exer33 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[]A = new int[5];
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Digite um valor para 'A': ");
			A[i] = sc.nextInt();
		}
		
		for (int j = 0; j < A.length; j++) {
			int primo = 0;
			for (int i = 1; i <= A[j]; i++) {
				if (A[j] % i == 0) {
					primo++;
				}
			}
			if (primo == 2) {
				System.out.println(A[j] + " é primo!!");
			} else {
				System.out.println(A[j] + " não é primo!!");
			}
		}
		

	}

}
