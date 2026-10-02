package funcoes;

import java.util.Scanner;

public class OrganizandoEntradaDeDados {

	public static String lerNome(Scanner sc) {

		System.out.println("Insira o seu nome: ");

		return sc.nextLine();

	}

	public static String lerCidade(Scanner sc) {
		System.out.println("Insira a sua cidade: ");

		return sc.nextLine();
	}

	public static int lerIdade(Scanner sc) {

		System.out.println("Insira a sua idade: ");

		int idade = sc.nextInt();

		sc.nextLine();

		return idade;
	}

	public static void mostrarResumo(String nome, int idade, String cidade) {
		System.out.print("Olá " + nome + " sua idade é " + idade + " você é de " + cidade);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nome = lerNome(sc);

		int idade = lerIdade(sc);

		String cidade = lerCidade(sc);

		mostrarResumo(nome, idade, cidade);

		sc.close();

	}

}
