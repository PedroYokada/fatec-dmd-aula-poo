package lista2_POO;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o numero do fatorial: ");
		int num = sc.nextInt();

		int fatorial = 1;

		for (int i = 1; i <= num; i++) {
			fatorial *= i;
		}

		System.out.print("FATORIAL =  " + fatorial);

	}

}
