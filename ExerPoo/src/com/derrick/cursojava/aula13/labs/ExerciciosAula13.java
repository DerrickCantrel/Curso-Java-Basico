package com.derrick.cursojava.aula13.labs;

import java.util.Scanner;

public class ExerciciosAula13 {

	public static void main(String[] args) {
		// QUESTÃO 01
		System.out.println("Olá Mundo");
		
		
		// QUESTÃO 02
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		System.out.println("O número Informado foi " + numero);
		
		
		// QUESTÃO 03 
		System.out.println("Digite um número: ");
		int n1 = sc.nextInt();
		System.out.println("Digite outro número: ");
		int n2 = sc.nextInt();
		System.out.println("A soma dos números digitados é: " + (n1 + n2));
		
		 
		  // QUESTÃO 04
		int soma = 0;
		for (int i = 1; i < 5; i++) {
			System.out.print("Digite o " + i + "° número: ");
			soma = soma + sc.nextInt();
		}

		System.out.println(soma / 4);
		
		// QUESTÃO 05
		System.out.print("Infome um valor em metros para ser convertido em centímetros: ");
		int metros = sc.nextInt();
		System.out.println(metros + "m em Centímetros é: " + (metros * 100));
		
		// QUESTÃO 06
		System.out.print("Informe o raio do circulo: ");
		int raio = sc.nextInt();
		double areaCir = (raio * raio) * 3.14;
		System.out.print("A área do Circulo é: " + areaCir);
		
		// QUESTÃO 07
		System.out.print("Informe o lado do quadrado: ");
		int lado = sc.nextInt();
		double areaQua = lado * lado;
		System.out.print("O dobro da área do Quadrado é: " + (areaQua * 2));
		
		// QUESTÃO 08
		System.out.print("Informe quanto você ganha por hora: ");
		int salario = sc.nextInt();
		System.out.print("Digite um número de horas trabalhadas no mês: ");
		int horas = sc.nextInt();
		System.out.print("Você ganha cerca de: " + (salario * horas));
		
		
		// QUESTÃO 09
		System.out.print("Digite a temperatura em Farenheit para convertê-la em Celsius: ");
		double farenheit = sc.nextDouble();
		double celsius = 5 * (farenheit - 32) / 9;
		System.out.print("A Temperatura em Celsius é: " + celsius + "°");
		
		// QUESTÃO 10
		System.out.print("Digite a temperatura em Celsius para convertê-la em Faremheit: ");
		double celsiusConv = sc.nextDouble();
		double FarenheitConv = (celsiusConv * 9 / 5) + 32;
		System.out.print("A Temperatura em Farenheit é: " + FarenheitConv + "°");
		
		// QUESTÃO 11
		System.out.print("Digite o 1° Número: ");
		int n1 = sc.nextInt();
		System.out.print("Digite o 2° Número: ");
		int n2 = sc.nextInt();
		int resul1 = (n1 * 2) * (n2 / 2);
		int resul2 = (n1 * 3) + resul1;
		int resul3 = resul1^3;
		System.out.print("O produto do dobro do primeiro com a metade do segunto é: " + resul1);
		System.out.print("A soma do triplo do primeiro com o terceiro" + resul2);
		System.out.print("O terceiro elevado ao cubo" + resul3);
		*/
		
		// QUESTÃO 12
		System.out.print("Informe sua altura: ");
		double altura = sc.nextDouble();
		double pesoIdeal = altura * 72.7 - 58;
		System.out.print("Seu peso ideal é: " + pesoIdeal);
		
		// QUESTÃO 13
		System.out.print("Informe quanto você ganha por hora: ");
		int salHora = sc.nextInt();
		System.out.print("Digite um número de horas trabalhadas no mês: ");
		int horas = sc.nextInt();
		int salBru = salHora * horas;
		int inss = salBru - (salBru * (8/100));
		int ir = salBru - (salBru * (11/100));
		int sind = salBru - (salBru * (5/100));
		int salLiq = salBru - (inss + ir + sind);
		System.out.print("Salário Bruto : R$ " + salBru);
		System.out.print("Imposto de Renda : R$ " + ir);
		System.out.print("Sindicato : R$ " + sind);
		System.out.print("Salário Liquido : R$ " + salLiq);
		
		// QUESTÃO 14
		System.out.print("Informe o tamanho do arquivo em Megabyte: ");
		double mb = sc.nextDouble();
		System.out.print("Informe a velocidade de transfêrencia em Megabyte por Segundo: ");
		double velocidade = sc.nextDouble();
		double temDown = (mb / velocidade) / 60;
		System.out.print("O tempo aproximado para concluir o Download é: " + temDown);
	}

}
