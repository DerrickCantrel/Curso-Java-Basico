package com.derrick.cursojava.aula46.labs.exer02;

public class Cilindro extends Figura3D{

	private double altura;
	private double raio;
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		//area da base
		double areaB = Math.PI * (getRaio() * getRaio());
		//area lateral
		double areaL = getAltura() * (2 * Math.PI * getRaio());
		//area total
		double areaT = areaL + (2 * areaB);
		
		return areaT;
	}

	@Override
	public double calcularVolume() {
		double volume = Math.PI * (getRaio() * getRaio()) * getAltura();
		
		return volume;
	}

}
