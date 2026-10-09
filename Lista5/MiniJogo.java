
package funcoes;

import java.util.Scanner;
import java.util.Random;

public class MiniJogo {

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    static void iniciarJogo() {
        System.out.println("=== JOGO DE BATALHA ===");
        System.out.println("Derrote o monstro para vencer!");
    }

    static void mostrarMenu() {
        System.out.println("\n1 - Atacar");
        System.out.println("2 - Curar");
        System.out.println("3 - Ver status");
    }

    static int lerOpcao() {
        System.out.print("Escolha: ");
        return sc.nextInt();
    }

    static int atacar() {
        return random.nextInt(16) + 5;
    }

    static int receberDano() {
        return random.nextInt(11) + 5;
    }

    static int curar(int vida) {
        vida += 15;

        if (vida > 100) {
            vida = 100;
        }

        return vida;
    }

    static void mostrarStatus(int jogador, int monstro) {
        System.out.println("Sua vida: " + jogador);
        System.out.println("Vida do monstro: " + monstro);
    }

    static boolean verificarVitoria(int monstro) {
        return monstro <= 0;
    }

    static boolean verificarDerrota(int jogador) {
        return jogador <= 0;
    }

    static void encerrarJogo(boolean venceu) {
        if (venceu) {
            System.out.println("Você venceu!");
        } else {
            System.out.println("Você perdeu!");
        }
    }

    public static void main(String[] args) {

        int jogador = 100;
        int monstro = 80;

        iniciarJogo();

        while (!verificarVitoria(monstro) &&
               !verificarDerrota(jogador)) {

            mostrarMenu();
            int opcao = lerOpcao();

            if (opcao == 1) {

                int dano = atacar();
                monstro -= dano;

                System.out.println("Você causou " + dano + " de dano!");

                if (!verificarVitoria(monstro)) {
                    dano = receberDano();
                    jogador -= dano;

                    System.out.println("Monstro causou " + dano + " de dano!");
                }

            } else if (opcao == 2) {

                jogador = curar(jogador);
                System.out.println("Você recuperou vida!");

            } else if (opcao == 3) {

                mostrarStatus(jogador, monstro);

            } else {
                System.out.println("Opção inválida!");
            }
        }

        encerrarJogo(verificarVitoria(monstro));
        sc.close();
    }
}
