package com.derrick.cursojava.aula27.labs;

public class Aluno {
	String nome;
	int matricula;
	String curso;
	String[] disciplinas = new String[3];
	double[] notas= new double[3];
	
	void mostrarInformacoes() {
		System.out.println("Nome: " + nome);
		System.out.println("Matricula: " + matricula);
		System.out.println("Curso: " + curso);
		
		for(int i = 0; i < disciplinas.length; i++) {
			System.out.println("Disciplina: " + disciplinas[i]);
			if (notas[i] > 7) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Reprovado");
			  }
		}
	
	
	}
}