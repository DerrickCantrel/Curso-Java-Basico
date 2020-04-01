
public class TesteDisciplina {

	public static void main(String[] args) {
		Estudante e1 = new Estudante("Maria", 'F');
		Disciplina d = new Disciplina();
		d.estudantes[0] = e1;
		d.nome = "Programação Orientada a Objetos";
		d.codigo = "171011680";
		d.cargaHoraria = 80; 
		d.listar();
	}

}
