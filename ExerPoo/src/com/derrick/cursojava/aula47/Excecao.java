package com.derrick.cursojava.aula47;

public class Excecao {
	public static void  main (String[] args) {
		//TRATAR ERROS PERMITE QUE O PROGRAMA CONTINUE A SUA EXECUÇÃO
		try {
			int[] vetor = new int[4];
			
			System.out.println("Antes da Exception");
			
			vetor[4] = 1;
			
			System.out.println("Esse texto não será impresso");
		} catch(ArrayIndexOutOfBoundsException exception) {
			System.out.println("Exceção ao acessar um índice do vetor que não existe");
		}
		System.out.println("Esse texto será impresso após a exception");
	}
}
