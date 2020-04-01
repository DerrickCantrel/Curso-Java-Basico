
public class TestCar {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Flavio Almeida", 25);
		Carro c1 = new Carro();
		c1.setModelo("Fiat Siena");
		c1.setPlaca("PNG - 2244");
		c1.setAno(2018);
		c1.setValor(42000);
		p1.carros[0] = c1;
		p1.mostrar();
		
		//Carro com Desconto
		c1.setAplicarDesconto(20);
		p1.carroPesquisar("PNG - 2484");
	}
}
