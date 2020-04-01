package com.derrick.cursojava.aula20.labs;

import java.util.Scanner;

public class exer04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[][]diasHoras = new String[31][24];
		boolean sair = false;
		
		do {
			System.out.println("===============================");
			System.out.println("| 1 - Agendar uma tarega       |");
			System.out.println("| 2 - Realizar uma consulta    |");
			System.out.println("| 3 - Listar tarefas agendadas |");
			System.out.println("| 4 - Sair                     |");
			System.out.println("===============================");
			int menu = scan.nextInt();
			
			switch (menu) {
				case 1:
					System.out.println("Informe um dia do mês para agendar uma tarega: ");
					int dia1 = scan.nextInt();
					System.out.println("Informe uma hora do dia para agendar um compromisso: ");
					int hora1 = scan.nextInt();
					System.out.println("Informe a tarega a ser agendada: ");
					String agendarCompromisso = scan.next();
					for (int i = 0; i < diasHoras.length; i++) {
						for (int j = 0; j < diasHoras[i].length; j++) {
							if (i == dia1 && j == hora1) {
								diasHoras[i][j] = agendarCompromisso;
							}
						}
					}
					break;
				case 2: 
					System.out.println("Informe um dia do mês para realizar a consulta na agenda: ");
					int dia2 = scan.nextInt();
					System.out.println("Informe uma hora do dia para realizar a consulta na agenda:: ");
					int hora2 = scan.nextInt();
					for (int i = 0; i < diasHoras.length; i++) {
						for (int j = 0; j < diasHoras[i].length; j++) {
							if (i == dia2 && j == hora2) {
								System.out.println("Dia: " +i+ "Hora: "+j+ " - "+diasHoras[i][j]);
							}
						}
					}
					break;
				case 3:
					for (int i = 0; i < diasHoras.length; i++) {
						for (int j = 0; j < diasHoras[i].length; j++) {
							if (diasHoras[i][j] != null) {
								System.out.println("Dia: " +i+ " Hora: "+j+ " - "+diasHoras[i][j]);
							}
						}
					}
					break;
				case 4: 
					sair = true;
			}	
		} while (!sair);
	}

}
