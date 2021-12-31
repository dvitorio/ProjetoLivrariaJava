package principal;

public class CarrinhoDeCompras {
	
	private double total;
	
	
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
