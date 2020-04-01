package com.derrick.cursojava.aula19.labs;

import java.util.Scanner;

public class exer34 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[]A = new int[10];
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Digite um valor para 'A': ");
			A[i] = sc.nextInt();
		}
		
		for (int j = 0; j < A.length; j++) {
			for (int i = 0; i <= A[j]; i = i + 2) {
				if (i == 0) {
					System.out.print("Números pares até "+A[j] + ": " + i + ", ");
				} else {
					if (i == A[j] || i == A[j] - 1) {
						System.out.print(i + " ");
					} else {
						System.out.print(i + ", ");	
					}
				}
				if (i == A[j] || i == A[j] - 1) {
					System.out.println(" ");	
				}
			}
		}
		

	}

}
