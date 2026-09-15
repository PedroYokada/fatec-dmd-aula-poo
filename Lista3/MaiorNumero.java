package lista2_POO;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o 1º Numero: ");
		int maior = sc.nextInt();

		for (int i = 2; i < 6; i++) {
			System.out.print("Insira o " + i + "º Numero: ");
			int num = sc.nextInt();

			if (num > maior) {
				maior = num;
			}
		}

		System.out.println("MAIOR NUMERO = " + maior);

	}

}
