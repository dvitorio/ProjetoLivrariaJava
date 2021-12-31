package br.com.daniel.livraria.produtos;

import livraria.Autor;

public class Livro {
	
	private String nome;
	private String descricao;
	private double valor;
	private double valorDescontado;
	private String isbn;
	private Autor autor;
	private boolean impresso;
    
	//Construtor com autor obrigatorio
	public Livro(Autor autor) {
		this.autor = autor;
		this.isbn = "000-00-00000-00-0";
		this.impresso = true;	
	}
	
	//Construtor com parâmetros
	public Livro(String nome, String descricao, double valor, double valorDescontado, String isbn, Autor autor) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.valorDescontado = valorDescontado;
		this.isbn = isbn;
		this.autor = autor;
		this.impresso = true;
	}

	public Livro() {
		
	}

	//Getters e Setters
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

	public double getValorDescontado() {
		return valorDescontado;
	}

	public void setValorDescontado(double valorDescontado) {
		this.valorDescontado = valorDescontado;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	public boolean isImpresso() {
		return impresso;
	}

	public void setImpresso(boolean impresso) {
		this.impresso = impresso;
	}

	
	//Verifica se o livro tem um autor cadastrado
	boolean temAutor() {
		return this.autor != null;
	}
	
	//Aplica uma taxa de desconto ao livro 
    public boolean aplicarDesconto(double porcentagem) {
    	if(porcentagem > 0.15) {
    		return false;
    	}
    	else {
    		double desconto = this.getValor() * porcentagem; //definição de variável local e aplicação de desconto
    		this.setValor(this.getValor() - desconto); //aplicando o deconto e obtendo o valor descontado
    		return true;
    	}
    }
    
    //Mostra os detalhes do livro cadastrado
    public void mostrarDetalhesLivro() {
		System.out.println("========================================= Informações do livro ===================================");
		System.out.println("Título: " + nome);
		System.out.println("Descrição: " + descricao);
		System.out.println("ISBN: " + isbn);
		System.out.println("Valor integral: R$ " + valor);
		System.out.println("Valor descontado: R$ " + valorDescontado);
		
		if(this.temAutor()) {
			autor.mostrarDetalhesAutor();
		}
	}
}


