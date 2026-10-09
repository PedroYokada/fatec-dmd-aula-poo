package funcoes;

import java.util.Scanner;
import java.util.Random;

public class PedraPapelTesoura {

    static Scanner sc = new Scanner(System.in);

    static void mostrarMenu() {
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");
    }

    static int jogadaJogador() {
        return sc.nextInt();
    }

    static int jogadaComputador() {
        return new Random().nextInt(3) + 1;
    }

    static String verificarVencedor(int j, int c) {
        if (j == c) return "Empate!";

        if (j == 1 && c == 3 ||
            j == 2 && c == 1 ||
            j == 3 && c == 2)
            return "Você venceu!";

        return "Computador venceu!";
    }

    static void mostrarResultado(String resultado) {
        System.out.println(resultado);
    }

    public static void main(String[] args) {

        mostrarMenu();

        int jogador = jogadaJogador();

        if (jogador < 1 || jogador > 3) {
            System.out.println("Opção inválida!");
            return;
        }

        int computador = jogadaComputador();

        mostrarResultado(verificarVencedor(jogador, computador));
    }
}
