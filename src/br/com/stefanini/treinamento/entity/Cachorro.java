package br.com.stefanini.treinamento.entity;

public class Cachorro {
	
	private String nome;
	private Integer idade;
	
	public Cachorro(String nome) {
		this.setNome(nome);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	

}
