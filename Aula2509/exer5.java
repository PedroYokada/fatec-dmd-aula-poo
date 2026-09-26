package exercicios;

import java.util.Arrays;

public class exer5 {

	public static void main(final String[] args) {

		int[][] m = { { 1, 0, 0, 1, 1, 1 }, { 0, 1, 1, 0, 0, 0 }, { 1, 0, 0, 0, 0, 1 }, { 0, 0, 0, 1, 1, 0 },
				{ 0, 1, 1, 1, 1, 1 }, { 0, 1, 1, 1, 1, 0 }, { 0, 0, 1, 1, 1, 1 } };

		int x = somaMatriz(m);
		System.out.println("Soma da matriz: " + x);
	}

	private static int somaMatriz(int[][] m) {
		int soma = 0;

		for (int i = 0; i < m.length; i++) {
			System.out.println(Arrays.toString(m[i])); 
			for (int j = 0; j < m[i].length; j++) {
				soma += m[i][j];
			}
		}

		return soma;
	}

	private static void soma(int[] is) {
		int soma = 0;

	}
}
