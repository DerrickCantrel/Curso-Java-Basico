package com.derrick.cursojava.aula14;

import java.util.Scanner;

public class ifElse {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("Digite sua Idade: ");
		int idade = sc.nextInt();
		
		if (idade >= 18) {
			System.out.println("É maior de Idade");
		} else {
			System.out.println("Não é maior de Idade");
		}
		*/
		
		System.out.println("Informe o valor do produto:");
		double valor = sc.nextDouble();
		
		if (valor <= 10) {
			System.out.println("Barato, pode comprar!");
		} else if (valor > 10 && valor <= 15) {
			System.out.println("Pode pedir desconto.");
		} else if (valor > 15 && valor <= 17) {
			System.out.println("Deve pesquisar mais.");
		} else {
			System.out.println("Está Caro.");
		}
	}

}
