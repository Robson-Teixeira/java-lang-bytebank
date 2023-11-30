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

		char char1 = 'A';
		char char2 = 'a';
		nome = nome.replace(char1, char2);
		System.out.println("Replace char: " + nome);

		System.out.println("CharAt: " + nome.charAt(2));

		System.out.println("IndexOf: " + nome.indexOf("UR"));

		System.out.println("Substring: " + nome.substring(1));

		System.out.println("Substring - begin & end: " + nome.substring(1, 3));

		System.out.println("Length: " + nome.length());

		for (int i = 0; i < nome.length(); i++)
			System.out.println("CharAt: " + nome.charAt(i));

		System.out.println("IsEmpty: " + nome.isEmpty());

		nome += " ";
		System.out.println("Trim: " + nome.trim());

		System.out.println("Contains: " + nome.contains("aLU"));

		String frase = "Java e java.lang: programe com a classe Object e String";
		String[] split = frase.split(" ");

		for (int i = 0; i < split.length; i++)
			System.out.println("Split: " + split[i]);

		split = frase.split(" ", 4);

		for (int i = 0; i < split.length; i++)
			System.out.println("Split - limit: " + split[i]);

	}

}
