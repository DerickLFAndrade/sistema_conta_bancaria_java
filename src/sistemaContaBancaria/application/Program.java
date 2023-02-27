package sistemaContaBancaria.application;

import java.util.Locale;
import java.util.Scanner;

import sistemaContaBancaria.entities.Banco;
import sistemaContaBancaria.entities.Usuario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Usuario u1 = new Usuario("João", "joao@gmail.com", "Rua 0, n° 15 - Brasília", "1254987465", 37);
		Banco banco = new Banco(u1, 12332144, 10000.00, 20000.00);
		System.out.println("Digite um valor para depósito: ");
		
		Double depositAmount = sc.nextDouble();
		
		banco.depositAmount(depositAmount);
		
		System.out.println(banco);
		
		
		System.out.println("Digite um valor para depósito: ");
		
		Double withdrawAmount = sc.nextDouble();
		
		if(withdrawAmount < banco.getLimiteSaque()) {			
			banco.withdrawAmount(withdrawAmount);
		} else {
			System.out.println("The amount must be smaller that balance!");
		}
		
		System.out.println(banco);
		
		sc.close();

	}

}
