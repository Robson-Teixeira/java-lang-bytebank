package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {

		// String nome = new String("Alura"); // Má prática
		String nome = "Alura"; // objeto literal (simplificação)
		System.out.println("Variável: " + nome);

		// nome.replace("A", "a"); // variável não sofre alteração
		nome = nome.replace("A", "a");
		System.out.println("Replace: " + nome);

		nome = nome.toLowerCase();
		System.out.println("ToLowerCase: " + nome);

		nome = nome.toUpperCase();
		System.out.println("ToUpperCase: " + nome);

	}

}
