package com.derrick.cursojava.aula13.labs;

import java.util.Scanner;

public class ExerciciosAula13 {

	public static void main(String[] args) {
		// QUEST�O 01
		System.out.println("Ol� Mundo");
		
		
		// QUEST�O 02
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("Digite um n�mero: ");
		int numero = sc.nextInt();
		System.out.println("O n�mero Informado foi " + numero);
		
		
		// QUEST�O 03 
		System.out.println("Digite um n�mero: ");
		int n1 = sc.nextInt();
		System.out.println("Digite outro n�mero: ");
		int n2 = sc.nextInt();
		System.out.println("A soma dos n�meros digitados �: " + (n1 + n2));
		
		 
		  // QUEST�O 04
		int soma = 0;
		for (int i = 1; i < 5; i++) {
			System.out.print("Digite o " + i + "� n�mero: ");
			soma = soma + sc.nextInt();
		}

		System.out.println(soma / 4);
		
		// QUEST�O 05
		System.out.print("Infome um valor em metros para ser convertido em cent�metros: ");
		int metros = sc.nextInt();
		System.out.println(metros + "m em Cent�metros �: " + (metros * 100));
		
		// QUEST�O 06
		System.out.print("Informe o raio do circulo: ");
		int raio = sc.nextInt();
		double areaCir = (raio * raio) * 3.14;
		System.out.print("A �rea do Circulo �: " + areaCir);
		
		// QUEST�O 07
		System.out.print("Informe o lado do quadrado: ");
		int lado = sc.nextInt();
		double areaQua = lado * lado;
		System.out.print("O dobro da �rea do Quadrado �: " + (areaQua * 2));
		
		// QUEST�O 08
		System.out.print("Informe quanto voc� ganha por hora: ");
		int salario = sc.nextInt();
		System.out.print("Digite um n�mero de horas trabalhadas no m�s: ");
		int horas = sc.nextInt();
		System.out.print("Voc� ganha cerca de: " + (salario * horas));
		
		
		// QUEST�O 09
		System.out.print("Digite a temperatura em Farenheit para convert�-la em Celsius: ");
		double farenheit = sc.nextDouble();
		double celsius = 5 * (farenheit - 32) / 9;
		System.out.print("A Temperatura em Celsius �: " + celsius + "�");
		
		// QUEST�O 10
		System.out.print("Digite a temperatura em Celsius para convert�-la em Faremheit: ");
		double celsiusConv = sc.nextDouble();
		double FarenheitConv = (celsiusConv * 9 / 5) + 32;
		System.out.print("A Temperatura em Farenheit �: " + FarenheitConv + "�");
		
		// QUEST�O 11
		System.out.print("Digite o 1� N�mero: ");
		int n1 = sc.nextInt();
		System.out.print("Digite o 2� N�mero: ");
		int n2 = sc.nextInt();
		int resul1 = (n1 * 2) * (n2 / 2);
		int resul2 = (n1 * 3) + resul1;
		int resul3 = resul1^3;
		System.out.print("O produto do dobro do primeiro com a metade do segunto �: " + resul1);
		System.out.print("A soma do triplo do primeiro com o terceiro" + resul2);
		System.out.print("O terceiro elevado ao cubo" + resul3);
		*/
		
		// QUEST�O 12
		System.out.print("Informe sua altura: ");
		double altura = sc.nextDouble();
		double pesoIdeal = altura * 72.7 - 58;
		System.out.print("Seu peso ideal �: " + pesoIdeal);
		
		// QUEST�O 13
		System.out.print("Informe quanto voc� ganha por hora: ");
		int salHora = sc.nextInt();
		System.out.print("Digite um n�mero de horas trabalhadas no m�s: ");
		int horas = sc.nextInt();
		int salBru = salHora * horas;
		int inss = salBru - (salBru * (8/100));
		int ir = salBru - (salBru * (11/100));
		int sind = salBru - (salBru * (5/100));
		int salLiq = salBru - (inss + ir + sind);
		System.out.print("Sal�rio Bruto : R$ " + salBru);
		System.out.print("Imposto de Renda : R$ " + ir);
		System.out.print("Sindicato : R$ " + sind);
		System.out.print("Sal�rio Liquido : R$ " + salLiq);
		
		// QUEST�O 14
		System.out.print("Informe o tamanho do arquivo em Megabyte: ");
		double mb = sc.nextDouble();
		System.out.print("Informe a velocidade de transf�rencia em Megabyte por Segundo: ");
		double velocidade = sc.nextDouble();
		double temDown = (mb / velocidade) / 60;
		System.out.print("O tempo aproximado para concluir o Download �: " + temDown);
	}

}
