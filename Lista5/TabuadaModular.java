package funcoes;

import java.util.Scanner;

public class TabuadaModular {

	public static int lerNumero(Scanner sc) {

		System.out.print("Insira um valor para calcular a tabuada: ");
		int numero = sc.nextInt();

		return numero;
	}

	public static void mostrarLinha(int numero, int multiplicador) {
		System.out.println(numero + " * " + multiplicador + " = " + numero * multiplicador);
	}

	public static void exibirTabuada(int numero) {
		for (int i = 1; i < 11; i++) {
			mostrarLinha(numero, i);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero = lerNumero(sc);

		exibirTabuada(numero);

		sc.close();

	}

}
