package com.derrick.cursojava.aula19.labs;

public class exer23 {

	public static void main(String[] args) {
		
		int[]A = new int[10];
		boolean impar = false;
		int impares = 0;
		int par = 2;
		
		for (int i = 0; i < A.length; i++) {
			A[i] = (int)Math.round(Math.random()*101);
		} 
		
		for (int i = 0; i < A.length; i++) {
			A[i] = par;
			par += 2;
		}
		
		do {
			for (Integer i : A) {
				if (i % 2 != 0) {
					impar = true;
					impares = i;
				}
			}
			
			if (impar == false) {
				System.out.println("Todos os elementos são pares.");
				impar = true;
			} else {
				System.out.println("Elemento ímpar encontrado: " + impares);
			}
		} while (impar == false);
		

	
	}

}
