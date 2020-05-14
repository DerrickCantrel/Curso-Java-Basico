import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestePizza {

	//Verificando se o valor da pizza está correto de acordo com
	// Quantidade de ingredientes.
	@Test
	void ingredientesQtd1PrecoCorreto15() {
		Pizza pizza = new Pizza();
		pizza.adicionarIngrediente("mussarela");
		assertEquals(15, pizza.getPreco()); 
	}
	
	@Test
	void ingredientesQtd6PrecoCorreto23() {
		Pizza pizza = new Pizza();
		pizza.adicionarIngrediente("Bacon");
		pizza.adicionarIngrediente("Calabresa");
		pizza.adicionarIngrediente("mussarela");
		pizza.adicionarIngrediente("Azeitonas");
		pizza.adicionarIngrediente("Orégano");
		pizza.adicionarIngrediente("Catupiry");
		assertEquals(23, pizza.getPreco()); 
	}
	
	//Verificando os registros de ingredies
	@Test
	void registroPizzaIngredientes() {
		Pizza pizza = new Pizza();
		pizza.adicionarIngrediente("Azeitona");
		pizza.adicionarIngrediente("Mussarela");
		pizza.adicionarIngrediente("Tomate");
		
		assertEquals("Azeitona", pizza.ingrediente.get(0));
		assertEquals("Mussarela", pizza.ingrediente.get(1));
		assertEquals("Tomate", pizza.ingrediente.get(2));
	}
	
	//Verificando o novo método de remoção de ingredientes
	@Test
	void limpandoRegistrosIngredientes() {
		Pizza pizza = new Pizza();
		pizza.adicionarIngrediente("Azeitona");
		pizza.adicionarIngrediente("Mussarela");
		pizza.adicionarIngrediente("Tomate");
		
		assertEquals(0, Pizza.zerarIngredientes());
	}
	
	//Verificando se o carrinho de compras está calculando corretamente
	@Test
	void valorPizzaCorreto() {
		Pizza p4 = new Pizza();
		p4.adicionarIngrediente("Alho");
		p4.adicionarIngrediente("Calabresa");
		
		CarrinhoDeCompras cc = new CarrinhoDeCompras();
		cc.adicionarPizzas(p4);
		assertEquals(15, cc.valorTotalPizzas());
	}
	
	@Test
	void impedirPizzaSemIngredientes() {
		Pizza p1 = new Pizza();
		CarrinhoDeCompras cc1 = new CarrinhoDeCompras();
		assertFalse(cc1.adicionarPizzas(p1));
	}
}
