package com.derrick.cursojava.aula46.labs.exer03;

public class Quadrado extends Figura2D{

	private double lado;
	
	
	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		double area = getLado() * getLado();
		
		return area;
	}

}
