package arrays;

import java.util.Scanner;

public class RotacaoDeMatriz {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] mat = new int[3][3];

		int[][] rotacionada = new int[3][3];

		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {

				System.out.print("Insira o elemento [" + (i + 1) + "," + (j + 1) + "] da matriz: ");

				mat[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {

				rotacionada[j][mat.length - 1 - i] = mat[i][j];
			}
		}

		System.out.println("\n--- Matriz Original ---");

		for (int i = 0; i < mat.length; i++) {

			for (int j = 0; j < mat[i].length; j++) {

				System.out.print(mat[i][j] + "\t");
			}

			System.out.println();
		}

		System.out.println("\n--- Matriz Rotacionada ---");

		for (int i = 0; i < rotacionada.length; i++) {

			for (int j = 0; j < rotacionada[i].length; j++) {

				System.out.print(rotacionada[i][j] + "\t");
			}

			System.out.println();
		}

		sc.close();
	}
}