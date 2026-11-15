import java.util.Scanner;

public class JogoDaVelha  {

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        char[][] matriz = new char[3][3];

        char jogador1 = 'X';
        char jogador2 = 'O';

        boolean venceu = false;

        // Nomes dos jogadores
        System.out.print("Digite o nome do Jogador 1: ");
        String nomeJogador1 = user.nextLine();

        System.out.print("Digite o nome do Jogador 2: ");
        String nomeJogador2 = user.nextLine();

        // Preenche a matriz com espaços vazios
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                matriz[i][j] = ' ';

            }

        }

        // No máximo 9 jogadas
        for (int jogada = 0; jogada < 9 && !venceu; jogada++) {

            // Mostra as colunas
            System.out.println("\n   1  2  3");

            // Mostra o tabuleiro
            for (int i = 0; i < 3; i++) {

                System.out.print((i + 1) + " ");

                for (int j = 0; j < 3; j++) {

                    System.out.print("[" + matriz[i][j] + "]");

                }

                System.out.println();

            }

            int linha;
            int coluna;

            char jogadorAtual;
            String nomeAtual;

            // Jogador 1
            if (jogada % 2 == 0) {

                jogadorAtual = jogador1;
                nomeAtual = nomeJogador1;

            }

            // Jogador 2
            else {

                jogadorAtual = jogador2;
                nomeAtual = nomeJogador2;

            }

            do {

                System.out.println("\nVez de " + nomeAtual + " - " + jogadorAtual);

                System.out.print("Informe a linha (1 a 3): ");
                linha = user.nextInt();

                System.out.print("Informe a coluna (1 a 3): ");
                coluna = user.nextInt();

                // Verifica se linha e coluna estão entre 1 e 3
                if (linha < 1 || linha > 3 || coluna < 1 || coluna > 3) {

                    System.out.println("Posição inválida! Digite valores entre 1 e 3.");

                }

                // Verifica se a posição já está ocupada
                else if (matriz[linha - 1][coluna - 1] != ' ') {

                    System.out.println("Posição já ocupada! Escolha outra.");

                }

            } while (
                linha < 1 || linha > 3 ||
                coluna < 1 || coluna > 3 ||
                matriz[linha - 1][coluna - 1] != ' '
            );

            // Converte de 1-3 para 0-2
            linha--;
            coluna--;

            // Coloca X ou O
            matriz[linha][coluna] = jogadorAtual;

            // Verifica linhas
            for (int i = 0; i < 3; i++) {

                if (matriz[i][0] == jogadorAtual &&
                    matriz[i][1] == jogadorAtual &&
                    matriz[i][2] == jogadorAtual) {

                    venceu = true;

                }

            }

            // Verifica colunas
            for (int j = 0; j < 3; j++) {

                if (matriz[0][j] == jogadorAtual &&
                    matriz[1][j] == jogadorAtual &&
                    matriz[2][j] == jogadorAtual) {

                    venceu = true;

                }

            }

            // Verifica diagonal principal
            if (matriz[0][0] == jogadorAtual &&
                matriz[1][1] == jogadorAtual &&
                matriz[2][2] == jogadorAtual) {

                venceu = true;

            }

            // Verifica diagonal secundária
            if (matriz[0][2] == jogadorAtual &&
                matriz[1][1] == jogadorAtual &&
                matriz[2][0] == jogadorAtual) {

                venceu = true;

            }

            // Se venceu
            if (venceu) {

                System.out.println("\n" + nomeAtual + " venceu!");

            }

        }

        // Mostra o tabuleiro final
        System.out.println("\nTabuleiro final:");

        System.out.println("    1   2   3");

        for (int i = 0; i < 3; i++) {

            System.out.print((i + 1) + " ");

            for (int j = 0; j < 3; j++) {

                System.out.print("[" + matriz[i][j] + "]");

            }

            System.out.println();

        }

        // Caso ninguém tenha vencido
        if (!venceu) {

            System.out.println("\nDeu velha! Empate!");

        }

        user.close();

    }

}