
public class TesteTurma {

	public static void main(String[] args) {
		/*
		Estudante estudante = new Estudante(1828590, "Derrick", 'M');
		Estudante estagiario = new Estudante(1859870, "Andre", 'M');
		Estudante monitor = new Estudante(1866309, "Carol", 'F');
		Turma si = new Turma("Sistemas de Informação", 0);
		si.estudantes[0] = estudante;
		si.estudantes[1] = estagiario;
		si.estudantes[2] = monitor;
		
		si.listar();
		si.pesquisar(1828590);
		si.trancar(estagiario);
		si.trancar(1866309);
		
		si.pesquisar(1828590);
		*/
		
		Estudante estudante = new Estudante(1828590, "Derrick", 'M');
		Estudante estagiario = new Estudante(1859870, "Andre", 'M');
		Estudante monitor = new Estudante(1866309, "Carol", 'F');
		TurmaArrayList si = new TurmaArrayList("Sistemas de Informação", 0);
		si.myList.add(estudante);
		si.myList.add(estagiario);
		si.myList.add(monitor);
		
		si.listar();
		System.out.println("Nova Pesquisa");
		si.pesquisar(1828590);
		
		si.trancar(estagiario);
		si.trancar(1866309);
		
		System.out.println("Nova Pesquisa");
		si.listar();
		
	}

}
