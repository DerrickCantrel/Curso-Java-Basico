
public interface MecanicaDoJogo {

	public abstract void iniciarJogo();
	public abstract void acertou(String resposta);
	public abstract int chances();
	public abstract int pontos();
	public abstract void modoDificil();
	public abstract void modoNormal();
	public abstract boolean fimDeJogo();

}
