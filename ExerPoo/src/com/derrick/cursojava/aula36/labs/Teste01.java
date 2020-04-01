package com.derrick.cursojava.aula36.labs;

import java.util.Scanner;

import com.derrick.cursojava.aula36.Telefone;

public class Teste01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//INSTANCIANDO O OBJETO
		Agenda agenda = new Agenda();
		System.out.println("Entre com um nome para a Agenda: ");
		agenda.setNome(scan.nextLine());
		
		Contato contato1 = new Contato();
		Contato contato2 = new Contato();
		Contato contato3 = new Contato();
		
		Contato[] contatos = new Contato[3];
		
		for (int i = 1; i < 4; i++) {
			System.out.println("Informe o nome do " + i + "º Contato");
			if (i == 1) {
				contato1.setNome(scan.nextLine());
			} 
			if (i == 2) {
				contato2.setNome(scan.nextLine());
			} 
			if (i == 3) {
				contato3.setNome(scan.nextLine());
			}
			
			System.out.println("Informe o e-mail do " + i + "º Contato");
			if (i == 1) {
				contato1.setEmail(scan.nextLine());
			} 
			if (i == 2) {
				contato2.setEmail(scan.nextLine());
			} 
			if (i == 3) {
				contato3.setEmail(scan.nextLine());
			}
			
			System.out.println("Informe o telefone do " + i + "º Contato");
			if (i == 1) {
				contato1.setTelefone(scan.nextLine());
				contatos[i-1] = contato1;
			}
			if (i == 2) {
				contato2.setTelefone(scan.nextLine());
				contatos[i-1] = contato2;
			} 
			if (i == 3) {
				contato3.setTelefone(scan.nextLine());
				contatos[i-1] = contato3;
			}
		}
		
		agenda.setContatos(contatos);
		
		if (agenda != null) {
			System.out.println(agenda.ObterInfo());
		}
	}

}
