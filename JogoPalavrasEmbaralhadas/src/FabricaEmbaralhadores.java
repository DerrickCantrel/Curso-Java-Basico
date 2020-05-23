import java.util.ArrayList;
import java.util.Random;

public class FabricaEmbaralhadores implements Embaralhador{
	private char letras[];
	private Random random;
	private String palavraInvertida;

	
	public String getPalavraInvertida() {
		return palavraInvertida;
	}
	
	public void setPalavraInvertida(String palavraInvertida) {
		this.palavraInvertida = palavraInvertida;
	}

	public FabricaEmbaralhadores() {
		random = new Random();
		palavraInvertida = "";
	}


	@Override
	public void sort1(String palavra) {
		boolean invertido = false;
		int numSort;
		String letrasConcat = "";
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
			 letrasConcat += letras[numero] +  ""; //alterar
		}
		setPalavraInvertida(letrasConcat);
		//System.out.println(palavraInvertida);
	}

	//Falta Implementar
	@Override
	public void sort2(String palavra) {
		// Determia as letras que poderão estar presente nas chaves
		String letras = palavra;
		 
		Random random = new Random();
		 
		String armazenaChaves = "";
		int index = -1;
		for( int i = 0; i < 9; i++ ) {
		   index = random.nextInt( letras.length() );
		   armazenaChaves += letras.substring( index, index + 1 );
		}
		setPalavraInvertida(armazenaChaves);
	}

	public void palavraDividida(String palavra, int modo) {
		final int TAMANHO = palavra.length();
		letras = new char[TAMANHO];
		
		for ( int i=0; i<TAMANHO; i++ )
			letras[i] = palavra.charAt(i);
		
		if (modo == 1) {
			sort2(palavra);
		} else if (modo == 2) {
			sort1(palavra);
		}
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
