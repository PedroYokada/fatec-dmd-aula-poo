package arrays;

import java.util.Scanner;

public class MaiorMenorValor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] vet = new int[8];

		int menor = 0;

		for (int i = 0; i < 8; i++) {
			System.out.print("Insira o " + (i + 1) + "º" + " valor do vetor: ");
			vet[i] = sc.nextInt();

			if (i == 0) {
				menor = vet[i];
			} else if (vet[i] < menor) {
				menor = vet[i];
			}

		}

		System.out.println("Menor valor do vetor = " + menor);

	}

}
