import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestePizza {

	@Test
	void CarrinhoDeComprasValorTotal() {
		Pizza p4 = new Pizza();
		p4.adicionarIngrediente("Alho");
		p4.adicionarIngrediente("Calabresa");
		
		CarrinhoDeCompras cc = new CarrinhoDeCompras();
		cc.adicionarPizzas(p4);
		assertEquals(15, cc.valorTotalPizzas());
		
	}

}
