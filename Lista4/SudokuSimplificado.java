package arrays;

import java.util.Scanner;

public class SudokuSimplificado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] matriz = new int[3][3];
		boolean condicao = true;

		System.out.println("Insira os valores da matriz: ");

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matriz[i][j] = sc.nextInt();
                // Neste desafio 3x3, cada valor deve estar entre 1 e 9.
                if (matriz[i][j] < 1 || matriz[i][j] > 9) {
                    condicao = false;
                }
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int x = 0; x < 3; x++) {
					for (int y = 0; y < 3; y++) {
						if ((i != x || j != y) && (matriz[i][j] == matriz[x][y])) {
							condicao = false;
						}
					}
				}
			}
		}
		
		System.out.println(condicao ? "Matriz válida: números de 1 a 9 sem repetição." : "Matriz inválida: valores repetidos ou fora de 1 a 9.");
        sc.close();

	}
}
