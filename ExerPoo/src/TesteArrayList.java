import java.util.*;

public class TesteArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<Integer>();
		li.add(1); //li.add(new Integer(1)) -> Equivalente depreciado
		li.add(2);
		for (int i = 0; i < li.size(); i++) {
			int n = li.get(i);
			System.out.println( n );
		}
	}
}