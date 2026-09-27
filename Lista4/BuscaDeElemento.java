package arrays;

import java.util.Scanner;

public class BuscaDeElemento {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] vet = new int[10];

		for (int i = 0; i < vet.length; i++) {

			System.out.print("Insira o " + (i + 1) + "° valor do vetor: ");

			vet[i] = sc.nextInt();
		}

		int opcao;

		do {

			System.out.println();
			System.out.print("Você deseja procurar um número no vetor? ");
			System.out.print("1 - Sim | 2 - Não: ");

			opcao = sc.nextInt();

			if (opcao == 1) {

				System.out.print("Insira o número que você quer procurar: ");

				int numero = sc.nextInt();

				int quantidade = 0;

				for (int i = 0; i < vet.length; i++) {

					if (vet[i] == numero) {

						System.out.println("Número encontrado na posição: " + (i + 1) + " do vetor.");

						quantidade++;
					}
				}

				if (quantidade == 0) {

					System.out.println("Número não encontrado no vetor.");

				} else if (quantidade == 1) {

					System.out.println("O número foi encontrado apenas 1 vez.");

				} else {

					System.out.println("O número foi encontrado " + quantidade + " vezes no vetor.");
				}

			} else if (opcao != 2) {

				System.out.println("Opção inválida. Digite 1 para Sim ou 2 para Não.");
			}

		} while (opcao != 2);

		System.out.println("Programa encerrado.");

		sc.close();
	}
}