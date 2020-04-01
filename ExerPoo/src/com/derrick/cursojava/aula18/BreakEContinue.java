package com.derrick.cursojava.aula18;

import java.util.Scanner;

public class BreakEContinue {

	public static void main(String[] args) {
		
		//BREAK
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("Entre com um número: ");
		int num = sc.nextInt();
		System.out.println("Entre com um limite: ");
		int max = sc.nextInt();
		
		for (int i = num; i < max; i++) {
			if (i % 7 == 0) {
				System.out.println("O valor de i é: " + i);
				break; //força a saída do laço
			}
		}
		*/

		
		System.out.println("Entre com um número: ");
		int num = sc.nextInt();
		System.out.println("Entre com um limite: ");
		int max = sc.nextInt();
		
		for (int i = num; i < max; i++) {
			if (i % 7 == 0) {
				continue; //pula para a próxima iteração do laço, ignorando o código abaixo.
			}
			System.out.println("O valor de i é: " + i);
		}
	}

}
