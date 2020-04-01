import java.util.*;

public class TurmaArrayList {
	private String nome;
	private int numEstudantes;
	ArrayList<Estudante> myList = new ArrayList<Estudante>();

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
	
	/*
	 * public void setEstudante(int indice, Estudante e) {
		if (myList.get(indice) != null) {
			myList.set(indice, e);
			numEstudantes++;
		}
	}
	*/
	
	public void matricular(Estudante e) {
		myList.add(e);
	}
	
	/*
	public void listar() {
		for (int i = 0; i < myList.size(); i++) {
			if (myList.get(i) != null) {
				myList.get(i).exibir();
			}
		}
	}
	*/
	
	public void listar() {
		for (Estudante e : myList) {
			e.exibir();
		}
	}
	
	/*
	 * 
	 * public void pesquisar(int matricula) {
		for (int i = 0; i < myList.size(); i++) {
			if (myList.get(i) != null && myList.get(i).getMatricula() == matricula) {
				myList.get(i).exibir();
			}
		}
	}
	*/
	
	public void pesquisar(int matricula) {
		for (Estudante e : myList) {
			if (e != null && e.getMatricula() == matricula) {
				e.exibir();
			}
		}
	}

	/*
	public void trancar(int matricula) {
		for (int i = 0; i < myList.size(); i++) {
			if (myList.get(i).getMatricula() == matricula) {
				myList.remove(i);
				numEstudantes--;
			}
		}
	}
	*/
	
	public void trancar(int matricula) {
		for (Estudante e : myList) {
			if (e.getMatricula() == matricula) {
				myList.remove(e);
				numEstudantes--;
			}
		}
	}
	
	/*
	public void trancar(Estudante e) {
		for (int i = 0; i < myList.size(); i++) {
			if (myList.get(i) == e) {
				myList.remove(i);
				numEstudantes--;
			}
		}
	}*/
	
	public void trancar(Estudante e) {
		for (Estudante est : myList) {
			if (est == e) {
				myList.remove(e);
				numEstudantes--;
			}
		}
	}
	
	public TurmaArrayList() {
		
	}
	
	public TurmaArrayList(String nome, int numEstudantes) {
		this.nome = nome;
		this.numEstudantes = numEstudantes;
	}
}
