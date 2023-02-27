package sistemaContaBancaria.entities;

public class Banco {
	
	private Usuario usuario;
	
	private Integer numeroConta;
	private Double balance; 
	private Double limiteSaque;
	
	public Banco() {	
	}

	public Banco(Usuario usuario, Integer numeroConta, Double balance, Double limiteSaque) {
		super();
		this.usuario = usuario;
		this.numeroConta = numeroConta;
		this.balance = balance;
		this.limiteSaque = balance + 2000.00;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Double getSaldo() {
		return balance;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}


	public void depositAmount(Double amount) {
		this.balance += amount;
	}
	public void withdrawAmount(Double amount) {
				this.balance -= amount;
	}

	@Override
	public String toString() {
		return "Titular: " + this.usuario.getName() + "\n" +
				"Número conta: " + this.numeroConta + "\n" + 
				"Saldo: " + this.balance;
				
				
	}
	
	
	
}
