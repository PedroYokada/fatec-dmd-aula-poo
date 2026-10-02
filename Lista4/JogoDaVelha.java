package arrays;

import java.util.Scanner;

public class JogoDaVelha {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[][] velha = new char[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				velha[i][j] = '-';
			}
		}

		System.out.println("\n--- Tabuleiro Impresso ---");
		for (int i = 0; i < velha.length; i++) {
			for (int j = 0; j < velha[i].length; j++) {
				System.out.print(velha[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
