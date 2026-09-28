package arrays;

import java.util.Scanner;

public class SomaDaMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] mat = new int[3][3];

		int soma = 0;

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print("Insira o elemento [" + (i + 1) + "," + (j + 1) + "] da matriz: ");
				mat[i][j] = sc.nextInt();

				soma += mat[i][j];

			}

		}
		System.out.println("Soma dos elementos da matriz = " + soma);

		sc.close();

	}

}
