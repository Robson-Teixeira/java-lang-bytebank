package teste;

public class TesteTributaveis {

	public static void main(String[] args) {

		modelo.ContaCorrente contaCorrente = new modelo.ContaCorrente(1123, 1337);
		contaCorrente.deposita(100.00);

		modelo.SeguroDeVida seguroDeVida = new modelo.SeguroDeVida();

		modelo.CalculadorDeImposto calculadorDeImposto = new modelo.CalculadorDeImposto();
		calculadorDeImposto.registra(contaCorrente);
		calculadorDeImposto.registra(seguroDeVida);

		System.out.println("Total de impostos: " + calculadorDeImposto.getTotalImposto());

	}

}
