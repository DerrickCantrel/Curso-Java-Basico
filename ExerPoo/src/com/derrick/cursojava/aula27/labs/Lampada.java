package com.derrick.cursojava.aula27.labs;

public class Lampada {
	String modelo;
	String tensao;
	String cor;
	String tipoLuz;
	int garantiaMeses;
	boolean tipoAbajur;
	
	void ligarLampada() {
		System.out.println("A lampada está acesa.");
	}
	
	void desligarLampada() {
		System.out.println("A lampada está apagada.");
	}
	
	boolean onOffLampada(int num) {
		if (num == 0) {
			System.out.println("Lampada ON");
			return true;
		} else {
			System.out.println("Lampada OFF");
			return false;
		}
	}
}
