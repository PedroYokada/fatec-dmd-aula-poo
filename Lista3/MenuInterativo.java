package lista2_POO;

import java.util.Scanner;

public class MenuInterativo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int menu;

		do {
			System.out.println("1 - SOMAR");
			System.out.println("2 - SUBTRAIR");
			System.out.println("3 - SAIR");

			System.out.print("Escolha uma opção: ");
			menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.println("Somando");
				break;
			case 2:
				System.out.println("Subtraindo");
				break;
			case 3:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção inválida...");
			}
		} while (menu != 3);
		{
			sc.close();
		}

	}

}
