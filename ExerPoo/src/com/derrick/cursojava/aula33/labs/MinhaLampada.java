package com.derrick.cursojava.aula33.labs;

public class MinhaLampada {
	private boolean ligado;
	private double potencia;
	
	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public MinhaLampada() {}
	
	public MinhaLampada(boolean ligado, double potencia) {
		this.ligado = true;
		this.potencia = potencia;
	}
	
	private boolean EstadoLampada() {
		boolean aux;
		
		if (isLigado() == false) {
			aux = false;
		} else {
			aux = true;
		}
		
		return aux;
	}
	
	public void LigarLampada() {
		
		if (this.EstadoLampada() == true) {
			System.out.println("A L�mpada j� est� acesa");
		} else {
			System.out.println("A L�mpada foi acendida");
			setLigado(true);
		}
	}
	
	public void DesligarLampada() {
		
		if (this.EstadoLampada() == false) {
				System.out.println("A L�mpada j� foi desligada");
		} else {
			System.out.println("A L�mpada foi desligada");
			setLigado(false);
		}
	}
}