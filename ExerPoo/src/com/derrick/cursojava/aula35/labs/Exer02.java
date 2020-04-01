package com.derrick.cursojava.aula35.labs;

public class Exer02 {
	
	public static int SomaRecursiva(int num) {
		
		/*	
		 * soma(1) = 1 
		 * soma(2) = soma(1) + 2 = 3
		 * soma(3) = soma(2) + 3 = 6
		 * soma(4) = soma(3) + 4 = 10
		 * soma(5) = soma(4) + 5 = 15
		 * 
		 */
		if (num == 1) {
			return 1;
		}
		
		return SomaRecursiva(num-1) + num;
	}
	
}
