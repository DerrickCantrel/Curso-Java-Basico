package com.derrick.cursojava.aula46.labs.exer02;

public class Cubo extends Figura3D{

	private double arestas;	
	
	public double getArestas() {
		return arestas;
	}

	public void setArestas(double arestas) {
		this.arestas = arestas;
	}

	@Override
	public double calcularArea() {
		double areaT = 6 * (getArestas() * getArestas());
		
		return areaT;
	}

	@Override
	public double calcularVolume() {
		double volume = getArestas() * getArestas() * getArestas();
		
		return volume;
	}

}
