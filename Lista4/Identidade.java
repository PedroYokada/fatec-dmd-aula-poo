package arrays;

import java.util.Scanner;

public class Identidade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] mat = new int[3][3];

		int Identidade = 1;

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print("Insira o elemento [" + (i + 1) + "," + (j + 1) + "] da matriz: ");

				mat[i][j] = sc.nextInt();

			}
		}

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {

				if (i == j) {
					if (mat[i][j] != 1) {
						Identidade = 0;
					}
				}

				else {
					if (mat[i][j] != 0) {
						Identidade = 0;
					}
				}

			}
		}

		System.out.println("\n--- Matriz 3x3 ---");

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println();
		if (Identidade == 1) {
			System.out.println("A matriz inserida É uma matriz identidade!");
		} else {
			System.out.println("A matriz inserida NÃO é uma matriz identidade.");
		}

		sc.close();

	}

}
