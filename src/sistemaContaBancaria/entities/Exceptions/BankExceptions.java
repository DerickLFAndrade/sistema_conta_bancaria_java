package sistemaContaBancaria.entities.Exceptions;

public class BankExceptions extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public BankExceptions(String msg) {
		super(msg);
	}
}
