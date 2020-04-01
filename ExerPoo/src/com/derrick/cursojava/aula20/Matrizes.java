package com.derrick.cursojava.aula20;

public class Matrizes {

	public static void main(String[] args) {
		
		//Matrizes == Arrays de  Arrays
		//Linhas x Colunas
		double[][]notasAlunos = new double[3][4];
		
		notasAlunos[0][0]= 10;
		notasAlunos[0][1]= 7;
		notasAlunos[0][2]= 9;
		notasAlunos[0][3]= 9.5;
		
		notasAlunos[1][0]= 9;
		notasAlunos[1][1]= 8;
		notasAlunos[1][2]= 7;
		notasAlunos[1][3]= 9;
		
		notasAlunos[2][0]= 6;
		notasAlunos[2][1]= 9;
		notasAlunos[2][2]= 10;
		notasAlunos[2][3]= 7;
	
		//FOR EACH EM MATRIZES MULTIDIMENCIONAIS
		for (double[] notasAluno : notasAlunos) {
			for (double nota : notasAluno) {
				System.out.println(nota + " ");
			}
			System.out.println();
		}
		
		//MANIPULANDO MATRIZES
		double[][]notasAlunos3 = {{10, 7, 8, 9.5}, {9, 8, 7, 9}};
		
		for (int i = 0; i < notasAlunos3.length; i++) {
			for (int j = 0; j < notasAlunos3[i].length; j++) {
				System.out.print(notasAlunos3[i][j]+ " ");
			}
			System.out.println();
		}
		
		notasAlunos[2][3]= 10;
		
		//CALCULANDO MEDIA DAS NOTAS DOS ALUNOS
		double soma;
		for (int i = 0; i < notasAlunos.length; i++) {
			soma = 0;
			for (int j = 0; j < notasAlunos[i].length; j++) {
				soma += notasAlunos[i][j];
			}
			System.out.println("Média do Aluno " + (i+1) + " é = " + (soma/4));
		}
	}
}
