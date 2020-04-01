package com.derrick.cursojava.aula24.labs;

import java.util.Date;

public class exer04 {

	public static void main(String[] args) {
		
		LivroDeLivraria livro = new LivroDeLivraria();
		
		livro.nome = "Desinformação";
		livro.autor = "Ion Mihai Pacepa";
		livro.anoPublicacao = 2015;
		
		livro.emprestado = true;
		livro.dataEntrega = new Date();
		livro.emprestadoA = "Derrick";
		
		System.out.println("Nome do Livro: " + livro.nome);

	}

}
