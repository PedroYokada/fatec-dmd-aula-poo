package funcoes;

import java.util.Scanner;

public class SistemaBancarioSimples {

    public static void mostrarMenu() {
        System.out.println();
        System.out.println("+------------------------------+");
        System.out.println("|       SISTEMA BANCÁRIO       |");
        System.out.println("+------------------------------+");
        System.out.println("| 1 - Depositar                |");
        System.out.println("| 2 - Sacar                    |");
        System.out.println("| 3 - Consultar saldo          |");
        System.out.println("| 4 - Sair                     |");
        System.out.println("+------------------------------+");
        System.out.print("Escolha uma opção: ");
    }

    public static double depositar(double saldo, double valor) {
        if (!Double.isFinite(valor) || valor <= 0) {
            throw new IllegalArgumentException("O depósito deve ser maior que zero.");
        }
        return saldo + valor;
    }

    public static double sacar(double saldo, double valor) {
        if (!Double.isFinite(valor) || valor <= 0) {
            throw new IllegalArgumentException("O saque deve ser maior que zero.");
        }
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
        return saldo - valor;
    }

    public static void consultarSaldo(double saldo) {
        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 10000;
        int opcao = 0;

        // Mantém o menu disponível até que o usuário escolha sair.
        do {
            mostrarMenu();

            if (!sc.hasNextInt()) {
                System.out.println("Opção inválida!");
                sc.nextLine();
                continue;
            }

            opcao = sc.nextInt();

            if (opcao == 1 || opcao == 2) {
                System.out.print(opcao == 1 ? "Digite o valor para depósito: " : "Digite o valor para saque: ");

                if (!sc.hasNextDouble()) {
                    System.out.println("Valor inválido!");
                    sc.nextLine();
                    continue;
                }

                double valor = sc.nextDouble();

                try {
                    if (opcao == 1) {
                        saldo = depositar(saldo, valor);
                        System.out.println("Depósito realizado.");
                    } else {
                        saldo = sacar(saldo, valor);
                        System.out.println("Saque realizado.");
                    }
                    consultarSaldo(saldo);
                } catch (IllegalArgumentException e) {
                    System.out.println("Erro: " + e.getMessage());
                }

            } else if (opcao == 3) {
                consultarSaldo(saldo);
            } else if (opcao == 4) {
                System.out.println("Programa encerrado...");
            } else {
                System.out.println("Opção inválida.");
            }

        } while (opcao != 4);

        sc.close();
    }
}
