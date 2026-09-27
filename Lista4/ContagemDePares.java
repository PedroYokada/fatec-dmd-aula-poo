package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ContagemDePares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] vet = new int[8];
		int[] tempPares = new int[vet.length];

		int cont = 0;

		for (int i = 0; i < 8; i++) {
			System.out.print("Insira o " + (i + 1) + "º" + " valor do vetor: ");
			vet[i] = sc.nextInt();

			if (vet[i] % 2 == 0) {
				tempPares[cont] = vet[i];
				cont++;
			}

		}

		int[] NumerosPares = new int[cont];

		for (int i = 0; i < cont; i++) {
			NumerosPares[i] = tempPares[i];
		}

		System.out.println("Vetor = " + Arrays.toString(NumerosPares) + "\nQuantidade de pares = " + cont);

		sc.close();

	}

}
