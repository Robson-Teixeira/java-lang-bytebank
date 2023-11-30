package br.com.bytebank.banco.teste;

public class TesteStringBuilder {

	public static void main(String[] args) {

		// String e StringBuilder herdam de CharSequence, logo, alguns métodos são compartilhados

		// Método não performático
		/*
		String texto = "Socorram";
		texto = texto.concat("-");
		texto = texto.concat("me");
		texto = texto.concat(", ");
		texto = texto.concat("subi ");
		texto = texto.concat("no ");
		texto = texto.concat("ônibus ");
		texto = texto.concat("em ");
		texto = texto.concat("Marrocos");
		
		System.out.println(texto);
		*/

		StringBuilder builder = new StringBuilder("Socorram");
		builder.append("-");
		builder.append("me");
		builder.append(", ");
		builder.append("subi ");
		builder.append("no ");
		builder.append("ônibus ");
		builder.append("em ");
		builder.append("Marrocos");

		System.out.println(builder);

	}

}
