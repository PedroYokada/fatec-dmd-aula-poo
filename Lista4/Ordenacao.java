package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ordenacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] vet = new int[5];
		int[] vetInvertido = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.print("Insira o " + (i + 1) + "º" + " valor do vetor: ");
			vet[i] = sc.nextInt();
		}

		for (int i = 0; i < vet.length; i++) {
			vetInvertido[i] = vet[vet.length - 1 - i];
		}

		System.out.println("Vetor original: " + Arrays.toString(vet));
		Arrays.sort(vet);
		System.out.println("Vetor em ordem crescente: " + Arrays.toString(vet));

		sc.close();

	}

}
