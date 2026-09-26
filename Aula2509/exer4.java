package exercicios;

import java.util.Scanner;

public class exer4 {

	public static void main(String[] args) {

		int[][] sala = new int[7][6];

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 6; j++) {
				System.out.print("Digite o valor para a posicao [" + i + "][" + j + "]: ");
				sala[i][j] = sc.nextInt();
			}
		}

		System.out.println("\nMatriz preenchida com sucesso!");
		sc.close();

	}

}
