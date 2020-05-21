import java.io.IOException;

public class FabricaMecanicaDoJogo implements MecanincaDoJogo {

	private int chances;
	private int pontos;
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

	public void inicioJogo() {
		//Lendo as palavras de um arquivo.
		String caminho = "/Users/Derrick/eclipse-workspace/JogoPalavrasEmbaralhadas/palavra/palavras.txt";
		try {
			bp.leitorPalavras(caminho);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		bp.sortearPalavra();
	}
	
	public void acertou(String reposta) {
		if (reposta.equalsIgnoreCase(fb.getPalavraInvertida())) {
			setPontos(1);
		} else {
			setChances(getChances() - 1);
			if (getChances() != 0) {
				tenteNovamente(fb.getPalavraInvertida());
			} else {
				//chama a qtd de acertos 
				qtdAcertos();
			}
		}
	}
	
	//Acertou quantas palavras
	@Override
	public int qtdAcertos() {
		fb.getPalavraInvertida();
		
		
		return 0;
	}	
	
	@Override
	public int pontuacaoFinal() {
		
		
		return this.pontos;
	}

	@Override
	public void modoDificil() {
		bp.sortearPalavra(fb);;

	}

	@Override
	public void modoFacil() {
		// TODO Auto-generated method stub

	}

	@Override
	public void tenteNovamente(String novamente) {
		System.out.println("==========================");
		System.out.println("Você pode tentar novamente");
		System.out.println("==========================");
		
	}


}
