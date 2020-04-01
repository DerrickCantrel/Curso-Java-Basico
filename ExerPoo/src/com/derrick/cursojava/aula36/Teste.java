package com.derrick.cursojava.aula36;

public class Teste {

	public static void main(String[] args) {
	
		Contato contato = new Contato();
		
		contato.setNome("Derrick");
		//contato.setEndereco("Nárnia");
		//contato.setTelefone("11 4002-8922");
		
		//criar o objeto endereco
		
		Endereco end = new Endereco();
		end.setNomeRua("Rua JJ Dourado");
		end.setNumero("111");
		end.setComplemento("Próximo a Nárnia");
		end.setCidade("Beberibe");
		end.setEstado("Ceará");
		
		//RELACIONAMENTO 1 para 1 ENTRE (Contato e Endereco)
		contato.setEndereco(end);
		
		//Criar o objeto - Relacionamento tem-um telefone
		Telefone telefone = new Telefone();
		telefone.setTipo("Fixo");
		telefone.setDdd("011");
		telefone.setNumero("4002-8922");
		
		Telefone telefone2 = new Telefone();
		telefone2.setTipo("Casa");
		telefone2.setDdd("085");
		telefone2.setNumero("99847-1409");
		
		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;
		
		//RELACIONAMENTO 1 para 1 ENTRE (Contato e Telefone)
		//contato.setTelefone(telefone);
		contato.setTelefones(telefones);
		
		//Saída do Console
		System.out.println(contato.getNome());
		//System.out.println(contato.getTelefone());
	
		//Deixando o código mais seguro
		if (contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getComplemento());
		}
		
		/*if (contato != null && contato.getTelefone() != null) {
			System.out.println(contato.getTelefone().getNumero());
		}*/
		
		if (contato != null && contato.getTelefones() != null) {
			for (Telefone t : contato.getTelefones()) {
				System.out.println(t.getDdd() + " " + t.getNumero());
			}
		}
	}
}
