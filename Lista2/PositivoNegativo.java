package lista1_POO;

import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String continuar = "";

		do {
			System.out.println("Insira um numero: ");

			int numero = sc.nextInt();
			sc.nextLine();

			if (numero > 0) {
				System.out.println("O numero " + numero + " é positivo");
			} else if (numero < 0) {
				System.out.println("O numero " + numero + " é negativo");
			} else {
				System.out.println("Numero = 0");
			}

			System.out.println("Você quer executar o código novamente? (S/N) ");
			continuar = sc.nextLine();

			while (!continuar.equalsIgnoreCase("S") && !continuar.equalsIgnoreCase("N")) {
				System.out.println("Opção inválida, digite novamente (S OU N): ");
				continuar = sc.nextLine();
			}

		} while (continuar.equalsIgnoreCase("s"));
		System.out.println("Programa encerrado.");
		sc.close();

	}

}
