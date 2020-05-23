import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class BancoDePalavras{
	private Embaralhador sortido;
	private String palavraSort[] = new String[21];
	private String palavraAtual;

	
	public String getPalavraAtual() {
		return palavraAtual;
	}

	public void setPalavraAtual(String palavraAtual) {
		this.palavraAtual = palavraAtual;
	}



	public BancoDePalavras() {}
	
	public void leitorPalavras(String caminho) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(caminho));
		String linha;
		int i = 0;
		while (true) {
			linha = buffRead.readLine();
			palavraSort[i] = linha;
			if (linha == null) {
				break;
			}
			i++;
		}
		buffRead.close();
	}
	
	public String sortearPalavra() {
		Random numSort = new Random();
		int sort = numSort.nextInt(20) + 0;		
		//System.out.println(palavraSort[sort]);
		
		//fb.palavraDividida(palavraSort[sort]); modo antingo
		//this.sortido.sort1((palavraSort[sort]));
		setPalavraAtual(palavraSort[sort]);
		
		return palavraSort[sort];
	}
}
