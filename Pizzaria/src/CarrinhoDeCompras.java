import java.util.ArrayList;

public class CarrinhoDeCompras {
	public ArrayList<Pizza> pizzas = new ArrayList<>();
	public int valorTotal;

	public CarrinhoDeCompras() {
		this.valorTotal = 0;
	}

	public void adicionarPizzas(Pizza a) {
		if(a.qtdIngredientes != 0){
            pizzas.add(a);
        } else {
            System.out.println("Selecione os ingredientes da Pizza para adicionar no Carrinho");
    	}
	}

	public int valorTotalPizzas() {
		int aux = pizzas.size();
		for(int i = 0; i < aux; i++) {
			this.valorTotal += pizzas.get(i).getPreco();
		}
		return this.valorTotal;
	}
}
