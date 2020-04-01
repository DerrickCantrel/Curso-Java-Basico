package com.derrick.cursojava.aula27.labs;

import java.util.Scanner;

public class TesteJogoVelha {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		JogoVelha jogoDaVelha = new JogoVelha();
		
		 System.out.println("Jogador 1 - 'X'");
		 System.out.println("Jogador 2 - 'O'");
		   
		   boolean vencedor = false;
		   int linha = 0, coluna = 0;
		   char sinal;
		   
		   while(!vencedor) {
			   if (jogoDaVelha.vezJogador1()) {
			        System.out.println("Vez do Jogador 1");
			        sinal = 'X';
			      } else {
			        System.out.println("Vez do Jogador 2");
			        sinal = 'O';
			      }
			   linha = valor("Linha", scan);
			   coluna = valor("Coluna", scan);
			   
			   if (!jogoDaVelha.validarJogada(linha, coluna, sinal)) {
				   System.out.println("Posição já usada, tente novamente");
			   }
			   
			   jogoDaVelha.imprimirTabuleiro();
			   
			   if (jogoDaVelha.verificarGanhador('X')) {
				   vencedor = true;
				   System.out.println("Jogador 1 Venceu!");  
			   } else if (jogoDaVelha.verificarGanhador('O')) {
				   vencedor = true;
				   System.out.println("Jogador 2 Venceu!");  
			   } else if (jogoDaVelha.jogada> 9) {
				        vencedor = true;
				        System.out.println("Ninguém venceu, Empate!");
			   }
		   }
}
		   
		   static int valor(String tipoValor, Scanner scan) {
			   int valor = 0;
			   boolean valorValido = false;
			   while (!valorValido) {
				  System.out.println("Entre com uma " + tipoValor + " : (Ex:. 1, 2 ou 3)");
			      valor = scan.nextInt();
			      if (valor >= 1 && valor <= 3) {
			    	  valorValido = true;
			      } else {
			    	  System.out.println("Entrada inválida, tente novamente");
			      }
			   }
			  valor--;
			  return valor;
		   }
		}
