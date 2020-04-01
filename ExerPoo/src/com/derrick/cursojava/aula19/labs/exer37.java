package com.derrick.cursojava.aula19.labs;

import java.util.Scanner;

public class exer37 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[]A = new int[5];
		int[]B = new int[5];
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Informe o "+(i+1)+"° número: ");
			A[i] = sc.nextInt();
		}
	
		for (int i = 0; i < A.length; i++) {
			int aux = A[i];
			for (int j = aux; j > 1; j--) {
				aux = aux * (j-1);
			}
			B[i] = aux;
			System.out.println("Vetor B"+"["+i+"] = " + B[i]);
		}
	}

}
