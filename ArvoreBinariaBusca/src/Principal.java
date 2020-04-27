
public class Principal {

	public static void main(String[] args) {
		
		Arvore arvore= new Arvore(10);
		Arvore.montarArvore(arvore, null);
		
		Arvore n5 = new Arvore(5);
		Arvore.montarArvore(n5, arvore);

		Arvore n20 = new Arvore(20);
		Arvore.montarArvore(n20, arvore);
		
		Arvore n33 = new Arvore(33);
		Arvore.montarArvore(n33, arvore);
		
		Arvore n1 = new Arvore(1);
		Arvore.montarArvore(n1, arvore);
		
		Arvore n2 = new Arvore(2);
		Arvore.montarArvore(n2, arvore);
		
		Arvore n7 = new Arvore(7);
		Arvore.montarArvore(n7, arvore);
		
		Arvore n30 = new Arvore(30);
		Arvore.montarArvore(n30, arvore);
		
		System.out.println("Pre-ordem");
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
