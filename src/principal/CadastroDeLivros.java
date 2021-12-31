package principal;

public class CadastroDeLivros {

	public static void main(String[] args) {
		
		Autor autor1 = new Autor();
		autor1.setNome("Eduardo Galeano");
		autor1.setEmail("eduardo_galeano@bol.com");
		autor1.setCpf("170.541.851-00");
		
		Livro livro1 = new Livro();
		livro1.setNome("As Veias Abertas da América Latina");
		livro1.setDescricao("Uma história da exploração do continente sul-americano pelos europeus durante 400 anos");
		livro1.setIsbn("GB8500254-BR");
		livro1.setValor(60.85);
		livro1.setAutor(autor1);
		autor1.mostrarDetalhesAutor();
		livro1.aplicarDesconto(0.1);
		livro1.mostrarDetalhesLivro();
		
		Autor autor2 = new Autor();
		autor2.setNome("Adam Smith");
		autor2.setEmail("asmith@yahoo.com.br");
		autor2.setCpf("801.141.111-22");
		
		Livro livro2 = new Livro();
		livro2.setNome("A Riqueza das Nações");
		livro2.setDescricao("Clássico da literatura econômica do século XVIII");
		livro2.setIsbn("AS17760001-BR");
		livro2.setValor(110.20);
		livro2.setAutor(autor2);
		autor2.mostrarDetalhesAutor();
		livro2.aplicarDesconto(0.1);
		livro2.mostrarDetalhesLivro();
		
		Ebook ebook1 = new Ebook();
		ebook1.setNome("Paulo Turini");
		
	}

}
