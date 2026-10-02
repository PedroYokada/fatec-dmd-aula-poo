package funcoes;

import java.util.Scanner;

public class CalculadoraOrganizada {

	public static void mostrarMenu() {

		System.out.println();
		System.out.println("+----------------------------+");
		System.out.println("|         CALCULADORA        |");
		System.out.println("+----------------------------+");
		System.out.println("| 1 - Adição                 |");
		System.out.println("| 2 - Subtração              |");
		System.out.println("| 3 - Multiplicação          |");
		System.out.println("| 4 - Divisão                |");
		System.out.println("+----------------------------+");
	}

	public static double somar(double n1, double n2) {

		return n1 + n2;
	}

	public static double subtrair(double n1, double n2) {

		return n1 - n2;
	}

	public static double multiplicar(double n1, double n2) {

		return n1 * n2;
	}

	public static double dividir(double n1, double n2) {

		return n1 / n2;
	}

	public static double lerNumero(Scanner sc) {

		System.out.print("Insira um número: ");

		return sc.nextDouble();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		mostrarMenu();

		System.out.print("Escolha uma operação: ");
		int opcao = sc.nextInt();

		if (opcao >= 1 && opcao <= 4) {

			double n1 = lerNumero(sc);
			double n2 = lerNumero(sc);

			double resultado = 0;

			if (opcao == 1) {

				resultado = somar(n1, n2);

			} else if (opcao == 2) {

				resultado = subtrair(n1, n2);

			} else if (opcao == 3) {

				resultado = multiplicar(n1, n2);

			} else if (opcao == 4) {

				if (n2 == 0) {

					System.out.println("Operação inválida: divisão por zero.");

				} else {

					resultado = dividir(n1, n2);

					System.out.println("Resultado = " + resultado);
				}
			}

			if (opcao >= 1 && opcao <= 3) {

				System.out.println("Resultado = " + resultado);
			}

		} else {

			System.out.println("Operação inválida.");
		}

		sc.close();
	}
}