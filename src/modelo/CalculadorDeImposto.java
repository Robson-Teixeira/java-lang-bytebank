package modelo;

public class CalculadorDeImposto {

	private double totalImposto;

	public double getTotalImposto() {
		return this.totalImposto;
	}

	public void registra(Tributavel tributavel) {
		this.totalImposto += tributavel.getValorImposto();
	}

}
