package funcoes;

import java.util.Scanner;

public class SeparandoValidacao {

	public static boolean ehPar(int num) {
		return num % 2 == 0;
	}

	public static void mostrarResultado(int num, boolean resultado) {

		if (resultado == true) {
			System.out.println("O numero " + num + " é par");
		} else {
			System.out.println("O numero " + num + " é impar");
		}

	}

	public static int lerNumero(Scanner sc) {

		System.out.print("Insira um numero: ");
		
		int num = sc.nextInt();

		return num;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = lerNumero(sc);

		boolean resultado = ehPar(num);

		mostrarResultado(num, resultado);

		sc.close();
	}
}
