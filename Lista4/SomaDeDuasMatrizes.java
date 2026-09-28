package arrays;

import java.util.Scanner;

public class SomaDeDuasMatrizes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] mat = new int[3][3];

		int[][] mat2 = new int[3][3];

		int[][] mat3 = new int[3][3];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print("Insira o elemento [" + (i + 1) + "," + (j + 1) + "] da primeira matriz: ");

				mat[i][j] = sc.nextInt();

			}
		}

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print("Insira o elemento [" + (i + 1) + "," + (j + 1) + "] da segunda matriz: ");

				mat2[i][j] = sc.nextInt();

			}
		}

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {

				mat3[i][j] = mat[i][j] + mat2[i][j];
			}
		}

		System.out.println("\n--- Primeira Matriz ---");

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("\n--- Segunda Matriz ---");

		for (int i = 0; i < mat2.length; i++) {
			for (int j = 0; j < mat2[i].length; j++) {
				System.out.print(mat2[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("\n--- Soma das Matrizes ---");

		for (int i = 0; i < mat3.length; i++) {
			for (int j = 0; j < mat3[i].length; j++) {
				System.out.print(mat3[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
