package com.derrick.cursojava.aula20.labs;

import java.lang.Math;

public class exer01 {

	public static void main(String[] args) {
		
		int[][]M = new int[4][4];
		int maior = 0;
		int auxI = 0;
		int auxJ = 0;
		
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				M[i][j] = 0 + (int)Math.round(Math.random()* 9);
				System.out.println("M["+i+"] ["+j+"] "+ M[i][j]);
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				if (i == 0 && j ==0) {
					maior = M[i][j];
				}
				if (maior < M[i][j]) {
					maior = M[i][j];
					auxI = i;
					auxJ = j;
				} else {
					if (i == M.length && j == M[i].length) {
						auxI = i;
						auxJ = j;	
					}
				}
			}
		}
		System.out.println("M["+auxI+"]["+auxJ+"] "+maior);
	}

}
