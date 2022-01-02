package br.com.daniel.livraria;

import br.com.daniel.livraria.produtos.Livro;
import br.com.daniel.livraria.produtos.Produto;

public class CarrinhoDeCompras {
	
	private double total;
	private Produto[] produtos = new Produto[10];
	
	
	//Getters e Setters
	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}


	public void adiciona(Livro livro) {
		System.out.println("Adicionando: " + livro);
		livro.aplicarDesconto(0.05);
		total += livro.getValor(); 
	}
	
}
