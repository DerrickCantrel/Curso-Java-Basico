package com.derrick.cursojava.aula19.labs;

import java.util.Scanner;

public class exer31 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[]A = new int[5];
		int[]B = new int[5];
		int par = 0;
		int impar = 0;
		int j = 0;
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Digite um valor para 'A': ");
			A[i] = sc.nextInt();
			if (A[i] % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}
		
		if (par > 0) {
			for (int i = 0; i < A.length; i++) {
				if (A[i] % 2 == 0){
					B[j] = A[i];
					j++;
				}
			}
		}
		if (impar > 0) {
			for (int i = 0; i < A.length; i++) {
				if (A[i] % 2 != 0){
					B[j] = A[i];
					j++;
				}
			}
		}
		
		for (int i = 0; i < B.length; i++) {
			System.out.println(B[i]);
		}
	}
}
