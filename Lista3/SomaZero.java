package lista2_POO;

import java.util.Scanner;

public class SomaZero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;
		do {

			System.out.print("Insira um numero: ");
			num = sc.nextInt();

		} while (num != 0);
		{

			System.out.println("Programa encerrado...");
			sc.close();

		}

	}

}
