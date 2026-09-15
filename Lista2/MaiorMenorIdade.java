package lista1_POO;

import java.util.Scanner;

public class MaiorMenorIdade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String continuar = "";

		do {
			System.out.println("Insira a sua idade: ");

			int idade = sc.nextInt();
			sc.nextLine();

			if (idade >= 18) {
				System.out.println("Maior de Idade");
			} else {
				System.out.println("Menor de idade");
			}

			System.out.println("Você quer executar o código novamente? (S/N): ");
			continuar = sc.nextLine();

			while (!continuar.equalsIgnoreCase("S") && !continuar.equalsIgnoreCase("N")) {
				System.out.println("Opção inválida, digite novamente (S/N): ");
				continuar = sc.nextLine();
			}

		} while (continuar.equalsIgnoreCase("S"));

		System.out.println("Programa encerrado.");
		sc.close();

	}

}
