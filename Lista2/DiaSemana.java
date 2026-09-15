package lista1_POO;

import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {

		System.out.println("--------------------------");
		System.out.println("--------DIA DA SEMANA-------");

		System.out.println("1 - DOMINGO");
		System.out.println("2 - SEGUNDA");
		System.out.println("3 - TERÇA");
		System.out.println("4 - QUARTA");
		System.out.println("5 - QUINTA");
		System.out.println("6 - SEXTA");
		System.out.println("7 - SABÁDO");

		System.out.print("Insira o dia da semana: ");

		Scanner sc = new Scanner(System.in);

		int dia = sc.nextInt();

		switch (dia) {
		case 1:
			System.out.println("DOMINGO");
			break;
		case 2:
			System.out.println("SEGUNDA");
			break;
		case 3:
			System.out.println("TERÇA");
			break;
		case 4:
			System.out.println("QUARTA");
			break;
		case 5:
			System.out.println("QUINTA");
			break;
		case 6:
			System.out.println("SEXTA");
			break;
		case 7:
			System.out.println("SABÁDO");
			break;
		default:
			System.out.println("Valor Inválido");
			sc.close();
			return;
		}

		System.out.println("\nPressione ENTER para sair...");
		sc.nextLine();
		sc.nextLine();

		sc.close();

	}

}
