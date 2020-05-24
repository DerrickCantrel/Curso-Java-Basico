import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class BancoDePalavras{
	private ArrayList<String> palavraSort = new ArrayList<String>();
	private String sorteadas[] = new String[21];
	private String palavraAtual;
	public int limite;


	public String getPalavraAtual() {
		return palavraAtual;
	}

	public void setPalavraAtual(String palavraAtual) {
		this.palavraAtual = palavraAtual;
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}

	public int getPalavraSort() {
		return palavraSort.size();
	}

	public BancoDePalavras() {
		this.limite = 0;
	}

	public void leitorPalavras(String caminho) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(caminho));
		String linha;
		while (true) {
			linha = buffRead.readLine();
			palavraSort.add(linha);
			if (linha == null) {
				break;
			}
		}
		buffRead.close();
	}

	public void embaralharPalavras() {
		Collections.shuffle(palavraSort);

		for (int i=0; i<palavraSort.size(); i++) {
			sorteadas[i] = palavraSort.get(i);
		}
	}

	public String sortearPalavra() {
		String palavra;

		if (getLimite() == 0) {
			palavra = sorteadas[getLimite()];
			setPalavraAtual(palavra);
			setLimite(getLimite() + 1);

			return palavra;
		} else {
			palavra = sorteadas[getLimite()];
			setPalavraAtual(palavra);
			setLimite(getLimite() + 1);

			return palavra;
		}
	}
}
