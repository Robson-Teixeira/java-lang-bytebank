package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteSaca {

	public static void main(String[] args) {

		Conta contaCorrente = new ContaCorrente(1123, 1337);

		contaCorrente.deposita(200.0);

		try {
			contaCorrente.saca(210.0);
		} 
		catch (SaldoInsuficienteException ex) {
			System.out.println("Exceção - " + 
					ex.getClass().getSimpleName() + ": " + 
					ex.getMessage());
		}

		System.out.println("Conta Corrente - Saldo: " + contaCorrente.getSaldo());

	}

}
