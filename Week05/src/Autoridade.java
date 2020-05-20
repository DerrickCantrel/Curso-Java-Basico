
public class Autoridade{

	private String nome;
	private String sobrenome;
	private FormatadorNome formatador;
	
	public Autoridade(String nome, String sobrenome, FormatadorNome formatador) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.formatador = formatador;
	}

	protected String getNome() {
		return nome;
	}

	protected String getSobrenome() {
		return sobrenome;
	}
	
	public String getTratamento() {
		return this.formatador.formatarNome(getNome(), getSobrenome());
	}
	
}
