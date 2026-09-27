package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class LeituraExibicao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vet = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.print("Insira o " + (i + 1) + "º" + " valor do vetor: ");
			vet[i] = sc.nextInt();
		}

		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + "º" + " valor = " + vet[i]);
		}

		System.out.println("Array completa: " + (Arrays.toString(vet)));

		sc.close();

	}

}
