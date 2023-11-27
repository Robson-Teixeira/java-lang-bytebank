package br.com.bytebank.banco.modelo;

// Classe abstrata não pode ser instanciada
public abstract class Conta {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente cliente;
	private static int total;

	public Conta(int agencia, int numero) {
		
		if (agencia < 1)
			throw new IllegalArgumentException("Agência da conta inválida");

		if (numero < 1)
			throw new IllegalArgumentException("Número da conta inválido");
		
		this.agencia = agencia;
		this.numero = numero;
		Conta.total++;
	}

	public Conta(int numero) {
		this(1123, numero); // Invoca o construtor que recebe int e int
	}

	// Método abstrato não pode ter implementação
	public abstract void deposita(double valor);

	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor)
			throw new SaldoInsuficienteException(
					"Saldo atual: " + this.saldo + 
					" | Valor solicitado: " + valor);

		this.saldo -= valor;
	}

	public void transfere(double valor, Conta contaDestino) throws SaldoInsuficienteException {
		this.saca(valor);
		contaDestino.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Agência não pode ser menor ou igual a 0!");
			return;
		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Número não pode ser menor ou igual a 0!");
			return;
		}
		this.numero = numero;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public static int getTotal() {
		return Conta.total;
	}
}
