package funcoes;
import java.util.Scanner;

public class CaixaEletronico {

    static Scanner sc = new Scanner(System.in);

    static void mostrarMenu() {
        System.out.println("\n1 - Depositar");
        System.out.println("2 - Sacar");
        System.out.println("3 - Consultar saldo");
        System.out.println("0 - Encerrar");
    }

    static double lerValor() {
        System.out.print("Digite o valor: R$ ");
        return sc.nextDouble();
    }

    static double depositar(double saldo, double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido!");
            return saldo;
        }

        return saldo + valor;
    }

    static double sacar(double saldo, double valor) {
        if (valor <= 0 || valor > saldo) {
            System.out.println("Valor inválido ou saldo insuficiente!");
            return saldo;
        }

        return saldo - valor;
    }

    static void consultarSaldo(double saldo) {
        System.out.println("Saldo: R$ " + saldo);
    }

    static void encerrarSistema() {
        System.out.println("Sistema encerrado!");
    }

    public static void main(String[] args) {

        double saldo = 1000;
        int opcao;

        do {
            mostrarMenu();

            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            if (opcao == 1) {
                saldo = depositar(saldo, lerValor());

            } else if (opcao == 2) {
                saldo = sacar(saldo, lerValor());

            } else if (opcao == 3) {
                consultarSaldo(saldo);

            } else if (opcao == 0) {
                encerrarSistema();

            } else {
                System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }

}
