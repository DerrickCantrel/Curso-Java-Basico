package com.derrick.cursojava.aula20.labs;

import java.util.Scanner;

public class exer06 {

	  public static void main(String[] args) {
	   
	    Scanner scan = new Scanner(System.in);

	    char[][]jogoVelha = new char[3][3];
	    boolean vencedor = false;
	    int linha = 0, coluna = 0;
	    int jogada = 0;
	    char sinal;

	    System.out.println("Jogador 1 - 'X'");
	    System.out.println("Jogador 2 - 'O'");

	    while(!vencedor) {
	      if (jogada % 2 == 0) {
	        System.out.println("Vez do Jogador 1");
	        sinal = 'X';
	      } else {
	        System.out.println("Vez do Jogador 2");
	        sinal = 'O';
	      }
		  
	      boolean entradaValida = false;
	      
	      while(!entradaValida) {
	        if (sinal == 'X') {
	          System.out.println("=============");
	          System.out.println("| JOGADOR 1 |");
	          System.out.println("=============");
	        } else {
	        	System.out.println("=============");
		        System.out.println("| JOGADOR 2 |");
		        System.out.println("=============");
	        }
	        System.out.println("Escolha uma Linha e Uma Coluna.");
	        System.out.println("Entre com uma Linha: (Ex:. 1, 2 ou 3)");
	        linha = scan.nextInt();
	        System.out.println("Entre com uma Coluna: (Ex:. 1, 2 ou 3)");
	        coluna = scan.nextInt();
	        linha--;
	        coluna--;
	  
	        if (jogoVelha[linha][coluna] == 'X' || jogoVelha[linha][coluna] == 'O') {
	            System.out.println("Jogada Inválida. Tente novamente.");
	        } else {
	            jogoVelha[linha][coluna] = sinal;
	            jogada++;
	            entradaValida = true;
	        }
	      }

	      for (int i = 0; i < jogoVelha.length; i++) {
	        for (int j = 0; j < jogoVelha[i].length; j++) {
	          System.out.print(jogoVelha[i][j] + " | ");
	        }
	          System.out.println();
	      }

	      if ((jogoVelha[0][0] == 'X' && jogoVelha[0][1] == 'X'&& jogoVelha[0][2] == 'X') ||
	          (jogoVelha[1][0] == 'X' && jogoVelha[1][1] == 'X'&& jogoVelha[1][2] == 'X') ||
	          (jogoVelha[2][0] == 'X' && jogoVelha[2][1] == 'X'&& jogoVelha[2][2] == 'X') ||
	          (jogoVelha[0][0] == 'X' && jogoVelha[1][0] == 'X'&& jogoVelha[2][0] == 'X') ||
	          (jogoVelha[0][1] == 'X' && jogoVelha[1][1] == 'X'&& jogoVelha[2][1] == 'X') ||
	          (jogoVelha[0][2] == 'X' && jogoVelha[1][2] == 'X'&& jogoVelha[2][2] == 'X') ||
	          (jogoVelha[0][0] == 'X' && jogoVelha[1][1] == 'X'&& jogoVelha[2][2] == 'X') ||
	          (jogoVelha[0][2] == 'X' && jogoVelha[1][1] == 'X'&& jogoVelha[2][0] == 'X')) {
	          vencedor = true;
	          System.out.println("Jogador 1 Venceu!");  
	      }
	      else if ((jogoVelha[0][0] == 'O' && jogoVelha[0][1] == 'O'&& jogoVelha[0][2] == 'O') ||
	          (jogoVelha[1][0] == 'O' && jogoVelha[1][1] == 'O'&& jogoVelha[1][2] == 'O') ||
	          (jogoVelha[2][0] == 'O' && jogoVelha[2][1] == 'O'&& jogoVelha[2][2] == 'O') ||
	          (jogoVelha[0][0] == 'O' && jogoVelha[1][0] == 'O'&& jogoVelha[2][0] == 'O') ||
	          (jogoVelha[0][1] == 'O' && jogoVelha[1][1] == 'O'&& jogoVelha[2][1] == 'O') ||
	          (jogoVelha[0][2] == 'O' && jogoVelha[1][2] == 'O'&& jogoVelha[2][2] == 'O') ||
	          (jogoVelha[0][0] == 'O' && jogoVelha[1][1] == 'O'&& jogoVelha[2][2] == 'O') ||
	          (jogoVelha[0][2] == 'O' && jogoVelha[1][1] == 'O'&& jogoVelha[2][0] == 'O')) {
	          vencedor = true;
	          System.out.println("Jogador 2 Venceu!");  
	      } else if (jogada > 9){
	        vencedor = true;
	        System.out.println("Ninguém venceu, Empate!");
	      } 
	    }
	  }	
}
