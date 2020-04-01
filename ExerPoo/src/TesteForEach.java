import java.util.*;

public class TesteForEach {

	public static void main(String[] args) {
		Estudante e1 = new Estudante(111, "Pedro", 'M');
		Estudante e2 = new Estudante(222, "Leonardo", 'M');
		Estudante e3 = new Estudante(333, "Michele", 'F');
		ArrayList<Estudante> myList = new ArrayList<Estudante>();
		
		myList.add(e1);
		myList.add(e2);
		myList.add(e3);
		for (Estudante e : myList) {
			e.exibir();
		}
		//Removendo elemento especifico do ArrayList
		myList.remove(e2);
		for (Estudante e : myList) {
			e.exibir();
		}
		//Removendo todos elementos do ArrayList
		myList.clear();
		if (myList.isEmpty()) {
			System.out.println("A lista está vazia");
		}
		
	}

}
