package br.com.daniel.livraria.produtos;

import livraria.Editora;

public class Revista implements Produto {
	
	private String nome;
	private String descricao;
	private double valor;
	private Editora editora;
	
	//Construtor padrão
	public Revista() {
		
	}
	
	//Construtor com argumentos
	public Revista(String nome, String descricao, double valor, Editora editora) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.editora = editora;
	}


	//Getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Editora getEditora() {
		return editora;
	}
	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	
}
