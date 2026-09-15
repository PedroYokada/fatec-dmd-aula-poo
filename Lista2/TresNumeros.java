package lista1_POO;

import java.util.Scanner;

public class TresNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o primeiro numero: ");
		int n1 = sc.nextInt();

		System.out.println("Insira o segundo numero: ");
		int n2 = sc.nextInt();

		System.out.println("Insira o terceiro numero: ");
		int n3 = sc.nextInt();

		int maior;

		if (n1 >= n2 && n1 >= n3) {
			maior = n1;
		} else if (n2 >= n1 && n2 >= n3) {
			maior = n2;
		} else {
			maior = n3;
		}

		System.out.println("Maior = " + n3);

	}

}
