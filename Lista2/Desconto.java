package lista1_POO;

import java.util.Scanner;

public class Desconto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o valor da compra: ");

		Double compra = sc.nextDouble();

		Double desconto = 0.00;
		Double ValorTotal = 0.00;

		if (compra >= 100) {
			desconto = compra * 0.10;
			ValorTotal = compra - (compra * 0.10);
		} else {
			ValorTotal = compra;
		}

		System.out.println("-----------------------------");
		System.out.println("Valor da compra: " + compra);
		System.out.println("Valor do desconto: " + desconto);
		System.out.println("Valor Total: " + ValorTotal);
		System.out.println("-----------------------------");

	}

}
