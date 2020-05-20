
public class Respeitoso implements FormatadorNome {
	
	private String sexo;

	protected String getSexo() {
		return sexo;
	}

	public Respeitoso(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		if(getSexo().equalsIgnoreCase("masculino")) {
			return "Sr. " + sobrenome; 
		} 
		return "Sra. " + sobrenome;
	}

}
