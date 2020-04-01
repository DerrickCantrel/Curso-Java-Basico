import java.util.*;

public class TesteArrayList3 {

	public static void main(String[] args) {
		List myList = new ArrayList();
		
		myList.add("1");
		myList.add("2");
		myList.add("3");
		//Forma convencional de listar elementos de um Array
		for (int i = 0; i < myList.size(); i++) {
			System.out.println( myList.get(i) + " - for");
		}
		//Alternativa para listar elementos do ArrayList
		ListIterator it = myList.listIterator();
		while ( it.hasNext() ) {
			System.out.println( it.next() + " - iterator");

		}
	}

}
