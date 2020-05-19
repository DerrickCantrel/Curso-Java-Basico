
public class Principal {
	public static void main(String[] args) {
		Produto p1 = new Produto("Calça", 1909, 79.90);
		CarrinhoDeCompras cc = new CarrinhoDeCompras();
		
		System.out.println(cc.adicionarProduto(p1, 2));	
		
		Produto p2 = new Produto("Bola", 1909, 29.90);
		System.out.println(cc.adicionarProduto(p2, 2));
		
		cc.imprimirProdutos();
		
		System.out.println();
		Produto p3 = new Produto("Bola", 1909, 29.90);
		System.out.println(cc.adicionarProduto(p3, 2));
		
		cc.imprimirProdutos();
		
		//System.out.println(cc.produtos.get(p2));
		
		System.out.println(cc.valorTotalCompra());
	}
}
