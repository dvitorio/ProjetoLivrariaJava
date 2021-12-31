package principal;

public class RegrasDeDesconto {

	public static void main(String[] args) {
		
		Livro livro = new Livro();
		livro.setValor(59.90);
		
		System.out.println("Valor atual: " + livro.getValor());
		
		if(!livro.aplicarDesconto(0.1)) {
			System.out.println("Desconto não pode ser maior que 30%!");
		}
		else {
			System.out.println("Valor com desconto: " + livro.getValorDescontado());
		}

	}

}
