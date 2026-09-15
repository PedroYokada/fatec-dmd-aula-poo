package lista2_POO;

import java.util.Scanner;

public class MediaValores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double media = 0;
		int cont = 0;
		double soma = 0;

		System.out.print("Quantos numeros você deseja informar?: ");
		int qntd = sc.nextInt();

		for (int i = 0; i < qntd; i++) {
			System.out.print("Informe o " + (i + 1) + "° numero: ");
			int num = sc.nextInt();

			soma += num;
			cont += 1;
		}

		media = soma / cont;

		System.out.print("MÉDIA = " + media);

	}

}
