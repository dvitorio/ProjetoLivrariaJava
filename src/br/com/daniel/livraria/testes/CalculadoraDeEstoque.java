package br.com.daniel.livraria.testes;

public class CalculadoraDeEstoque {

	public static void main(String[] args) {
		
		double livroJava8 = 59.90;
		double livroTDD = 59.90;
		
		double soma = livroJava8 + livroTDD;
		
		if(soma <= 150) {
			System.out.println("Valor total em estoque: R$ " + soma + " Estoque muito baixo!");
		}
		else if(soma >= 2000) {
			System.out.println("Valor total em estoque: R$ " + soma + " Estoque muito alto!");
		}
		else {
			System.out.println("Valor total em estoque: R$ " + soma + " Estoque em n�veis normais!");
		}

	}
	
	
	
}
