import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws IOException {
		String caminho = "/Users/Derrick/eclipse-workspace/JogoPalavrasEmbaralhadas/palavra/palavras.txt";
		//Lendo as palavras de um arquivo.
		BancoDePalavras.leitorPalavras(caminho);
		
		System.out.println();
		for(String bp : BancoDePalavras.palavraSort) {
			System.out.println(bp);
		}
		//FALTA SORTEAR A PALAVRA
	}

}
