package arrays;

import java.util.Scanner;

public class SomaElementos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vet = new int[10];

		int soma = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print("Insira o " + (i + 1) + "º" + " valor do vetor: ");
			vet[i] = sc.nextInt();

			soma += vet[i];
		}

		System.out.println("Soma = " + (soma));

		sc.close();

	}

}
