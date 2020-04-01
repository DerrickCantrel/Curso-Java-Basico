package com.derrick.cursojava.aula19.labs;

import java.util.Scanner;

public class exer19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float media = 0;
		float[]nota1 = new float[10];
		float[]nota2 = new float[10];
		float[]result = new float[10];
		
		for (int i = 0; i < nota1.length; i++) {
			System.out.println(i+1 + "° Aluno");
			System.out.println("Nota Vp1: ");
			nota1[i] = sc.nextFloat();
			System.out.println("Nota Vp2: ");
			nota2[i] = sc.nextFloat();
		}
		
		for (int i = 0; i < nota1.length; i++) {
			result[i] = (nota1[i] + nota2[i]) / 2;
			if(result[i] >= 7) {
				System.out.println("Aluno "+ i+1 + " Aprovado!!!");
				System.out.println("Média Final = " + result[i]);
			} else {
				System.out.println("Aluno "+ i+1 + " Reprovado!");
				System.out.println("Média Final = " + result[i]);
			}
		}
		
		

	}

}
