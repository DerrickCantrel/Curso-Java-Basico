import java.util.*;

public class Principal {

	public static void main(String[] args) {
		Pizza p1 = new Pizza();
		Pizza p2 = new Pizza();
		Pizza p3 = new Pizza();

		//Ingredientes Pizza 01
		p1.adicionarIngrediente("Frango");
		p1.adicionarIngrediente("Catupiry");
		System.out.println(p1.getPreco());

		//Ingredientes Pizza 02
		p2.adicionarIngrediente("Mussarela");
		p2.adicionarIngrediente("Azeitonas");
		p2.adicionarIngrediente("Tomate");
		System.out.println(p2.getPreco());

		//Ingredientes Pizza 03
		p3.adicionarIngrediente("Calabresa");
		p3.adicionarIngrediente("Chedder");
		p3.adicionarIngrediente("Cebola");
		System.out.println(p3.getPreco());

		//Adicionando Pizzas ao Carrinho
		CarrinhoDeCompras cc = new CarrinhoDeCompras();
		cc.adicionarPizzas(p1);
		cc.adicionarPizzas(p2);
		cc.adicionarPizzas(p3);

		//Valor Total do Carrinho
		if (cc != null) {
			System.out.println("Valor Total das Pizzas = " + cc.valorTotalPizzas());
		}
		System.out.println();
		
		//Ingredientes utilizados
		Pizza.imprimirIngredientes();
		System.out.println();
		
		//Método zerar Ingredientes
		Pizza.zerarIngredientes();
		System.out.println("Está limpo? " + Pizza.zerarIngredientes());
	}
}
