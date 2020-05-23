import java.io.IOException;

public class FabricaMecanicaDoJogo implements MecanicaDoJogo {

	private int chances;
	private int pontos;
	private int modo;
	FabricaEmbaralhadores fb;
	BancoDePalavras bp;
	
	public FabricaMecanicaDoJogo() {
		this.chances = 3;
		fb = new FabricaEmbaralhadores();
		bp = new BancoDePalavras();
	}
	
	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	
	public int getChances() {
		return chances;
	}

	public void setChances(int chances) {
		this.chances = chances;
	}

	public int getModo() {
		return modo;
	}

	public void setModo(int modo) {
		this.modo = modo;
	}

	public void iniciaJogo() {
		//Lendo as palavras de um arquivo.
		String caminho = "/Users/Derrick/eclipse-workspace/JogoPalavrasEmbaralhadas/palavra/palavras.txt";
		try {
			bp.leitorPalavras(caminho);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//Palavra sorteada normal
		String aux = bp.sortearPalavra();
		//Método que irá dividir e chamar o embaralhador
		fb.palavraDividida(aux, getModo());
		System.out.println("A palavra embaralhada é: " + fb.getPalavraInvertida());
	}
	
	public void acertou(String resposta) {
		if (resposta.equalsIgnoreCase(bp.getPalavraAtual())) {
			System.out.println("Parabéns você acertou!!! ");
			System.out.println();
			setPontos(getPontos() + 1);
			System.out.println("Vamos para a próxima palavra");
			novaPalavra();
		} else {
			setChances(getChances() - 1);
			if (getChances() == 0) {
				System.out.println("Fim de Jogo sua pontuação foi: " + getPontos());
				System.out.println();
				fimDeJogo();
			} else {
				System.out.println("Você ainda tem " + getChances() + " chances.");
			}
		}
	}
	
	public void novaPalavra() {
		//Palavra sorteada normal
		String aux = bp.sortearPalavra();
		//Método que irá dividir e chamar o embaralhador
		fb.palavraDividida(aux, getModo());
		System.out.println("A Nova palavra embaralhada é: " + fb.getPalavraInvertida());
	}
	
	//Acertou quantas palavras
	@Override
	public boolean fimDeJogo() {
		return true;
	}

	@Override
	public void modoDificil() {
		iniciaJogo();
	}

	@Override
	public void modoNormal() {
		iniciaJogo();
	}

	
}
