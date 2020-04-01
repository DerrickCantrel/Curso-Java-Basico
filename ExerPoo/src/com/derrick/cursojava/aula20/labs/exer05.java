package com.derrick.cursojava.aula20.labs;

import java.util.Scanner;

public class exer05 {

	public static void main(String[] args) {
		
    Scanner scan = new Scanner(System.in);
		
		String[][][]diasHoras = new String[12][31][8];
		boolean sair = false;
		
		do {
			System.out.println("===============================");
			System.out.println("|======    AGENDA 2.0    ======|");
			System.out.println("================================");
			System.out.println("| 1 - Agendar uma tarega       |");
			System.out.println("| 2 - Realizar uma consulta    |");
			System.out.println("| 3 - Listar tarefas agendadas |");
			System.out.println("| 4 - Sair                     |");
			System.out.println("===============================");
			int menu = scan.nextInt();
			
			switch (menu) {
				case 1:
					System.out.println("Informe um mês do ano para agendar uma tarega: (1..12)");
					int mes1 = scan.nextInt();
					System.out.println("Informe um dia do mês para agendar uma tarega: (1..31)");
					int dia1 = scan.nextInt();
					System.out.println("Informe uma hora do dia para agendar um compromisso: (1..8)");
					int hora1 = scan.nextInt();
					System.out.println("Informe a tarega a ser agendada: ");
					String agendarCompromisso = scan.next();
					for (int i = 0; i < diasHoras.length; i++) {
						for (int j = 0; j < diasHoras[i].length; j++) {
							for (int k = 0; k < diasHoras[i][j].length; k++) {
								if (i == mes1 && j == dia1 && k == hora1) {
									diasHoras[i][j][k] = agendarCompromisso;
								}	
							}
						}
					}
					break;
				case 2: 
					System.out.println("Informe um mês do ano para agendar uma tarega: (1..12)");
					int mes2 = scan.nextInt();
					System.out.println("Informe um dia do mês para realizar a consulta na agenda: ");
					int dia2 = scan.nextInt();
					System.out.println("Informe uma hora do dia para realizar a consulta na agenda:: ");
					int hora2 = scan.nextInt();
					for (int i = 0; i < diasHoras.length; i++) {
						for (int j = 0; j < diasHoras[i].length; j++) {
							for (int k = 0; k < diasHoras[i][j].length; k++) {
								if (i == mes2 && j == dia2 && k == hora2) {
									System.out.println("Mês: "+i+" Dia: " +j+ " Hora: "+k);
									System.out.println("Compromisso: " + diasHoras[i][j][k]);
									System.out.println();	
								}
							}
						}
					}
					break;
				case 3:
					for (int i = 0; i < diasHoras.length; i++) {
						for (int j = 0; j < diasHoras[i].length; j++) {
							for (int k = 0; k < diasHoras[i][j].length; k++) {
								if (diasHoras[i][j][k] != null) {
									System.out.println("Mês: "+i+" Dia: " +j+ " Hora: "+k);
									System.out.println("Compromisso: " + diasHoras[i][j][k]);
									System.out.println();
								}
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
