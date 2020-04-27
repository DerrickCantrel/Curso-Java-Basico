
import java.util.ArrayList;
import java.util.HashMap;

//TAREFA: Qual o preço da pizza?
public class Pizza {
	public int preco;
	public int qtdIngredientes;
	public ArrayList<String> ingrediente = new ArrayList<>();;
	public static HashMap<String, Integer> ingredientes = new HashMap<>();

	public Pizza() {
		this.qtdIngredientes = 0;
	}
	
	public void adicionarIngrediente(String ingr) {
		ingrediente.add(ingr);
		contabilizarIngredientes(ingr);
		getQtdIngredientes();
	}
	
	public int getQtdIngredientes() {
		return this.qtdIngredientes++;
	}
	
	public int getPreco() {
		if(this.qtdIngredientes <= 2){
            this.preco = 15;
        } else if(this.qtdIngredientes <= 5){
            this.preco = 20;
        } else this.preco = 23;

        return this.preco;
    }
	
	public static void contabilizarIngredientes(String ingr) {
		boolean existe = false;
        for(String key : ingredientes.keySet()){
            if(key.equals(ingr)){
                existe = true;
                int novoTotal = ingredientes.get(ingr) + 1;
                ingredientes.put(ingr, novoTotal);
                break;
            }
        }

        if(!existe) ingredientes.put(ingr, 1);
	}
	
	public static void imprimirIngredientes() {
		for(String key : ingredientes.keySet()){
            System.out.println(key + " : " + ingredientes.get(key));
        }
	}
	
}
