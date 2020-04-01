package com.derrick.cursojava.aula43;

public class Teste {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		double[] notas = {10, 9, 8, 7};	
		aluno.setCurso("Ciencia da Computação");
		aluno.setNotas(notas);
		
		System.out.println(aluno);
		
		String s1 = "Derrick";
		String s2 = "derrick";
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		Aluno aluno2 = new Aluno();
		double[] notas2 = {10, 9, 8, 7};
		aluno2.setCurso("Ciencia da Computação");
		aluno2.setNotas(notas2);
		
		System.out.println(aluno.equals(aluno2));
	}

}
