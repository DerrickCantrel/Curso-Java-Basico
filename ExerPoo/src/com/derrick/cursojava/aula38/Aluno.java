package com.derrick.cursojava.aula38;

public class Aluno extends Pessoa {
	private String curso;
	private double[] notas;
	
	public Aluno() {
		super(); //Chama o construtor da super classe.
	}
	
	//Acessando aos atributos da super classe
	public Aluno(String nome, String endereco, String telefone, String curso) {
		super(nome, endereco, telefone);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	public int calcularMedia() {
		return 0;
	}
	
	public boolean verificarAprovado() {
		return true;
	}
	
	public void metodoQualquer() {
		super.setCpf("2235442");
		
		this.setCpf("35643243");
	}
}
