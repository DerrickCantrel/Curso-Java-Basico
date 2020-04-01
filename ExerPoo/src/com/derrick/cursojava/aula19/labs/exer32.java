package com.derrick.cursojava.aula19.labs;

import java.util.Scanner;

public class exer32 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[]A = new int[5];
		int resultado = 0;
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Digite um valor para 'A': ");
			A[i] = sc.nextInt();
		}
		
		for (int j = 0; j < A.length; j++) {
			for (int i = 1; i <= 10; i++) {
				resultado = i * A[j];
				System.out.println(i + " x " + A[j] + " = " + resultado);
			}
		}
	}

}
