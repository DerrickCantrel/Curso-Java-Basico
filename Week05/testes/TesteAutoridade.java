import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TesteAutoridade {

	FormatadorNome f1, f2, f3, f4;
	
	@Before
	public void inicializarInstancia() {
		f1 = new Informal();
		f2 = new Respeitoso("Feminino");
		f3 = new Respeitoso("Masculino");
		f4 = new ComTitulo("Vossa Excel�ncia");
		
	}
	//Validando m�todo sobrescrito informal();
	@Test
	public void tratamentoInformal() {
		Autoridade a = new Autoridade("Derrick", "Cantrel", f1);
		assertEquals("Derrick", a.getTratamento());
	}
	
	//Validando m�todo sobrescrito respeitoso feminino();
	@Test
	public void tratamentoRespeitosoF() {
		Autoridade b = new Autoridade("Liliane", "Almeida", f2);
		assertEquals("Sra. Almeida", b.getTratamento());
	}
	
	//Validando m�todo sobrescrito respeitoso masculino();
	@Test
	public void tratamentoRespeitosoM() {
		Autoridade c = new Autoridade("Junior", "Taissaba", f3);
		assertEquals("Sr. Taissaba", c.getTratamento());
	}
	
	//Validando m�todo sobrescrito comTitulo();
	@Test
	public void tratamentoComTitulo() {
		Autoridade d = new Autoridade("Francisco", "Germano", f4);
		assertEquals("Vossa Excel�ncia Francisco Germano", d.getTratamento());
	}

}
