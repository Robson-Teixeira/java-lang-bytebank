package br.com.bytebank.banco.modelo;

/**
 * Objeto de valor com os dados do calculador de imposto no Bytebank.
 * 
 * @author Robson Teixeira
 * @version 0.1
 */
public class CalculadorDeImposto {

	private double totalImposto;

	public double getTotalImposto() {
		return this.totalImposto;
	}

	public void registra(Tributavel tributavel) {
		this.totalImposto += tributavel.getValorImposto();
	}

}
