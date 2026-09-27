package arrays;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] vet = new int[8];

		int soma = 0;
		float media = 0;
		int cont = 0;

		for (int i = 0; i < 8; i++) {
			System.out.print("Insira o " + (i + 1) + "º" + " valor do vetor: ");
			vet[i] = sc.nextInt();

			soma += vet[i];
			cont++;

		}

		media = (float) soma / cont;

		System.out.println("Menor valor do vetor = " + media);
	}

}
