
public class TesteEstudante {

	public static void main(String[] args) {
		Estudante Aluno = new Estudante();
		Aluno.setMatricula(2004001);
		Aluno.setNome("Maria Silva");
		Aluno.setSexo('f');
		Aluno.setNota(1, 7.0);
		Aluno.setNota(2, 8.2);
		Aluno.setNota(3, 6.0);
		Aluno.setNota(4, 5.5);
		Aluno.exibir("Dados do Aluno");
		//Aluno.setNota(2);
		
		
		/*Questão 4
		Estudante Joao = new Estudante();
		Estudante Pedro = new Estudante("Pedro Henrique", 'M');
		Estudante Rafael = new Estudante(2004002, "Rafael Andrade", 'M');
		Joao.setNota(1, 7.0);
		Pedro.setNota(2, 5.0);
		Rafael.setNota(2);
		Rafael.setNota(3, 8.5);
		Rafael.getExibir();
		Pedro.getExibir("Dados do Aluno");
		Joao.getExibir("Dados do Aluno");
		*/
	}
}
