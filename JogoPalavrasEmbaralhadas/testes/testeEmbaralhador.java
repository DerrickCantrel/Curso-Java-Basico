import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testeEmbaralhador {

	Embaralhador embaralhador;
	
	@Before
	public void inicializaVariaveis() {
		embaralhador = new FabricaEmbaralhadores();
	}
	
	//Sort1 retorna uma palavra com seus caracteres aleatórios 
	@Test
	public void embaralhadorSort1() {
		String aux = "berinjela";
		embaralhador.palavraDividida(aux, 2);
		//embaralhador.sort1(aux);
		
		assertNotEquals(aux, embaralhador.palavraInvertida());
	}
	
	//Sort2 retorna uma palavra de "ao contrário" 
	@Test
	public void embaralhadorSort2() {
		String aux = "açucar";
		embaralhador.palavraDividida(aux, 1);
		//embaralhador.sort1(aux);
		
		assertNotEquals(aux, embaralhador.palavraInvertida());
	}
	
	//comparando a palavra inversa do sort2, validando
	@Test
	public void palavraSort2validando() {
		String aux = "açucar";
		String espero = "racuça";
		embaralhador.palavraDividida(aux, 1);
		
		assertEquals(espero, embaralhador.palavraInvertida());
	}

}
