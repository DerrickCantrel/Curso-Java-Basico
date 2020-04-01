package com.derrick.cursojava.aula42;

public class Teste {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		//Pessoa aluno = new Aluno();
		//Pessoa professor = new Professor();
		
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		//Exemplo 02
		System.out.println(Constantes.URL_BLOG);
		//Constanes.URL_BLOG = "fsfsfas";
		System.out.println(Constantes.URL_BLOG);
		
		final int TOTAL = 1;
		//TOTAL += 1;
		System.out.println(TOTAL);
	}

}
