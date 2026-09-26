package exercicios;

import java.util.Arrays;

public class exer7 {

	public static void main(String[] args) {
		int[] linhas = { 9, 10, 8, 12, 6, 2, 1, 8 };

		int[][] matriz = new int[linhas.length][];

		int valor = 1;

		for (int i = 0; i < matriz.length; i++) {
			int quantidade = linhas[i];
			matriz[i] = new int[quantidade];

			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = valor++;
			}
		}

		/*
		 * for (int i = 0; i < matriz.length; i++) {
		 * System.out.println(Arrays.toString(matriz[i])); }
		 */

		// esse é o foreach
		for (int[] linha : matriz) {
			System.out.println(Arrays.toString(linha));
		}
	}
}
