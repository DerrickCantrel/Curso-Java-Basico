package com.derrick.cursojava.aula27.labs;

public class TesteAluno {

	public static void main(String[] args) {
		Aluno alu1 = new Aluno();
		alu1.nome = "Derrick Cantrel";
		alu1.matricula = 1828590;
		alu1.curso = "Sistemas de Informa��o";
		alu1.disciplinas[0] = "Administra��o";
		alu1.disciplinas[1] = "Automatos, Express�es Regulares";
		alu1.disciplinas[2] = "Pesquisa e Ordena��o de Dados";
		alu1.notas[0] = 8.5;
		alu1.notas[1] = 7.5;
		alu1.notas[2] = 7.8;
		
		alu1.mostrarInformacoes();

	}

}
