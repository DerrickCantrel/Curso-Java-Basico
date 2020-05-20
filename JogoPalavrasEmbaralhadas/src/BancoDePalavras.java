import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class BancoDePalavras {
	static String palavraSort[] = new String[21];
	
	public static void leitorPalavras(String caminho) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(caminho));
		String linha;
		int i = 0;
		while (true) {
			linha = buffRead.readLine();
			palavraSort[i] = linha;
			i++;
			if (linha != null) {
				System.out.println(linha);
			} else {
				break;
			}
		}
		buffRead.close();
	}
	
}
