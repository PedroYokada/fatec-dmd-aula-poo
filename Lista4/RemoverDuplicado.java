package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class RemoverDuplicado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] vet = new int[10];

		for (int i = 0; i < vet.length; i++) {

			System.out.print("Insira o " + (i + 1) + "° valor do vetor: ");

			vet[i] = sc.nextInt();

		}

		System.out.println("Vetor sem duplicados: " + Arrays.toString(Arrays.stream(vet).distinct().toArray()));

		sc.close();

	}

}
