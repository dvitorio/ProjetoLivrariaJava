package br.com.daniel.livraria.produtos;

import livraria.Autor;

public class LivroFisico extends Livro{
	public LivroFisico(Autor autor) {
		super(autor);
	}
	
	public double getTaxaImpressao() {
		return this.getValor() * 0.05;
	}
}
