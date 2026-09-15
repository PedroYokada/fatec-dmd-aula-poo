package lista1_POO;

import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o valor do saque: ");

		int valor = sc.nextInt();

		System.out.println("NOTA DE 100 = " + valor / 100);
		valor = valor %= 100;

		System.out.println("NOTA DE 50 = " + valor / 50);
		valor = valor %= 50;

		System.out.println("NOTA DE 20 = " + valor / 20);
		valor = valor %= 20;

		System.out.println("NOTA DE 10 = " + valor / 10);
		valor = valor %= 10;

		System.out.println("NOTA DE 5 = " + valor / 5);
		valor = valor %= 5;

		System.out.println("NOTA DE 2 = " + valor / 2);
		valor = valor %= 2;

		System.out.println("NOTA DE 1 = " + valor / 1);
		valor = valor %= 1;

	}

}
