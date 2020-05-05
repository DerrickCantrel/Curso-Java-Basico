import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

class AntesDepois {

	@Before //Executa antes de cada teste
	public void before() {
		System.out.println("@Before");
	}
	
	@After //Executa depois de cada teste
	public void after() {
		System.out.println("@After");
	}
	/*
	@BeforeClass //Executa Antes de todos os testes
	public static void beforeClass() {
		System.out.println("@BeforeClass");
	}
	
	@AfterClass //Executa Depois de todos os testes
	public static void afterClass() {
		System.out.println("@AfterClass");
	}
	*/
	@Test
	public void test1() {
		System.out.println("Teste 1");
	}
	
	@Test
	public void test2() {
		System.out.println("Teste 2");
	}
	
	@Test
	public void test3() {
		System.out.println("Teste 3");
	}
}
