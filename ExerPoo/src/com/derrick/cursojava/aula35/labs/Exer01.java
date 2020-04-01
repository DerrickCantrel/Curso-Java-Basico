package com.derrick.cursojava.aula35.labs;

public class Exer01 {
	
	public static int fibonacciR(int num) {
		
		if (num < 2) {
			return 1;
		}
		/* 0 1 1 2 3 5 8 13
		 * fibonacci(n) = fibonacci(num-1) + num-2
		 * fibonacci(0) = 0
		 * fibonacci(1) = 1
		 * fibonacci(2) = 1 
		 * fibonacci(3) = finabonacci(2) + finabonacci(1) = 2
		 * fibonacci(4) = finabonacci(3) + finabonacci(2) = 3
		 * fibonacci(5) = finabonacci(4) + finabonacci(3) = 5
		 */
		
		return fibonacciR(num-1) + fibonacciR(num-2);
	}
	
}
