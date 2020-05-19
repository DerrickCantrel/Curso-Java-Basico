import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteProdutoComTamanho {

	ProdutoComTamanho prod1;
	
	@Before
	public void inicializaProdutoComTamanho() {
		prod1 = new ProdutoComTamanho("Calça", 0403, 69.90, "M");
	}
	
	@Test
	public void validandoDadosProdutoComTamanho() {
		assertEquals(prod1.getNome(), "Calça");
		assertEquals(prod1.getCodigo(), 0403);
		assertEquals(prod1.getPreco(), 69,90);
	}
	
	
	@Test
	public void ProdutosComTamanhoCodigoIgual() {
		ProdutoComTamanho prod2 = new ProdutoComTamanho("Short", 0403, 39.90);
		assertTrue(prod1.equals(prod2));
	}
	
	@Test
	public void ProdutosComTamanhoCodigoIgualETamanhoDiferentes() {
		ProdutoComTamanho prod2 = new ProdutoComTamanho("Short", 0403, 39.90, "P");
		assertFalse(prod1.equals(prod2));
	}
	
	@Test
	public void ProdutosComTamanhoCodigoIgualETamanhoIgual() {
		ProdutoComTamanho prod2 = new ProdutoComTamanho("blusa", 0403, 89.90, "M");
		assertTrue(prod1.equals(prod2));
	}
	
	@Test
	public void ProdutosComTamanhoCodigoDiferente() {
		ProdutoComTamanho prod2 = new ProdutoComTamanho("Camiseta", 1976, 39.90, "M");
		assertFalse(prod1.equals(prod2));
	}

}
