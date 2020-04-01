package com.derrick.cursojava.aula15.labs;

import java.beans.VetoableChangeListenerProxy;
import java.util.Scanner;

public class ExerciciosAula15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		// QUESTÃO 01
		/*
		System.out.println("Digite o 1° número: ");
		int n1 = scan.nextInt();
		System.out.println("Digite o 2° número: ");
		int n2 = scan.nextInt();
		
		if (n1 > n2) {
			System.out.println("O maior é: " + n1);
		} else {
			System.out.println("O maior é: " + n2);
		} 
		
		// QUESTÃO 02
		System.out.println("Digite um número: ");
		int posNeg = scan.nextInt();
		if (posNeg >= 0) {
			System.out.println("O número é Positvo.");
		} else {
			System.out.println("O número é Negativo.");
		}
		
		
		// QUESTÃO 03
		System.out.println("Digite uma letra para o sexo (F/M): ");
		String sexo = scan.nextLine();
		switch(sexo) {
			case "F": System.out.println("F - FEMININO"); break;
			case "M": System.out.println("M - MASCULINO"); break;
			default: System.out.println("SEXO INVÁLIDO");
		}
		
		// QUESTÃO 04
		System.out.println("Digite uma letra (A-Z): ");
		String letra = scan.nextLine();
		switch(letra) {
			case "A": 
			case "E":
			case "I":
			case "O":
			case "U": System.out.println("É uma vogal"); break;
			default: System.out.println("É uma Consoante"); break;
		}
		
		// QUESTÃO 05
		System.out.println("Informe a 1° Nota: ");
		int nota1 = scan.nextInt();
		System.out.println("Informe a 2° Nota: ");
		int nota2 = scan.nextInt();
		int media = (nota1 + nota2) / 2;
		System.out.print("Media Final: " + media + " ");
		
		if (media == 10) {
			System.out.println("APROVADO COM DISTINÇÃO");
		} else if (media >= 7) {
			System.out.println("APROVADO");
		} else {
			System.out.println("REPROVADO");
		}
		
	
		// QUESTÃO 06
		System.out.print("Informe o 1° número: ");
		int num1 = scan.nextInt();
		System.out.print("Informe o 2° número: ");
		int num2 = scan.nextInt();
		System.out.print("Informe o 3° número: ");
		int num3 = scan.nextInt();
		
		if (num1 > num2) {
			if (num1 > num3) {
				System.out.print("O Maior número é: " + num1);
			}
		} else if (num2 > num3) {
			System.out.print("O Maior número é: " + num2);
		} else {
			System.out.print("O Maior número é: " + num3);
		}
		
	
		// QUESTÃO 07
		System.out.print("Informe o 1° número: ");
		int num1 = scan.nextInt();
		System.out.print("Informe o 2° número: ");
		int num2 = scan.nextInt();
		System.out.print("Informe o 3° número: ");
		int num3 = scan.nextInt();
		
		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println("O Maior número é: " + num1);
				if (num2 > num3) {
					System.out.print("E o menor é: " + num3);
				} else {
					System.out.print("E o menor é: " + num2);
				}
			}
		} else if (num2 > num3) {
			System.out.println("O Maior número é: " + num2);
			if (num1 > num3) {
				System.out.print("E o menor é: " + num3);
			} else {
				System.out.print("E o menor é: " + num3);
			}
		} else {
			System.out.println("O Maior número é: " + num3);
			if (num1 > num2) {
				System.out.print("E o menor é: " + num2);
			} else {
				System.out.print("E o menor é: " + num1);
			}
		}

		
		// QUESTÃO 08
		System.out.print("Informe o preço do 1° produto: ");
		int pre1 = scan.nextInt();
		System.out.print("Informe o preço do 2° produto: ");
		int pre2 = scan.nextInt();
		System.out.print("Informe o preço do 3° produto: ");
		int pre3 = scan.nextInt();
		
		if (pre1 > pre2 && pre1 > pre3 && pre2 > pre3) {
			System.out.print("Você deve comprar o 3° produto.");
		} else if (pre1 < pre2 && pre1 < pre3) {
			System.out.print("Você deve comprar o 1° produto.");
		} else {
			System.out.print("Você deve comprar o 2° produto.");
		}
		
		// QUESTÃO 09
		System.out.print("Informe o 1° número: ");
		int num1 = scan.nextInt();
		System.out.print("Informe o 2° número: ");
		int num2 = scan.nextInt();
		System.out.print("Informe o 3° número: ");
		int num3 = scan.nextInt();
		
		if (num1 > num2 && num1 > num3 && num2 > num3) {
			System.out.print("Em ordem descrecente temos: " + num1 + " " + num2 + " " + num3);
		} else if (num1 < num2 && num1 < num3 && num2 < num3) {
			System.out.print("Em ordem descrecente temos: " + num3 + " " + num2 + " " + num1);
		} else if (num1 > num3 && num1 < num2 && num2 > num3) {
			System.out.print("Em ordem descrecente temos: " + num2 + " " + num1 + " " + num3);
		}
	
		
		// QUESTÃO 10
		System.out.println("Em qual turno você estuda? Digite: ");
		System.out.println("M - Matutino");
		System.out.println("V - Vespertino");
		System.out.println("N - Noturno");
		String turno = scan.nextLine();
		
		switch(turno){
			case "M": System.out.println("Bom Dia!"); break;
			case "V": System.out.println("Boa Tarde!"); break;
			case "N": System.out.println("Boa Noite!"); break;
			default: System.out.println("Valor Inválido.");
		}
		
		
		// QUESTÃO 11
		System.out.println("Informe seu sálario: ");
		double salario = scan.nextDouble();
		
		if (salario <= 280.00) {
			double aumento = salario * (20/100);
			System.out.println("Sálario antes do reajuste: " + salario);
			System.out.println("Percentual do aumento aplicado: 20%");
			System.out.println("Valor do aumento: " + aumento);
			System.out.println("Novo sálario, após o aumento: " + salario + aumento);
		} else if (salario > 280.00 || salario < 700.00) {
			double aumento = salario * (15/100);
			System.out.println("Sálario antes do reajuste: " + salario);
			System.out.println("Percentual do aumento aplicado: 15%");
			System.out.println("Valor do aumento: " + aumento);
			System.out.println("Novo sálario, após o aumento: " + salario + aumento);
		} else if (salario > 700.00 || salario < 1500.00) {
			double aumento = salario * (10/100);
			System.out.println("Sálario antes do reajuste: " + salario);
			System.out.println("Percentual do aumento aplicado: 10%");
			System.out.println("Valor do aumento: " + aumento);
			System.out.println("Novo sálario, após o aumento: " + salario + aumento);
		} else {
			double aumento = salario * (5/100);
			System.out.println("Sálario antes do reajuste: " + salario);
			System.out.println("Percentual do aumento aplicado: 5%");
			System.out.println("Valor do aumento: " + aumento);
			System.out.println("Novo sálario, após o aumento: " + salario + aumento);
		}
		
							
		
		
		//QUESTÃO 13
		System.out.println("Digite um número correspondente aos dias da semana: ");
		int semana = scan.nextInt();
		switch (semana) {
			case 1: System.out.println("Domingo"); break;
			case 2: System.out.println("Segunda"); break;
			case 3: System.out.println("Terça"); break;
			case 4: System.out.println("Quarta"); break;
			case 5: System.out.println("Quinta"); break;
			case 6: System.out.println("Sexta"); break;
			case 7: System.out.println("Sábado"); break;
			default: System.out.println("Dia da Semana Inválido"); break;
		}
		
		
		
		//QUESTÃO 13
		System.out.println("Digite o Primeiro lado do triângulo: ");
		int lt1 = scan.nextInt();
		System.out.println("Digite o Segundo lado do triângulo: ");
		int lt2 = scan.nextInt();
		System.out.println("Digite o Terceiro lado do triângulo: ");
		int lt3 = scan.nextInt();
		
		if (lt1 + lt2 > lt3 || lt1 + lt3 > lt2 || lt2 + lt3 > lt1) {
			if (lt1 == lt2 && lt1 == lt3 && lt2 == lt3) {
				System.out.println("Este triângulo é Equilatero.");
			} else if (lt1 == lt2 || lt1 == lt3 || lt2 == lt3) {
				System.out.println("Este triângulo é Isósceles.");
			} else {
				System.out.println("Este triângulo é Escaleno.");
			}
		} else {
			System.out.println("Este triângulo não existe.");
		}
		
		*/
		
		//QUESTÃO 21
		System.out.println("Qual combustivel você deseja abastecer: (G/A) ");
		String combustivel = scan.nextLine();
		double desconto;
		int litros;
		
		switch (combustivel) {
		case "G": 
			System.out.println("Quantos litros de Gasolina? ");
			litros = scan.nextInt();
				
			if (litros <= 20) {
				desconto = (litros * 2.50) - ((litros * 2.50) * 0.4);
				System.out.println("Você irá pagar: R$ " + desconto + " pelos " + litros + " litros de Gasolina.");
			} else {
				desconto = (litros * 2.50) - ((litros * 2.50) * 0.6);
				System.out.println("Você irá pagar: R$ " + desconto + " pelos " + litros + " litros de Gasolina.");
			};
		case "A": 
			System.out.println("Quantos litros de Alcool? ");
			litros = scan.nextInt();
				
			if (litros <= 20) {
				desconto = (litros * 1.90) - ((litros * 1.90) * 0.3);
				System.out.println("Você irá pagar: R$ " + desconto + " pelos " + litros + " litros de Alcool.");
			} else {
				desconto = (litros * 1.90) - ((litros * 1.90) * 0.5);
				System.out.println("Você irá pagar: R$ " + desconto + " pelos " + litros + " litros de Alcool.");
			};
		}
	}

}



















