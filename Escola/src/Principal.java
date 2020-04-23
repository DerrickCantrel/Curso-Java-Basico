
public class Principal {

	public static void main(String[] args) {
		
		Aluno derrick = new Aluno();
		derrick.bim1 = 70;
		derrick.bim2 = 60;
		derrick.bim3 = 80;
		derrick.bim4 = 90;
		
		System.out.println(derrick.media());
		System.out.println(derrick.passouDeAno());
		
		System.out.println(VerificadoraNotas.mediaAluno(derrick));
		System.out.println(VerificadoraNotas.passouDeAno(derrick));
	}

}
