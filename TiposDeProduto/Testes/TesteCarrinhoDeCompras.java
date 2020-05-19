import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteCarrinhoDeCompras {

	CarrinhoDeCompras cc;
	Produto p1;
	Produto p2;
	ProdutoComTamanho p3;
	ProdutoComTamanho p4;
	Produto p5;
	
	@Before
	public void incializarObjetos() {
		cc = new CarrinhoDeCompras();
		p1 = new Produto("Bola", 1011, 19.90);
		p2 = new Produto("Paralela", 1021, 60.00);
		p3 = new ProdutoComTamanho("Tênis", 9887, 90.00, "40");
		p4 = new ProdutoComTamanho("Chinelo", 9887, 90.00, "40");
		p5 = new Produto("Paralela", 1022, 60.00);
	}
	
	//Validando o adicionar produto
	@Test 
	public void adicionandoUmProdutoNoCarrinho() {
		assertTrue(cc.adicionarProduto(p1, 2));
	}
	
	//Adicionando produtos iguais no carrinho
	@Test 
	public void adicionandoDoisProdutoNoCarrinhoIgual() {
		assertTrue(cc.adicionarProduto(p1, 2));
		assertTrue(cc.adicionarProduto(p5, 2));
	}
	
	//Adicionando produtos com tamanho iguais no carrinho
	@Test 
	public void adicionandoDoisProdutosComTamanhoIguais() {
		assertTrue(cc.adicionarProduto(p3, 2));
		assertTrue(cc.adicionarProduto(p4, 2));
	}
		
	
	//Removendo uma unidade de um produto
	@Test
	public void removendoProdutoNoCarrinhoComTresQtd() {
		cc.adicionarProduto(p4, 3);
		assertTrue(cc.removerProduto(p4, 1));
	}
	
	//Removendo todas as unidades de um produto
	@Test
	public void removendoTodasQtdProdutoNoCarrinho() {
		cc.adicionarProduto(p4, 3);
		assertTrue(cc.removerProduto(p4, 3));
	}
	
	@Test
	public void validandoValorTotalDaCompra() {
		cc.adicionarProduto(p1, 2);
		cc.adicionarProduto(p2, 1);
		cc.adicionarProduto(p3, 2);
		cc.adicionarProduto(p4, 3);
		cc.adicionarProduto(p5, 1);
		assertEquals(cc.valorTotalCompra(), 609,8);
	}
}
