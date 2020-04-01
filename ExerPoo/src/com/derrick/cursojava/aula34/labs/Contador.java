package com.derrick.cursojava.aula34.labs;

public class Contador {
	static int cont;
	
	public Contador() {
		this.cont++;
	}

	public static int getCont() {
		return cont;
	}

	public static void setCont(int cont) {
		Contador.cont = cont;
	}
	
	public void Incrementar() {
		setCont(getCont()+1);
	}
	
	public void ZerarCont() {
		setCont(0);
	}
	
	public void ValorCont() {
		System.out.println(getCont());
	}
}
