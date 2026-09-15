package lista2_POO;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Insira um numero para a tabuada: ");

		int num = sc.nextInt();

		for (int i = 1; i < 11; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}

		sc.close();

	}

}
