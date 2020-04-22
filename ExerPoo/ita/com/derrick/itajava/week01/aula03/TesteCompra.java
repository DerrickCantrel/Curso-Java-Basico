package com.derrick.itajava.week01.aula03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteCompra {

	@Test
	void compraAVista() {
		Compra c = new Compra(500);
		assertEquals(1, c.getNumParcelas());
		assertEquals(500, c.getValorParcela());
		assertEquals(500, c.getValorTotal());
	}
	
	@Test
	void compraParcelado() {
		Compra c = new Compra(4, 250);
		assertEquals(4, c.getNumParcelas());
		assertEquals(250, c.getValorParcela());
		assertEquals(1000, c.getValorTotal());
	}

}
