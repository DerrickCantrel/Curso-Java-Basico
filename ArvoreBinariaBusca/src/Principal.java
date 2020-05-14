
public class Principal {

	public static void main(String[] args) {
	//Arvore vazia, � instanciada a partir da primeira inser��o (No Raiz)
		Arvore arvore= new Arvore(60);
		Arvore.InserirNo(arvore, null);
		
		//Inserindo os demais n�s que formar�o as sub-arvores
		Arvore n1 = new Arvore(200);
		Arvore.InserirNo(n1, arvore);

		Arvore n2 = new Arvore(80);
		Arvore.InserirNo(n2, arvore);
		
		Arvore n3 = new Arvore(65);
		Arvore.InserirNo(n3, arvore);
		
		Arvore n4 = new Arvore(70);
		Arvore.InserirNo(n4, arvore);
		
		Arvore n5 = new Arvore(50);
		Arvore.InserirNo(n5, arvore);
		
		Arvore n6 = new Arvore(117);
		Arvore.InserirNo(n6, arvore);
		
		Arvore n7 = new Arvore(30);
		Arvore.InserirNo(n7, arvore);
		
		//Removendo dois n�s
		Arvore.removerNo(arvore, 65);
		Arvore.removerNo(arvore, 200);
		
		//Imprimindo os valores da arvore
		System.out.println("Pre-ordem");
		Arvore.imprimirPreOrdem(arvore);
		System.out.println(" ");
		
		//Realizando a busca em um n� que j� foi removido e um existente.
		System.out.println(Arvore.BuscarNo(arvore, 200)); //Deve ser False;
		System.out.println(Arvore.BuscarNo(arvore, 70)); //Deve ser true;
		
		/*			ESQUEMA DA �RVORE
		 *  
		 * 				 60
		 * 			   /    \
		 *           50     80
		 *          /      /  \
		 *         30    70   117
		 *       
		 */
		
	}

}
