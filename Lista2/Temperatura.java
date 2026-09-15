package lista1_POO;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira a temperatura: ");
		int temperatura = sc.nextInt();

		if (temperatura < 15) {
			System.out.println("Frio");
		} else if (temperatura < 25) {
			System.out.println("Agradavel");
		} else {
			System.out.println("Quente");
		}

	}

}
