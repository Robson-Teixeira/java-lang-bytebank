package br.com.bytebank.banco.modelo;

/**
 * Objeto de valor com os dados da conta no Bytebank.
 * 
 * @author Robson Teixeira
 * @version 0.1
 */
// Classe abstrata não pode ser instanciada
public abstract class Conta {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente cliente;
	private static int total;

	/**
	 * Construtor para inicializar o objeto Conta a partir da agência e número da conta.
	 * 
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero) {
		
		if (agencia < 1)
			throw new IllegalArgumentException("Agência da conta inválida");

		if (numero < 1)
			throw new IllegalArgumentException("Número da conta inválido");
		
		this.agencia = agencia;
		this.numero = numero;
		Conta.total++;
	}

	/**
	 * Construtor para inicializar o objeto Conta a partir do número da conta.
	 * 
	 * @param numero
	 */	
	public Conta(int numero) {
		this(1123, numero); // Invoca o construtor que recebe int e int
	}

	/**
	 * Abstração para deposito em conta a partir do valor a ser depositado.
	 * 
	 * @param valor
	 */
	// Método abstrato não pode ter implementação
	public abstract void deposita(double valor);

	/**
	 * Realiza saque na conta desde que o valor seja inferior ao saldo.
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor)
			throw new SaldoInsuficienteException(
					"Saldo atual: " + this.saldo + 
					" | Valor solicitado: " + valor);

		this.saldo -= valor;
	}

	/**
	 * Realiza transferência a partir do valor e uma conta de destino 
	 * desde que o valor possa ser sacado da conta de origem.
	 * 
	 * @param valor
	 * @param contaDestino
	 * @throws SaldoInsuficienteException
	 */
	public void transfere(double valor, Conta contaDestino) throws SaldoInsuficienteException {
		this.saca(valor);
		contaDestino.deposita(valor);
	}

	/**
	 * Obtêm saldo da conta.
	 * 
	 * @return o saldo da conta
	 */
	public double getSaldo() {
		return this.saldo;
	}

	/**
	 * Obtém agência da conta.
	 * 
	 * @return a agência da conta
	 */
	public int getAgencia() {
		return this.agencia;
	}

	/**
	 * Define agência da conta.
	 * 
	 * @param agencia
	 */
	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Agência não pode ser menor ou igual a 0!");
			return;
		}
		this.agencia = agencia;
	}

	/**
	 * Obtém número da conta.
	 * 
	 * @return o número da conta
	 */
	public int getNumero() {
		return this.numero;
	}

	/**
	 * Define o número da conta.
	 * 
	 * @param numero
	 */
	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Número não pode ser menor ou igual a 0!");
			return;
		}
		this.numero = numero;
	}

	/**
	 * Obtém o cliente da conta.
	 * 
	 * @return o cliente da conta
	 */
	public Cliente getCliente() {
		return this.cliente;
	}

	/**
	 * Define o cliente da conta.
	 * 
	 * @param cliente
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * Obtém o total de contas criadas.
	 * 
	 * @return o total de contas criadas
	 */
	public static int getTotal() {
		return Conta.total;
	}
}
