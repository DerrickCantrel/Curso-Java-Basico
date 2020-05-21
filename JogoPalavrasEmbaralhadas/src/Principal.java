import java.io.IOException;


public class Principal {

	public static void main(String[] args) throws IOException {
		Embaralhador s1 = new FabricaEmbaralhadores();
		FabricaEmbaralhadores fb = new FabricaEmbaralhadores();
		BancoDePalavras bp = new BancoDePalavras();
		
		//Lendo as palavras de um arquivo.
		String caminho = "/Users/Derrick/eclipse-workspace/JogoPalavrasEmbaralhadas/palavra/palavras.txt";
		bp.leitorPalavras(caminho);
		
		/*
		System.out.println();
		for(String bp : BancoDePalavras.palavraSort) {
			System.out.println(bp);
		}
		*/
		
		bp.sortearPalavra(fb);
		
		System.out.println("==========================================");
		System.out.println("Seja bem-vindo ao Embaralhador de Palavras");
		System.out.println("             Boa Sorte!!!                 ");
		System.out.println("==========================================");
		
		
	}

}
