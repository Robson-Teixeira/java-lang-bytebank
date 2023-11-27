package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.modelo.Conta;

/**
 * Objeto de valor com os dados da conta especial no Bytebank.
 * 
 * @author Robson Teixeira
 * @version 0.1
 */
public class ContaEspecial extends Conta {

	/**
	 * Construtor para inicializar o objeto Conta Especial a partir do número da conta
	 * 
	 * @param numero
	 */
	public ContaEspecial(int numero) {
		super(numero);
	}

	/**
	 * Definição para deposito em conta a partir do valor a ser depositado
	 * 
	 * @param valor
	 */	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
		// private (visível apenas na classe)
		// <<package private>> (visível na classe E em qualquer outro membro do mesmo pacote, podendo ser chamado de default)
		// protected (visível na classe E em qualquer outro membro do mesmo pacote E para qualquer filho)
		// public (visível em qualquer pacote)
		
	}

}
