
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteProduto {

	Produto produto;
	
	@Before
	public void inicializaProduto() {
		produto = new Produto("Bolsa", 1209, 49.90);
	}
	
	@Test
	public void validandoDadosProduto() {
		assertEquals(produto.getPreco(), 49,90);
		assertEquals(produto.getNome(), "Bolsa");
		assertEquals(produto.getCodigo(), 1209);
	}
	
	@Test
	public void ProdutosCodigoIgual() {
		Produto produto1 = new Produto("Short", 1209, 39.90);
		assertTrue(produto.equals(produto1));
	}
	
	@Test
	public void ProdutosCodigoDiferente() {
		Produto produto1 = new Produto("Short", 1210, 39.90);
		assertFalse(produto.equals(produto1));
	}

}
