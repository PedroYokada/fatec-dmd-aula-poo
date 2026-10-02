package arrays;

import java.util.Scanner;

public class SomaPorLinhaeColuna {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] mat = new int[3][3];

		int[] linhas = new int[3];
		int[] colunas = new int[3];

		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {
				System.out.print("Insira o elemento [" + (i + 1) + "," + (j + 1) + "] da matriz: ");
				mat[i][j] = sc.nextInt();

				linhas[i] += mat[i][j];
				colunas[j] += mat[i][j];

			}

		}

		System.out.println("\n--- Matriz Impressa ---");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("\n--- Somas das linhas ---");

		for (int i = 0; i < linhas.length; i++) {
			System.out.println("Soma da linha " + (i + 1) + " = " + linhas[i]);
		}

		System.out.println("\n--- Somas das colunas ---");

		for (int j = 0; j < colunas.length; j++) {
			System.out.println("Soma da linha " + (j + 1) + " = " + colunas[j]);
		}

		sc.close();

	}

}
