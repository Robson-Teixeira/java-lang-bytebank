package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteTributaveis {

	public static void main(String[] args) {

		ContaCorrente contaCorrente = new ContaCorrente(1123, 1337);
		contaCorrente.deposita(100.00);

		SeguroDeVida seguroDeVida = new SeguroDeVida();

		CalculadorDeImposto calculadorDeImposto = new CalculadorDeImposto();
		calculadorDeImposto.registra(contaCorrente);
		calculadorDeImposto.registra(seguroDeVida);

		System.out.println("Total de impostos: " + calculadorDeImposto.getTotalImposto());

	}

}
