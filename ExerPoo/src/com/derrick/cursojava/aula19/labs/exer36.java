package com.derrick.cursojava.aula19.labs;

import java.util.Scanner;

public class exer36 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[]A = new int[11];
		int base = 2;
		
		for (int j = 0; j < A.length; j++) {
			if (j == 0) {
				A[j] = 1;
			} else {
				if (j == 1) {
					A[j] = 2;	
				} else {
					int potencia = 2;
					for (int i = 1; i <= j; i++) {
						potencia = potencia * base;
					}
					A[j] = potencia;
				}
			}
		}
		
		for (int j = 0; j < A.length; j++) {
			System.out.println("A[" + j + "]= " + A[j]);
		}
	}

}
