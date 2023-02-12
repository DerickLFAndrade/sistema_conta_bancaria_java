package sistemaContaBancaria.entities;

public class Banco {
	
	private Usuario usuario;
	private Long numeroConta;
	private Double saldo; 
	private Double limiteSaque;
	
	public Banco() {
		
	}

	public Banco(Usuario usuario, Long numeroConta, Double saldo, Double limiteSaque) {
		super();
		this.usuario = usuario;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Long getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Long numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}


	
	
}
