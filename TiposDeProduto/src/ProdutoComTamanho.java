
public class ProdutoComTamanho extends Produto{

	private String tamanho;
	
	
	public String getTamanho() {
		return tamanho;
	}

	public ProdutoComTamanho(String nome, int codigo, double preco, String tamanho) {
		super(nome, codigo, preco);
		this.tamanho = tamanho;
	}
	
	public ProdutoComTamanho(String nome, int codigo, double preco) {
		super(nome, codigo, preco);
	}
	
	@Override
	public boolean equals(Produto obj) {
		ProdutoComTamanho other = (ProdutoComTamanho) obj;
		if (other.getTamanho() == null)  
			return super.equals(obj);
		if (getCodigo() == other.getCodigo() && this.getTamanho() != other.getTamanho()) 
			return false;
		if (getCodigo() == other.getCodigo()) {
			if (this.getTamanho() == other.getTamanho())
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}
