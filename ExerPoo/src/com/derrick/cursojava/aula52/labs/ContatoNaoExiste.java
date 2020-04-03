package com.derrick.cursojava.aula52.labs;

public class ContatoNaoExiste extends Exception{
	private String nomeContato;
	
	public ContatoNaoExiste(String nomeContato) {
		this.nomeContato = nomeContato;
	}
	
	@Override
	public String getMessage() {
		return "Contato " + nomeContato + " não existe na agenda";
	}	
}
