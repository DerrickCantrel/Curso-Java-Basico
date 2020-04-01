
public class TesteCarro {

	public static void main(String[] args) {
	Pessoa p1 = new Pessoa("Jose", 20);
	Carro c1 = new Carro("Ford Ka", "XHK - 8890");
	p1.carros[0] = c1;
	p1.carroPesquisar("XHK - 8890");
	}

}
