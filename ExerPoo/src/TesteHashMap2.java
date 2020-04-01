import java.util.HashMap;

public class TesteHashMap2 {

	public static void main(String[] args) {
		HashMap<Integer, Estudante> hm = new HashMap<Integer, Estudante>();
		Estudante e1 = new Estudante(222, "Flavio", 'M');
		Estudante e2 = new Estudante(333, "Andre", 'M');
		Estudante e3 = new Estudante(444, "Gugi", 'M');
		
		hm.put(1, e1);
		hm.put(2, e2);
		hm.put(3, e3);

		Estudante e = (Estudante)hm.get(3);
		e.exibir();
	}

}