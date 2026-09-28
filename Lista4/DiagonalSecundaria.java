package arrays;

import java.util.Scanner;

public class DiagonalSecundaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] mat = new int[3][3];

		int soma = 0;

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print("Insira o elemento [" + (i) + "," + (j) + "] da matriz: ");
				mat[i][j] = sc.nextInt();
				if (i + j == mat.length - 1) {
					soma += mat[i][j];
				}
			}

		}

		System.out.println("\n--- Matriz Final ---");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("Soma da diagonal secundaria = " + soma);

		sc.close();

	}

}
