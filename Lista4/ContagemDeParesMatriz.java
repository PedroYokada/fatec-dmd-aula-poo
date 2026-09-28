package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ContagemDeParesMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] mat = new int[3][3];
		

		int[] pares = new int[9]; 
		int cont = 0; 

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print("Insira o elemento [" + (i + 1) + "," + (j + 1) + "] da matriz: ");
				mat[i][j] = sc.nextInt();
				

				if (mat[i][j] % 2 == 0) {
					int valorAtual = mat[i][j];
					boolean jaExiste = false;
					
					for (int k = 0; k < cont; k++) {
						if (pares[k] == valorAtual) {
							jaExiste = true;
							break;
						}
					}
					
					if (!jaExiste) {
						pares[cont] = valorAtual;
						cont++;
					}
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

		int[] resultadoFinal = Arrays.copyOf(pares, cont);

		System.out.println("\nQuantidade de pares únicos = " + cont);
		System.out.println("Vetor de pares sem repetir: " + Arrays.toString(resultadoFinal));

		sc.close();
	}
}
