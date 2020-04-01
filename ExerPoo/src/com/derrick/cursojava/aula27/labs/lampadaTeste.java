package com.derrick.cursojava.aula27.labs;

public class lampadaTeste {

	public static void main(String[] args) {
		
		Lampada led = new Lampada();
		led.modelo = "Rayowac";
		led.tensao = "18w";
		led.cor = "branca";
		led.tipoLuz = "Fluorescente";
		led.garantiaMeses = 8;
		led.tipoAbajur = false;
		
		led.ligarLampada();
		led.desligarLampada();
		
		boolean onOff = led.onOffLampada(0);
		System.out.println(onOff);
	}

}
