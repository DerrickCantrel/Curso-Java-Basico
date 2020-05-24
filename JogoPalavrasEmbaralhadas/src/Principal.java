import java.io.IOException;
import java.util.Scanner;

//Autor: Derrick Cantrel
//Vídeo: https://youtu.be/pIoiFbeUWjE
public class Principal {

	public static void main(String[] args) throws IOException {
		
		Scanner scan = new Scanner(System.in);
		String resposta = "";
		MecanicaDoJogo mj = new FabricaMecanicaDoJogo();
		//FabricaMecanicaDoJogo fmb = new FabricaMecanicaDoJogo();
		
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
					mj.modoNormal();
				} else {
					mj.modoDificil();
				}
			}
			
			while (mj.chances() != 0 || mj.pontos() == 20) {
				System.out.println("Organize a palavra para ganhar 01 ponto.");
				resposta = scan.next();
				
				mj.acertou(resposta);
				opcao = 2;
			}
			
			if (mj.pontos() == 20) {
				System.out.println("Parabéns você acertou todas as Palavras!!!");
			}
		}
		System.out.println("Saindo..");
	}
}
