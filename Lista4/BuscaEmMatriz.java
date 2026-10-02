package arrays;

import java.util.Scanner;

public class BuscaEmMatriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] mat = new int[5][5];

		System.out.println("Deseja iniciar o programa? (1 = sim | 2 = não): ");
		int opcao = sc.nextInt();

		if (opcao == 1) {

			do {

				System.out.println("Digite os valores da matriz:");

				for (int i = 0; i < 5; i++) {

					for (int j = 0; j < 5; j++) {

						mat[i][j] = sc.nextInt();
					}
				}

				System.out.print("Digite o número que deseja buscar: ");
				int num = sc.nextInt();

				boolean encontrado = false;

				for (int i = 0; i < 5; i++) {

					for (int j = 0; j < 5; j++) {

						if (mat[i][j] == num) {

							System.out.println("Número " + num + " encontrado em [" + (i + 1) + "," + (j + 1) + "]");

							encontrado = true;
						}
					}
				}

				if (encontrado == false) {

					System.out.println("Número não encontrado.");
				}

				System.out.println("Deseja executar o programa novamente? " + "(1 = sim | 2 = não): ");

				opcao = sc.nextInt();

			} while (opcao == 1);

		}

		System.out.println("Programa encerrado...");

		sc.close();
	}
}