package com.derrick.cursojava.aula15.labs;

import java.beans.VetoableChangeListenerProxy;
import java.util.Scanner;

public class ExerciciosAula15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		// QUEST�O 01
		/*
		System.out.println("Digite o 1� n�mero: ");
		int n1 = scan.nextInt();
		System.out.println("Digite o 2� n�mero: ");
		int n2 = scan.nextInt();
		
		if (n1 > n2) {
			System.out.println("O maior �: " + n1);
		} else {
			System.out.println("O maior �: " + n2);
		} 
		
		// QUEST�O 02
		System.out.println("Digite um n�mero: ");
		int posNeg = scan.nextInt();
		if (posNeg >= 0) {
			System.out.println("O n�mero � Positvo.");
		} else {
			System.out.println("O n�mero � Negativo.");
		}
		
		
		// QUEST�O 03
		System.out.println("Digite uma letra para o sexo (F/M): ");
		String sexo = scan.nextLine();
		switch(sexo) {
			case "F": System.out.println("F - FEMININO"); break;
			case "M": System.out.println("M - MASCULINO"); break;
			default: System.out.println("SEXO INV�LIDO");
		}
		
		// QUEST�O 04
		System.out.println("Digite uma letra (A-Z): ");
		String letra = scan.nextLine();
		switch(letra) {
			case "A": 
			case "E":
			case "I":
			case "O":
			case "U": System.out.println("� uma vogal"); break;
			default: System.out.println("� uma Consoante"); break;
		}
		
		// QUEST�O 05
		System.out.println("Informe a 1� Nota: ");
		int nota1 = scan.nextInt();
		System.out.println("Informe a 2� Nota: ");
		int nota2 = scan.nextInt();
		int media = (nota1 + nota2) / 2;
		System.out.print("Media Final: " + media + " ");
		
		if (media == 10) {
			System.out.println("APROVADO COM DISTIN��O");
		} else if (media >= 7) {
			System.out.println("APROVADO");
		} else {
			System.out.println("REPROVADO");
		}
		
	
		// QUEST�O 06
		System.out.print("Informe o 1� n�mero: ");
		int num1 = scan.nextInt();
		System.out.print("Informe o 2� n�mero: ");
		int num2 = scan.nextInt();
		System.out.print("Informe o 3� n�mero: ");
		int num3 = scan.nextInt();
		
		if (num1 > num2) {
			if (num1 > num3) {
				System.out.print("O Maior n�mero �: " + num1);
			}
		} else if (num2 > num3) {
			System.out.print("O Maior n�mero �: " + num2);
		} else {
			System.out.print("O Maior n�mero �: " + num3);
		}
		
	
		// QUEST�O 07
		System.out.print("Informe o 1� n�mero: ");
		int num1 = scan.nextInt();
		System.out.print("Informe o 2� n�mero: ");
		int num2 = scan.nextInt();
		System.out.print("Informe o 3� n�mero: ");
		int num3 = scan.nextInt();
		
		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println("O Maior n�mero �: " + num1);
				if (num2 > num3) {
					System.out.print("E o menor �: " + num3);
				} else {
					System.out.print("E o menor �: " + num2);
				}
			}
		} else if (num2 > num3) {
			System.out.println("O Maior n�mero �: " + num2);
			if (num1 > num3) {
				System.out.print("E o menor �: " + num3);
			} else {
				System.out.print("E o menor �: " + num3);
			}
		} else {
			System.out.println("O Maior n�mero �: " + num3);
			if (num1 > num2) {
				System.out.print("E o menor �: " + num2);
			} else {
				System.out.print("E o menor �: " + num1);
			}
		}

		
		// QUEST�O 08
		System.out.print("Informe o pre�o do 1� produto: ");
		int pre1 = scan.nextInt();
		System.out.print("Informe o pre�o do 2� produto: ");
		int pre2 = scan.nextInt();
		System.out.print("Informe o pre�o do 3� produto: ");
		int pre3 = scan.nextInt();
		
		if (pre1 > pre2 && pre1 > pre3 && pre2 > pre3) {
			System.out.print("Voc� deve comprar o 3� produto.");
		} else if (pre1 < pre2 && pre1 < pre3) {
			System.out.print("Voc� deve comprar o 1� produto.");
		} else {
			System.out.print("Voc� deve comprar o 2� produto.");
		}
		
		// QUEST�O 09
		System.out.print("Informe o 1� n�mero: ");
		int num1 = scan.nextInt();
		System.out.print("Informe o 2� n�mero: ");
		int num2 = scan.nextInt();
		System.out.print("Informe o 3� n�mero: ");
		int num3 = scan.nextInt();
		
		if (num1 > num2 && num1 > num3 && num2 > num3) {
			System.out.print("Em ordem descrecente temos: " + num1 + " " + num2 + " " + num3);
		} else if (num1 < num2 && num1 < num3 && num2 < num3) {
			System.out.print("Em ordem descrecente temos: " + num3 + " " + num2 + " " + num1);
		} else if (num1 > num3 && num1 < num2 && num2 > num3) {
			System.out.print("Em ordem descrecente temos: " + num2 + " " + num1 + " " + num3);
		}
	
		
		// QUEST�O 10
		System.out.println("Em qual turno voc� estuda? Digite: ");
		System.out.println("M - Matutino");
		System.out.println("V - Vespertino");
		System.out.println("N - Noturno");
		String turno = scan.nextLine();
		
		switch(turno){
			case "M": System.out.println("Bom Dia!"); break;
			case "V": System.out.println("Boa Tarde!"); break;
			case "N": System.out.println("Boa Noite!"); break;
			default: System.out.println("Valor Inv�lido.");
		}
		
		
		// QUEST�O 11
		System.out.println("Informe seu s�lario: ");
		double salario = scan.nextDouble();
		
		if (salario <= 280.00) {
			double aumento = salario * (20/100);
			System.out.println("S�lario antes do reajuste: " + salario);
			System.out.println("Percentual do aumento aplicado: 20%");
			System.out.println("Valor do aumento: " + aumento);
			System.out.println("Novo s�lario, ap�s o aumento: " + salario + aumento);
		} else if (salario > 280.00 || salario < 700.00) {
			double aumento = salario * (15/100);
			System.out.println("S�lario antes do reajuste: " + salario);
			System.out.println("Percentual do aumento aplicado: 15%");
			System.out.println("Valor do aumento: " + aumento);
			System.out.println("Novo s�lario, ap�s o aumento: " + salario + aumento);
		} else if (salario > 700.00 || salario < 1500.00) {
			double aumento = salario * (10/100);
			System.out.println("S�lario antes do reajuste: " + salario);
			System.out.println("Percentual do aumento aplicado: 10%");
			System.out.println("Valor do aumento: " + aumento);
			System.out.println("Novo s�lario, ap�s o aumento: " + salario + aumento);
		} else {
			double aumento = salario * (5/100);
			System.out.println("S�lario antes do reajuste: " + salario);
			System.out.println("Percentual do aumento aplicado: 5%");
			System.out.println("Valor do aumento: " + aumento);
			System.out.println("Novo s�lario, ap�s o aumento: " + salario + aumento);
		}
		
							
		
		
		//QUEST�O 13
		System.out.println("Digite um n�mero correspondente aos dias da semana: ");
		int semana = scan.nextInt();
		switch (semana) {
			case 1: System.out.println("Domingo"); break;
			case 2: System.out.println("Segunda"); break;
			case 3: System.out.println("Ter�a"); break;
			case 4: System.out.println("Quarta"); break;
			case 5: System.out.println("Quinta"); break;
			case 6: System.out.println("Sexta"); break;
			case 7: System.out.println("S�bado"); break;
			default: System.out.println("Dia da Semana Inv�lido"); break;
		}
		
		
		
		//QUEST�O 13
		System.out.println("Digite o Primeiro lado do tri�ngulo: ");
		int lt1 = scan.nextInt();
		System.out.println("Digite o Segundo lado do tri�ngulo: ");
		int lt2 = scan.nextInt();
		System.out.println("Digite o Terceiro lado do tri�ngulo: ");
		int lt3 = scan.nextInt();
		
		if (lt1 + lt2 > lt3 || lt1 + lt3 > lt2 || lt2 + lt3 > lt1) {
			if (lt1 == lt2 && lt1 == lt3 && lt2 == lt3) {
				System.out.println("Este tri�ngulo � Equilatero.");
			} else if (lt1 == lt2 || lt1 == lt3 || lt2 == lt3) {
				System.out.println("Este tri�ngulo � Is�sceles.");
			} else {
				System.out.println("Este tri�ngulo � Escaleno.");
			}
		} else {
			System.out.println("Este tri�ngulo n�o existe.");
		}
		
		*/
		
		//QUEST�O 21
		System.out.println("Qual combustivel voc� deseja abastecer: (G/A) ");
		String combustivel = scan.nextLine();
		double desconto;
		int litros;
		
		switch (combustivel) {
		case "G": 
			System.out.println("Quantos litros de Gasolina? ");
			litros = scan.nextInt();
				
			if (litros <= 20) {
				desconto = (litros * 2.50) - ((litros * 2.50) * 0.4);
				System.out.println("Voc� ir� pagar: R$ " + desconto + " pelos " + litros + " litros de Gasolina.");
			} else {
				desconto = (litros * 2.50) - ((litros * 2.50) * 0.6);
				System.out.println("Voc� ir� pagar: R$ " + desconto + " pelos " + litros + " litros de Gasolina.");
			};
		case "A": 
			System.out.println("Quantos litros de Alcool? ");
			litros = scan.nextInt();
				
			if (litros <= 20) {
				desconto = (litros * 1.90) - ((litros * 1.90) * 0.3);
				System.out.println("Voc� ir� pagar: R$ " + desconto + " pelos " + litros + " litros de Alcool.");
			} else {
				desconto = (litros * 1.90) - ((litros * 1.90) * 0.5);
				System.out.println("Voc� ir� pagar: R$ " + desconto + " pelos " + litros + " litros de Alcool.");
			};
		}
	}

}



















