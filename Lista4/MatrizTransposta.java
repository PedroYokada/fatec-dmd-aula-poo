package arrays;

import java.util.Scanner;

public class MatrizTransposta {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[][] mat = new int[3][3];

		int[] pares = new int[9];
		int cont = 0;

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print("Insira o elemento [" + (i + 1) + "," + (j + 1) + "] da matriz: ");
				mat[i][j] = sc.nextInt();

			}
		}

		System.out.println("\n--- Matriz Original ---");

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("\n--- Matriz Tranposta ---");
		for (int j = 0; j < mat[0].length; j++) {
			for (int i = 0; i < mat.length; i++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();

		}
	}

}
