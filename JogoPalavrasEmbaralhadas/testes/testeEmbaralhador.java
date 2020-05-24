import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testeEmbaralhador {

	Embaralhador embaralhador;
	
	@Before
	public void inicializaVariaveis() {
		embaralhador = new FabricaEmbaralhadores();
	}
	
	//Sort1 retorna uma palavra com seus caracteres aleat�rios 
	@Test
	public void embaralhadorSort1() {
		String aux = "berinjela";
		embaralhador.palavraDividida(aux, 2);
		//embaralhador.sort1(aux);
		
		assertNotEquals(aux, embaralhador.palavraInvertida());
	}
	
	//Sort2 retorna uma palavra de "ao contr�rio" 
	@Test
	public void embaralhadorSort2() {
		String aux = "a�ucar";
		embaralhador.palavraDividida(aux, 1);
		//embaralhador.sort1(aux);
		
		assertNotEquals(aux, embaralhador.palavraInvertida());
	}
	
	//comparando a palavra inversa do sort2, validando
	@Test
	public void palavraSort2validando() {
		String aux = "a�ucar";
		String espero = "racu�a";
		embaralhador.palavraDividida(aux, 1);
		
		assertEquals(espero, embaralhador.palavraInvertida());
	}

}
