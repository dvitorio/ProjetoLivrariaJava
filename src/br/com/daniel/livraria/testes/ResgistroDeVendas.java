package br.com.daniel.livraria.testes;

import br.com.daniel.livraria.CarrinhoDeCompras;
import br.com.daniel.livraria.produtos.Ebook;
import br.com.daniel.livraria.produtos.LivroFisico;
import livraria.Autor;

public class ResgistroDeVendas {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Maurício Aniche");
		
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("Test-Driven Development");
		fisico.setValor(59.90);
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Test-Driven Development");
		ebook.setValor(29.90);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(fisico);
		carrinho.adiciona(ebook);
		
		System.out.println("Total: R$ " + carrinho.getTotal());
		
	}

}
