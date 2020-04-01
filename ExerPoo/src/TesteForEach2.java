
public class TesteForEach2 {

	public static void main(String[] args) {
		Integer arr[] = new Integer[5];
		arr[0] = 1;
		arr[1] = 2;
		for (Integer i : arr) {
			if (i != null)
			System.out.println(i);
		}
	}

}
