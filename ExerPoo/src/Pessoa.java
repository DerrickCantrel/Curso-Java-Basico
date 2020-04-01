
public class Pessoa {

	private String nome;
	private String endereco;
	private String telephone;
	private int idade;
	Carro[] carros = new Carro[5];
	
	public void setNome(String nome) {
		if (nome != null) {
			this.nome = nome;
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setEndereco(String endereco) {
		if (endereco != null) {
			this.endereco = endereco;
		}
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setTelephone(String telephone) {
		if (telephone != null) {
			this.telephone = telephone;
		}
	}
	
	public String getTelephone() {
		return telephone;
	}
	
	public void setIdade(int idade) {
		if (idade != 0) {
		this.idade = idade;
		}
	}
	
	public int getIdade() {
		return idade;
	}

	public void mostrar() {
		System.out.println("Nome: " + nome);
		System.out.println("Endereco: " + endereco);
		System.out.println("Telephone: " + telephone);
		System.out.println("Idade: " + idade);
		for (int i = 0; i < carros.length; i++) {
			if (carros[i] != null)
				carros[i].listar();
		}
	}
	
	public void adicionar(Carro carros[]) {
		for (int j = 0; j <= 5; j++) {
			if (carros[j] == null) {
				this.carros[j] = carros[j];
			}
		}
	}
	
	public void remover(Carro carros[], int i) {
		carros[i] = null;
	}
	
	public String carroPesquisar(String placa) {
		for (int i = 0; i < carros.length; i++) {
			if (carros[i] != null) {
				if (carros[i].getPlaca().equals(placa)) {
					return placa;				
				}
				break;
			}
		}
		return placa = "0";
	}
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public Pessoa (String nome, String endereco, String telephone, int idade) {
		this.nome = nome;
		this.endereco = endereco;
		this.telephone = telephone;
		this.idade = idade;
	}
}
