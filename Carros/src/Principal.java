
public class Principal {

	public static void main(String[] args) {

		Corrida corridaDaAmizade = new Corrida(2000);
		corridaDaAmizade.adicionaCarro(new CarroSoma("Corolla", 10, 110));
		corridaDaAmizade.adicionaCarro(new CarroSoma("Civic", 8, 140));
		corridaDaAmizade.adicionaCarro(new CarroMulti("Camaro", 1.7, 100));
		corridaDaAmizade.adicionaCarro(new CarroMulti("Mustang", 1.4, 120));
		corridaDaAmizade.umDoisTresEJa();

	}

}
