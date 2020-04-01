package com.derrick.cursojava.aula45;

public class Teste {
	
	public static void main(String[] args) {
		/*
		Aluno aluno = new Aluno();
		Pessoa pessoaAluno = aluno;
		
		Pessoa aluno2 = (Pessoa) new Aluno(); //UpCasting

		Pessoa aluno3 = new Aluno();
		Aluno aluno4 = (Aluno) aluno3;
		 */
		
		//InstanceOf verifica qual é o tipo da instancia
		Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		if (pessoa instanceof Pessoa) {
			System.out.println("É do tipo Pessoa");
		}
		if (aluno instanceof Aluno) {
			System.out.println("É do tipo Pessoa");
		}
		if (professor instanceof Professor) {
			System.out.println("É do tipo Pessoa");
		}
	}
	
}
