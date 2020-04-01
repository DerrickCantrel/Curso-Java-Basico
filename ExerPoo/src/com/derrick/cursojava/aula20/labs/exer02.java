package com.derrick.cursojava.aula20.labs;

public class exer02 {

	public static void main(String[] args) {
		
		int[][]M = new int[10][10];
		int maiorL5 = 0;
		int menorL5 = 0;
		int mEI5 = 0;
		int mEJ5 = 0;
		int mAI5 = 0;
		int mAJ5 = 0;
		// COLUNA 7
		int maiorC7 = 0;
		int menorC7 = 0;
		int mEI7 = 0;
		int mEJ7 = 0;
		int mAI7 = 0;
		int mAJ7 = 0;
		
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				M[i][j] = 0 + (int)Math.round(Math.random()* 9);
				System.out.println("M["+i+"] ["+j+"] "+ M[i][j]);
				if (i == 4) {
					maiorL5 = M[i][j];
					menorL5 = maiorL5;
				}
			}
		}

		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				M[i][j] = 0 + (int)Math.round(Math.random()* 9);
				System.out.println("M["+i+"] ["+j+"] "+ M[i][j]);
				if (i == 0 && j == 6) {
					maiorC7 = M[i][j];
					menorC7 = maiorC7;
				}
			}
		}
		
		//MAIOR E MENOR DA LINHA 5
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				if (i == 4) {
					if (maiorL5 < M[i][j]) {
						maiorL5 = M[i][j];
						mAI5 = i;
						mAJ5 = j;
					} else {
						if (j == M[i].length) {
							mAI5 = i;
							mAJ5 = j;	
						}
					}
					if (menorL5 > M[i][j]) {
						menorL5 = M[i][j];
						mEI5 = i;
						mEJ5 = j;
					} else {
						if (j == M[i].length) {
							mEI5 = i;
							mEJ5 = j;	
						}
					}
				}
			}
		}
		
		System.out.println();
		System.out.println("MAIOR E MENOR DA LINHA 5");
		System.out.println("M["+mAI5+"]["+mAJ5+"] "+maiorL5);
		System.out.println("M["+mEI5+"]["+mEJ5+"] "+menorL5);
		
		//MAIOR E MENOR DA COLUNA 7
				for (int i = 0; i < M.length; i++) {
					for (int j = 0; j < M[i].length; j++) {
						if (j == 6) {
							if (maiorC7 < M[i][j]) {
								maiorC7 = M[i][j];
								mAI7 = i;
								mAJ7 = j;
							} else {
								if (i == M.length) {
									mAI7 = i;
									mAJ7 = j;	
								}
							}
							
							if (menorC7 > M[i][j]) {
								menorC7 = M[i][j];
								mEI7 = i;
								mEJ7 = j;
							} else {
								if (i == M.length) {
									mEI7 = i;
									mEJ7 = j;	
								}
							}
						}
					}
				}
				
				System.out.println();
				System.out.println("MAIOR E MENOR DA COLUNA 7");
				System.out.println("M["+mAI7+"]["+mAJ7+"] "+maiorC7);
				System.out.println("M["+mEI7+"]["+mEJ7+"] "+menorC7);
		
	}

}
