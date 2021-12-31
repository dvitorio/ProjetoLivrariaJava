package livraria;

public class Autor {

	private String nome;
	private String email;
	private String cpf;
	
	//Costrutor padrão
	public Autor() {

	}
	
	//Construtor com parâmetros
	public Autor(String nome, String email, String cpf) {
		super();
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}
	

	//Getters e setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public void mostrarDetalhesAutor() {
		System.out.println("========================================= Informações do autor ===================================");
		System.out.println("Nome do autor: " + getNome());
		System.out.println("Email: " + getEmail());
		System.out.println("CPF: " + getCpf());

	}
	
}
