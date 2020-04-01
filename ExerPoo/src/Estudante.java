//Questão 1,2
public class Estudante {
		
	private int matricula; 
	private String nome;
	private char sexo;
	private double notas[] = new double[4];
	
	public void setMatricula(int matricula) {
		if (matricula != 0) {
			this.matricula = matricula;
		}
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setNome(String nome) {
		if (nome != null) {
			this.nome = nome;
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setSexo(char sexo) {
		if (sexo != ' ') {
			this.sexo = sexo;
		}
	}
	
	public char getSexo() {
		return sexo;
	}
	
	public void setNotas(int indice, double notas[]) {
		if (notas[indice] != 0.0) {
			this.notas = notas;
		}
	}

	public void exibir() {
		System.out.println("Matricula: " + matricula);
		System.out.println("nome: " + nome);
		System.out.println("sexo: " + sexo);
		getMostrarNotas();	
	}
	
	public void exibir(String titulo) {
		System.out.println(titulo);
		exibir();
	}
	
	public void getMostrarNotas() {
		for (int i = 0; i < notas.length; i++) {
			System.out.println("notas ["+ i + "] = " + notas[i]);
		}
	}

	public void setNota(int numProva, double nota) {
		notas[numProva - 1] = nota;
	}
	
	public void setNota(int indice) {
		notas[indice - 1] = 0.0;
	}
	
	//MÉTODO SOBRECARREGADO
	public double getNota(int numProva) {
		return notas[numProva-1];
	}
	
	//CONSTRUTORES SOBRECARREGADOS
	public Estudante() {
		
	}
	
	public Estudante(String nome, char sexo) {
		this.nome = nome;
		this.sexo = sexo;
	}
	
	public Estudante(int matricula, String nome, char sexo) {
		this(nome, sexo); 
		this.matricula = matricula;
	}
	
}