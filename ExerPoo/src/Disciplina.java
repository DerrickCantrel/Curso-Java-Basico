
public class Disciplina {

	String nome;
	String codigo;
	int cargaHoraria;
	Estudante[] estudantes = new Estudante[5];

	public void listar() {
		exibir();
		for (int i = 0; i < estudantes.length; i++) {
			if (estudantes[i] != null) {
				estudantes[i].exibir();
			}
		}
		
	}
	
	public void exibir() {
		System.out.println("Disciplina: " + nome);
		System.out.println("Codigo: " + codigo);
		System.out.println("Carga Horária: " + cargaHoraria);
	}
}
