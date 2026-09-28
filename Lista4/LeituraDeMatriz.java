package arrays;

import java.util.Scanner;

public class LeituraDeMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] mat = new int[3][3];

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print("Insira o elemento [" + (i + 1) + "," + (j + 1) + "] da matriz: ");
				mat[i][j] = sc.nextInt();

			}

		}
		System.out.println("\n--- Matriz Final ---");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}
		sc.close();

	}

}
