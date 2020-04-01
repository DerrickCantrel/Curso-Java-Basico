package com.derrick.cursojava.aula46.labs.exer03;

public class Cubo extends Figura3D{

	private double lado;	
	
	public double getLado() {
		return lado;
	}

	public void setLado(double arestas) {
		this.lado = arestas;
	}

	@Override
	public double calcularArea() {
		double areaT = 6 * (getLado() * getLado());
		
		return areaT;
	}

	@Override
	public double calcularVolume() {
		double volume = getLado() * getLado() * getLado();
		
		return volume;
	}

}
