package com.derrick.cursojava.aula46.labs.exer02;

public class Circulo extends Figura2D{
	private double raio;
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		double area = Math.PI * (getRaio() * getRaio());
		
		return area;
	}

}
