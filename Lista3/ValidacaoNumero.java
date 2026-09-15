package lista2_POO;

import java.util.Scanner;

public class ValidacaoNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;
		int NumSecreto = 3;

		do {

			System.out.print("Insira um numero: ");
			num = sc.nextInt();

			if (num < 1 || num > 10) {

				System.out.println("Numero invalido! Digite entre 1 e 10.");

			} else if (num != NumSecreto) {

				System.out.println("Numero incorreto, tente novamente.");

			}

		} while (num != NumSecreto);
		{

			System.out.println("Numero correto!");
			System.out.println("Programa encerrado...");
			sc.close();
		}

	}

}
