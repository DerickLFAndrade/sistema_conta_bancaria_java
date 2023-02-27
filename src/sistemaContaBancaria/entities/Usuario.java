package sistemaContaBancaria.entities;

public class Usuario {
	private String name;
	private String email;
	private String endereco;
	private String cpf;
	private Integer idade;
	
	public Usuario (){
	}

	public Usuario(String name, String email, String endereco, String cpf, Integer idade) {
		super();
		this.name = name;
		this.email = email;
		this.endereco = endereco;
		this.cpf = cpf;
		this.idade = idade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}


	@Override
	public String toString() {
		return "Usuario [name=" + name + ", email=" + email + ", endereco=" + endereco + ", cpf=" + cpf + ", idade="
				+ idade + "]";
	}
	
	
}
