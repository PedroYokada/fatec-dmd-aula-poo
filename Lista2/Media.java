package lista1_POO;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Insira a primeira nota: ");
		double n1 = sc.nextDouble();

		System.out.print("Insira a segunda nota: ");
		double n2 = sc.nextDouble();

		double media = (n1 + n2) / 2;

		System.out.println("Média final: " + media);

		if (media >= 6) {
			System.out.println("Aprovado!!!");
		} else if (media >= 4 && media < 6) {
			System.out.println("Recuperação!!!");
		} else {
			System.out.println("Reprovado!!!");
		}

		sc.close();
	}
}
