package lista1_POO;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o primeiro numero: ");

		int numero = sc.nextInt();
		sc.nextLine();

		System.out.println("Insira o segundo numero: ");

		int numero2 = sc.nextInt();
		sc.nextLine();

		if (numero > numero2) {
			System.out.println("Numero " + numero + " é maior que " + numero2);
		} else if (numero2 > numero) {
			System.out.println("Numero " + numero2 + " é maior que " + numero);
		} else {
			System.out.println("Numeros iguais!!!");
		}

	}

}
