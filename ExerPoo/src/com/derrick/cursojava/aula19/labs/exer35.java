package com.derrick.cursojava.aula19.labs;

import java.util.Scanner;

public class exer35 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[]A = new int[10];
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Digite um valor para 'A': ");
			A[i] = sc.nextInt();
		}
		
		for (int j = 0; j < A.length; j++) {
			for (int i = 1; i <= A[j]; i++) {
				if (A[j] % i == 0) {
					if (i == 1) {
						System.out.print("Divisores de " + A[j] + ": " + i + ", ");
					} else {
						if (i == A[j]) {
							System.out.println(i + " ");	
						} else {
							System.out.print(i + ", ");
						}
					}
					
				}
			}
		}
	}

}
