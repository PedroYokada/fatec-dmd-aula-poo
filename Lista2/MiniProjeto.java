package lista1_POO;

import java.util.Scanner;

public class MiniProjeto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int opcao;

		System.out.println("Insira o usuário: ");
		String user = sc.nextLine();

		System.out.println("Insira a senha: ");
		String senha = sc.nextLine();

		if (!user.equals("admin") || !senha.equals("1234")) {
			System.out.println("Login inválido");
			sc.close();
			return;
		}

		double saldo = 10000;
		double deposito = 0;
		double saque = 0;

		do {

			System.out.println("----------CAIXA ELETRONICO--------------");
			System.out.println("1 - VER SALDO");
			System.out.println("2 - DEPOSITAR");
			System.out.println("3 - SACAR");
			System.out.println("4 - SAIR");
			System.out.println("-----------------------------------------");

			System.out.print("Escolha uma opção: ");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("SALDO = " + saldo);
				break;
			case 2:
				System.out.print("Digite o valor do depósito: ");
				deposito = sc.nextDouble();

				saldo += deposito;
				break;
			case 3:
				System.out.print("Digite o quanto quer sacar: ");
				saque = sc.nextDouble();

				if (saque <= saldo) {

					saldo -= saque;

					System.out.println("Saque realizado!");
					System.out.println("Novo saldo = R$ " + saldo);

				} else {

					System.out.println("Saldo insuficiente.");
				}

				break;
			case 4:

				System.out.println("Saindo...");

				break;

			default:

				System.out.println("Opção inválida.");

			}

		} while (opcao != 4);

		sc.close();
	}

}
