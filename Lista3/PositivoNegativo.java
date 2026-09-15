package lista2_POO;

import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i < 11; i++) {
			System.out.print("Insira o " + i + "º numero: ");
			int num = sc.nextInt();

			if (num == 0) {
				System.out.println("Numero " + i + " é neutro");
			} else if (num > 0) {
				System.out.println("Numero " + i + " é positivo");
			} else {
				System.out.println("Numero " + i + " é negativo");
			}
		}

	}

}
