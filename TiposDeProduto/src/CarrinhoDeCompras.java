import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {

	Map<Produto, Integer> produtos = new HashMap<>();

	public CarrinhoDeCompras() {

	}

	public boolean adicionarProduto(Produto prod, int qtd) {
		boolean adicionado = false;
		if (produtos.size() != 0) {
			if (produtoExisteAdd(prod, qtd)) {
				adicionado = true;
			} else {
				produtos.put(prod, qtd);
				adicionado = true;
			}
		} else {
				produtos.put(prod, qtd);
				adicionado = true;
			}
		return adicionado;
	}
	
	public void imprimirProdutos() {
		for (Produto itens : produtos.keySet()) {
			System.out.println(itens.getNome() + " " + produtos.get(itens));
		}
	}
	
	private boolean produtoExisteAdd(Produto prod, int qtd) {
		if (produtos.size() != 0) {
			for (Produto itens : produtos.keySet()) {
				if (itens.getNome() == prod.getNome()) {
					int aux = produtos.get(itens);
					produtos.put(itens, (aux + qtd));
					return true;
				}	
			}
		}	
		return false;
	}
	
	//Método que remove produtos por quantidade
	public boolean removerProduto(Produto prod, int qtd) {
		if (produtos.size() != 0) {
			for (Produto itens : produtos.keySet()) {
				if (itens.getNome() == prod.getNome()) {
					int aux = produtos.get(itens);
					if (aux <= 1) {
						produtos.remove(itens);
					} else {
						produtos.put(itens, (aux - qtd));
						return true;	
					}
				}	
			}
		}	
		return false;
	}
	
	public double valorTotalCompra() {
		double preco = 0;
		for (Produto itens : produtos.keySet()) {
			preco += itens.getPreco() * produtos.get(itens);
		}
		return preco;
	}
}
