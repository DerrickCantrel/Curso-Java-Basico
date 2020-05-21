import java.util.ArrayList;
import java.util.Random;

public class FabricaEmbaralhadores implements Embaralhador{
	private char letras[];
	private Random random;
	private String palavraInvertida;
	
	public FabricaEmbaralhadores() {
		random = new Random();
		palavraInvertida = "";
	}
	
	public String getPalavraInvertida() {
		return palavraInvertida;
	}

	@Override
	public void sort1(String palavra) {
		boolean invertido = false;
		int numSort;
		ArrayList<Integer> numeros = new ArrayList(palavra.length());
		
		while (!invertido) {
			//numeros randomicos entre 0 e o tamanho da palavra
			numSort = random.nextInt(palavra.length());
			
			boolean integrar = true;
			
			//verifica se o numero random já existe
			for (Integer numero : numeros) {
				if (numero == numSort) {
					integrar = false;
					break;
				}
			}
			if(integrar){
	            numeros.add(numSort);
	        }
			
			if (numeros.size() == palavra.length()) {
				invertido = true;
			}
		}
		//chama o vetor de letras com numero randomico sem repetir
		for (Integer numero : numeros) {
			palavraInvertida += letras[numero] +  "";
		}
		System.out.println(palavraInvertida);
	}

	//Falta Implementar
	@Override
	public String sort2(String palavra) {
		// TODO Auto-generated method stub
		return null;
	}

	public void palavraDividida(String palavra) {
		final int TAMANHO = palavra.length();
		letras = new char[TAMANHO];
		
		for ( int i=0; i<TAMANHO; i++ )
			letras[i] = palavra.charAt(i);
		
		sort1(palavra);
		//unirCarecteres();
	}
	
	/*
	private void unirCarecteres() {
		String aux = "";
		for (int i=0; i<letras.length; i++) {
			aux += letras[i];
		}
		System.out.println(aux);
	}
	*/
}
