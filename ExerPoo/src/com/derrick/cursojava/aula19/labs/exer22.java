package com.derrick.cursojava.aula19.labs;

public class exer22 {

	public static void main(String[] args) {
		
		int um = 0;
		int zero = 0;
		int[]A = new int[10];
		
		for (int i = 0; i < A.length; i++) {
			A[i] = (int)Math.round(Math.random()*1);
			if (A[i] == 1) {
				um++;
			} else {
				zero++;
			}
		}

			System.out.println("O percetual de 1's: " + (um*10) + "%");
			System.out.println("O percetual de 0's: " + (zero*10) + "%");
			
		for (Integer i : A) {
			System.out.println(i);
		}

	}

}
