package com.derrick.cursojava.aula20.labs;

import java.util.Scanner;

public class exer03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][]M = new int[3][3];
		int pares = 0;
		int impares = 0;
		
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				System.out.println("Entre com um número: ");
				M[i][j] = sc.nextInt();
				if (M[i][j] % 2 == 0) {
					pares++;
				} else {
					impares++;
				}
			}
		}

		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				System.out.println("M["+i+"] ["+j+"] "+ M[i][j]);
			}
		}
		
		System.out.println();
		System.out.println("Qtd de pares: " + pares);
		System.out.println("Qtd de ímpares: " + impares);
	}

}
