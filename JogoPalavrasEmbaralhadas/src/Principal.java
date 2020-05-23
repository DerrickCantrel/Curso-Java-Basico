import java.io.IOException;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) throws IOException {
		//Embaralhador s1 = new FabricaEmbaralhadores();
		//FabricaEmbaralhadores fb = new FabricaEmbaralhadores();
		//BancoDePalavras bp = new BancoDePalavras();
		
		//Lendo as palavras de um arquivo.
		//String caminho = "/Users/Derrick/eclipse-workspace/JogoPalavrasEmbaralhadas/palavra/palavras.txt";
		//bp.leitorPalavras(caminho);
		
		/*
		System.out.println();
		for(String bp : BancoDePalavras.palavraSort) {
			System.out.println(bp);
		}
		*/
		
		//bp.sortearPalavra(fb);
		
		Scanner scan = new Scanner(System.in);
		String resposta = "";
		FabricaMecanicaDoJogo fmb = new FabricaMecanicaDoJogo();
		
		int opcao = 0;
		while (opcao != 2) {
			System.out.println("|============================================|");
			System.out.println("| Seja bem-vindo ao Embaralhador de Palavras |");
			System.out.println("|             Boa Sorte!!!                   |");
			System.out.println("|============================================|");
			System.out.println("|             1 - Sortear Palavras           |");
			System.out.println("|             2 - Sair do Jogo               |");
			System.out.println("|============================================|");
			opcao = scan.nextInt();
			
			if (opcao == 1) {
				
				System.out.println("|============================================|");
				System.out.println("|    Escolha o modo de Dificuldade do Jogo   |");
				System.out.println("|============================================|");
				System.out.println("|             1 - Normal                     |");
				System.out.println("|             2 - Dificil                    |");
				System.out.println("|============================================|");
				int modo = scan.nextInt();
				if (modo == 1) {
					fmb.modoNormal();
					fmb.setModo(1);
				} else {
					fmb.modoDificil();
					fmb.setModo(2);
				}
			}
			
			while (fmb.getChances() != 0) {
				System.out.println("Organize a palavra para ganhar 01 ponto.");
				resposta = scan.next();
				
				fmb.acertou(resposta);
			}
		}
		System.out.println("Saindo..");
	}
}
