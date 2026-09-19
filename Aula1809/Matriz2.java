package pacote;

public class Matriz2 {

	public static void main(String[] args) {
		int[][] m = { { 1, 0, 0, 1, 1, 1 }, { 0, 1, 1, 0, 0, 0 }, { 1, 0, 0, 0, 0, 1 }, { 0, 0, 0, 1, 1, 0 },
				{ 0, 1, 1, 1, 1, 1 }, { 0, 1, 1, 1, 1, 0 }, { 0, 0, 1, 1, 1, 1 } };

		int soma = 0;

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 6; j++) {
				soma += m[i][j];
			}
		}

		System.out.print("SOMA = " + soma);

	}

}
