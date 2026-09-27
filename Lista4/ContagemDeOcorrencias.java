package arrays;

import java.util.Scanner;

public class ContagemDeOcorrencias {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vet = new int[10];

		for (int i = 0; i < vet.length; i++) {

			System.out.print("Insira o " + (i + 1) + "° valor do vetor: ");

			vet[i] = sc.nextInt();
		}

		System.out.print("Insira o valor que deseja procurar: ");
		int x = sc.nextInt();

		int quantidade = 0;

		for (int i = 0; i < vet.length; i++) {

			if (vet[i] == x) {

				quantidade++;
			}
		}

		System.out.println("O número " + x + " aparece " + quantidade + " vezes no vetor.");

		sc.close();
	}
}