package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {

		System.out.println("TesteObject");
		System.out.println(2023);
		System.out.println(true);

		ContaCorrente contaCorrente = new ContaCorrente(1123, 1337);
		Object contaPoupanca = new ContaPoupanca(1123, 1338);
		Object cliente = new Cliente();

		System.out.println(contaCorrente);
		System.out.println(contaPoupanca);
		System.out.println(cliente);

	}

}
