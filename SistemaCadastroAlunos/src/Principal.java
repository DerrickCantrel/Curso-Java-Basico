
public class Principal {

	public static void main(String[] args) {
		
		//Primeiro Aluno que inicia a estrutura
		Arvore arvore= new Arvore(10, 7.5);
		Arvore.montarArvore(arvore, null);
		
		Arvore aluno2 = new Arvore(5, 8.5);
		Arvore.montarArvore(aluno2, arvore);

		Arvore aluno3 = new Arvore(20, 6.5);
		Arvore.montarArvore(aluno3, arvore);
		
		Arvore aluno4 = new Arvore(33, 8.8);
		Arvore.montarArvore(aluno4, arvore);
		
		Arvore aluno5 = new Arvore(1, 8.9);
		Arvore.montarArvore(aluno5, arvore);
		
		Arvore aluno6 = new Arvore(2, 10);
		Arvore.montarArvore(aluno6, arvore);
		
		Arvore aluno7 = new Arvore(7, 9.1);
		Arvore.montarArvore(aluno7, arvore);
		
		Arvore aluno8 = new Arvore(30, 7.2);
		Arvore.montarArvore(aluno8, arvore);
		
		System.out.println("Matricula com respectivas notas");
		Arvore.imprimirPreOrdem(arvore);
		System.out.println(" ");
		
		/*
		 * 				10
		 * 			  /   \
		 *           5     20
		 *          / \     \
		 *         1   7    33
		 *        /         /
		 *       2         30
		 */
		
	}

}
