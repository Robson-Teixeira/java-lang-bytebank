package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteConta {
	
	// java.lang - package importado de forma implícita em todas as classes
	public static void main(String[] args) throws SaldoInsuficienteException {

		ContaCorrente contaCorrente = new ContaCorrente(1123, 1337);
		contaCorrente.deposita(100.00);

		ContaPoupanca contaPoupanca = new ContaPoupanca(1123, 1338);
		contaPoupanca.deposita(200.00);

		contaCorrente.transfere(10.0, contaPoupanca);

		System.out.println("Conta Corrente - Saldo: " + contaCorrente.getSaldo());
		System.out.println("Conta Poupança - Saldo: " + contaPoupanca.getSaldo());

	}
}
