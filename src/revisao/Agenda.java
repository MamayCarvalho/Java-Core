package revisao;

public class Agenda {
	
	// Se tiver set e get, chamamos as linhas abaixo de Atributos de Classe. Senão, são chamadas de Variáveis de Classe.
	private String nome;
	private String telefone;
	private String email;
	private String endereco;
	

	// Inicializar os atributos (construtor)
	public Agenda() {
	}
	
	public Agenda(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void addEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void addEndereco(String endereco) {
		this.endereco = endereco;
	}
}
