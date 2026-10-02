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

        return saldo + valor;
    }

    public static double sacar(double saldo, double valor) {

        return saldo - valor;
    }

    public static void consultarSaldo(double saldo) {

        System.out.println("Saldo atual: R$ " + saldo);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double saldo = 10000;

        mostrarMenu();

        int opcao = sc.nextInt();

        if (opcao == 1) {

            System.out.print("Digite o valor para depósito: ");
            double valor = sc.nextDouble();

            saldo = depositar(saldo, valor);

            System.out.println("Depósito realizado.");
            consultarSaldo(saldo);

        } else if (opcao == 2) {

            System.out.print("Digite o valor para saque: ");
            double valor = sc.nextDouble();

            saldo = sacar(saldo, valor);

            System.out.println("Saque realizado.");
            consultarSaldo(saldo);

        } else if (opcao == 3) {

            consultarSaldo(saldo);

        } else if (opcao == 4) {

            System.out.println("Programa encerrado...");

        } else {

            System.out.println("Valor inválido");
        }

        sc.close();
    }
}