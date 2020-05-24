import java.util.ArrayList;
import java.util.Random;

public class FabricaEmbaralhadores implements Embaralhador{
	private char letras[];
	private Random random;
	private String palavraInv;


	public FabricaEmbaralhadores() {
		random = new Random();
	}

	public String getPalavraInv() {
		return palavraInv;
	}

	public void setPalavraInv(String palavraInv) {
		this.palavraInv = palavraInv;
	}


	@Override
	public void sort1(String palavra) {
		boolean invertido = false;
		int numSort;
		String palavraInversa = "";
		ArrayList<Integer> numeros = new ArrayList<Integer>(palavra.length());
		
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
			palavraInversa += letras[numero] +  "";
		}
		setPalavraInv(palavraInversa);
	}
	
	@Override
	public void sort2(String palavra) {
		String palavraInversa = "";
		int aux = palavra.length() -1;
		
		for (int i = 0; i < palavra.length(); i++) {
			palavraInversa += letras[aux] + "";
			aux--;
		}
		
		setPalavraInv(palavraInversa);
	}

	@Override
	public void palavraDividida(String palavra, int modo) {
		final int TAMANHO = palavra.length();
		letras = new char[TAMANHO];
		
		for ( int i=0; i<TAMANHO; i++ )
			letras[i] = palavra.charAt(i);
		
		if (modo == 1) {
			sort2(palavra);
		} else {
			sort1(palavra);
		}
		//unirCarecteres();
	}

	@Override
	public String palavraInvertida() {
		
		return getPalavraInv();
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
