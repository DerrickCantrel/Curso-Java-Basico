public class Carro {
	private String modelo;
	private String placa;
	private int ano;
	private double valor;
	
	public void setModelo(String modelo) {
		if (modelo != null) {
			this.modelo = modelo;
		}
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setPlaca(String placa) {
		if (placa != null) {
			this.placa = placa;
		}
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setAno(int ano) {
		if (ano != 0) {
			this.ano = ano;
		}
	}

	public int getAno() {
		return ano;
	}
	
	public void setValor(double valor) {
		if (valor != 0) {
			this.valor = valor;
		}
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setAplicarDesconto(double percentual) {
		valor = valor - (valor * (percentual / 100));
		System.out.println("Com o desconto: " + valor);
	}
	
	void listar() {
		System.out.println("Modelo: " + modelo);
		System.out.println("Placa: " + placa);
		System.out.println("Ano: " + ano);
		System.out.println("Valor: " + valor);
	}
	
	public Carro() {
		
	}
	
	public Carro(String modelo, String placa) {
		this.modelo = modelo;
		this.placa = placa;
	}
	
	public Carro(String modelo, String placa, int ano, int valor) {
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
		this.valor = valor;
	}
}
