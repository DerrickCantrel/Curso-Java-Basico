public class Turma {
	private String nome;
	private int numEstudantes;
	Estudante estudantes[] = new Estudante[10];
	
	public void setNome(String nome) {
		if (nome != " ") {
			this.nome = nome;
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNumEstudantes(int numEstudantes) {
		if (numEstudantes != 0) {
			this.numEstudantes = numEstudantes;
		}
	}
	
	public int getNumEstudantes() {
		return numEstudantes;
	}
	
	public void setEstudante(int indice, Estudante e) {
		if (estudantes[indice] != null) {
			estudantes[indice] = e;
		}
	}
	
	public void matricular(Estudante e) {
		for (int i = 0; i < estudantes.length; i++) {
			if (estudantes[i] == null) {
				estudantes[i] = e;
				numEstudantes += 1;
			}
		}
	}
	
	public void listar() {
		for (int i = 0; i < estudantes.length; i++) {
			if (estudantes[i] != null) {
				estudantes[i].exibir();
			}
		}
	}
	
	public void pesquisar(int matricula) {
		for (int i = 0; i < estudantes.length; i++) {
			if (estudantes[i] != null && estudantes[i].getMatricula() == matricula) {
					estudantes[i].exibir();
			}
		}
	}
	
	public void trancar(int matricula) {
		for (int i = 0; i < estudantes.length; i++) {
			if (estudantes[i].getMatricula() == matricula) {
				estudantes[i] = null;
				numEstudantes -= 1;
			}
		}
	}
	
	public void trancar(Estudante e) {
		for (int i = 0; i < estudantes.length; i++) {
			if (estudantes[i] == e) {
				estudantes[i] = null;
				numEstudantes -= 1;
			}
		}
	}
	
	
	public Turma() {
		
	}
	
	public Turma(String nome, int numEstudantes) {
		this.nome = nome;
		this.numEstudantes = numEstudantes;
	}
	
	
}
