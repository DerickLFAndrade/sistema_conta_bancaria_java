package sistemaContaBancaria.application;

import sistemaContaBancaria.entities.Usuario;

public class Program {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario("João", "joao@gmail.com", "Rua 0, n° 15 - Brasília", "1254987465", 37);
		System.out.println(u1);

	}

}
