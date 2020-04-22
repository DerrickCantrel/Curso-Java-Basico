package com.derrick.itajava.week01.aula04;

public class Principal {

	public static void main(String[] args) {
		//Paciente 01
		Paciente p1 = new Paciente(100, 1.82);
		p1.nome = "Otavio";
		p1.idade = 35;
		
		p1.calcularIMC();
		System.out.println(p1.diagnostico());
		
		//Paciente 02
		Paciente p2 = new Paciente(65, 1.69);
		p2.nome = "Flavia";
		p2.idade = 22;
		
		p2.calcularIMC();
		System.out.println(p2.diagnostico());
		
		//Paciente 03
		Paciente p3 = new Paciente(46, 1.59);
		p3.nome = "July";
		p3.idade = 17;
		
		p3.calcularIMC();
		System.out.println(p3.diagnostico());
		

	}

}
