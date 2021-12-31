package br.com.daniel.livraria.produtos;

import livraria.Autor;

public class Ebook extends Livro {
	
	private String waterMark;
	private double valor;
	
	public Ebook(Autor autor) {
		super(autor);
	}
	
	public Ebook() {
		
	}
	
	
	public Ebook(Autor autor, String waterMark) {
		super(autor);
		this.waterMark = waterMark;
	}

	//Getters e setters
	public String getWaterMark() {
		return waterMark;
	}
	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	//Método aplicar desconto
	public boolean aplicarDesconto(double porcentagem) {
    	if(porcentagem > 0.15) {
    		return false;
    	}
    	else {
    		this.valor -= this.getValor() * porcentagem;
    		return true;
    	}
	}
}
