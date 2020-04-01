package com.derrick.cursojava.aula51;

public class UsandoMinhaException {

	public static void main(String[] args) {
		
		int[] numeros = {4, 8, 5, 16, 32, 21, 64, 128};
		int[] denom = {2, 0, 4, 8, 0, 2, 4};

		for (int i=0; i < numeros.length; i++) {
			try {
				if (numeros[i] % 2 != 0) {
					//lan�ar a exception
					throw new Exception("N�mero �mpar, Divis�o n�o exata.");
				}
				System.out.println(numeros[i] + "/" + denom[i] + " = " + (numeros[i]/denom[i]));
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println("Aconteceu um erro");
			} catch (Exception e) {
				System.out.println("Aconteceu um erro gen�rico");
				e.getMessage();
			}
		}

	}

}
