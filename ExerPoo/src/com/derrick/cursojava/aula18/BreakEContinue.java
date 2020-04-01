package com.derrick.cursojava.aula18;

import java.util.Scanner;

public class BreakEContinue {

	public static void main(String[] args) {
		
		//BREAK
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("Entre com um n�mero: ");
		int num = sc.nextInt();
		System.out.println("Entre com um limite: ");
		int max = sc.nextInt();
		
		for (int i = num; i < max; i++) {
			if (i % 7 == 0) {
				System.out.println("O valor de i �: " + i);
				break; //for�a a sa�da do la�o
			}
		}
		*/

		
		System.out.println("Entre com um n�mero: ");
		int num = sc.nextInt();
		System.out.println("Entre com um limite: ");
		int max = sc.nextInt();
		
		for (int i = num; i < max; i++) {
			if (i % 7 == 0) {
				continue; //pula para a pr�xima itera��o do la�o, ignorando o c�digo abaixo.
			}
			System.out.println("O valor de i �: " + i);
		}
	}

}
