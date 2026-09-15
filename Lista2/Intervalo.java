package lista1_POO;

import java.util.Scanner;

public class Intervalo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o numero entre 10 e 50: ");

		int numero = sc.nextInt();
		sc.nextLine();

		if (numero >= 10 && numero <= 50) {
			System.out.println("O numero " + " está no intervalo");
		} else {
			System.out.println("O numero " + " está fora do intervalo");
		}

	}

}
