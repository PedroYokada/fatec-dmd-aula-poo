package teste;

import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {

        Scanner user = new Scanner(System.in);

        // Nomes dos jogadores
        System.out.print("Digite o nome do Jogador 1: ");
        String nomeJogador1 = user.nextLine();

        System.out.print("Digite o nome do Jogador 2: ");
        String nomeJogador2 = user.nextLine();

        // Placar
        int vitoriasJogador1 = 0;
        int vitoriasJogador2 = 0;
        int empates = 0;

        char jogarNovamente;

        do {

            // Cria um novo tabuleiro
            char[][] tabuleiro = criarTabuleiro();

            char jogadorAtual = 'X';

            boolean venceu = false;

            // Continua enquanto ninguém venceu
            // e ainda existem posições vazias
            while (!venceu && !tabuleiroCompleto(tabuleiro)) {

                exibirTabuleiro(tabuleiro);

                String nomeAtual;

                // Define o jogador da vez
                if (jogadorAtual == 'X') {

                    nomeAtual = nomeJogador1;

                } else {

                    nomeAtual = nomeJogador2;
                }

                System.out.println("\nVez de " + nomeAtual + " - " + jogadorAtual);

                // Realiza a jogada
                realizarJogada(tabuleiro, jogadorAtual, user);

                // Verifica se o jogador venceu
                venceu = verificarVitoria(tabuleiro, jogadorAtual);

                if (venceu) {

                    exibirTabuleiro(tabuleiro);

                    System.out.println("\n" + nomeAtual + " venceu!");

                    // Atualiza o placar
                    if (jogadorAtual == 'X') {

                        vitoriasJogador1++;

                    } else {

                        vitoriasJogador2++;
                    }

                } else {

                    // Troca o jogador
                    jogadorAtual = trocarJogador(jogadorAtual);
                }
            }

            // Caso ninguém tenha vencido
            if (!venceu) {

                exibirTabuleiro(tabuleiro);

                System.out.println("\nDeu velha! A partida terminou empatada!");

                empates++;
            }

            // Exibe o placar
            exibirPlacar(
                    nomeJogador1,
                    nomeJogador2,
                    vitoriasJogador1,
                    vitoriasJogador2,
                    empates
            );

            // Pergunta se deseja jogar novamente
            jogarNovamente = perguntarJogarNovamente(user);

        } while (jogarNovamente == 'S');

        // Placar final
        System.out.println("\n===== PLACAR FINAL =====");

        exibirPlacar(
                nomeJogador1,
                nomeJogador2,
                vitoriasJogador1,
                vitoriasJogador2,
                empates
        );

        System.out.println("\nObrigado por jogar!");
        System.out.println("Até a próxima!");

        user.close();
    }


    // Cria o tabuleiro vazio
    public static char[][] criarTabuleiro() {

        char[][] tabuleiro = new char[3][3];

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                tabuleiro[i][j] = ' ';
            }
        }

        return tabuleiro;
    }


    // Exibe o tabuleiro
    public static void exibirTabuleiro(char[][] tabuleiro) {

        System.out.println("\n    1   2   3");
        System.out.println("  +---+---+---+");

        for (int i = 0; i < 3; i++) {

            System.out.print((i + 1) + " |");

            for (int j = 0; j < 3; j++) {

                System.out.print(" " + tabuleiro[i][j] + " |");
            }

            System.out.println();
            System.out.println("  +---+---+---+");
        }
    }


    // Realiza a jogada
    public static void realizarJogada(
            char[][] tabuleiro,
            char jogadorAtual,
            Scanner user) {

        int linha;
        int coluna;

        while (true) {

            // Entrada da linha
            System.out.print("Informe a linha (1 a 3): ");

            if (!user.hasNextInt()) {

                System.out.println("Entrada inválida! Digite um número.");

                user.next();

                continue;
            }

            linha = user.nextInt();


            // Entrada da coluna
            System.out.print("Informe a coluna (1 a 3): ");

            if (!user.hasNextInt()) {

                System.out.println("Entrada inválida! Digite um número.");

                user.next();

                continue;
            }

            coluna = user.nextInt();


            // Verifica os limites
            if (linha < 1 || linha > 3 ||
                coluna < 1 || coluna > 3) {

                System.out.println(
                        "Posição inválida! Digite valores entre 1 e 3."
                );

            }

            // Verifica se a posição está ocupada
            else if (!posicaoValida(tabuleiro, linha, coluna)) {

                System.out.println(
                        "Essa posição já está ocupada. Escolha outra posição."
                );

            }

            // Jogada válida
            else {

                tabuleiro[linha - 1][coluna - 1] = jogadorAtual;

                break;
            }
        }
    }


    // Verifica se a posição está disponível
    public static boolean posicaoValida(
            char[][] tabuleiro,
            int linha,
            int coluna) {

        return tabuleiro[linha - 1][coluna - 1] == ' ';
    }


    // Verifica se houve vitória
    public static boolean verificarVitoria(
            char[][] tabuleiro,
            char jogador) {

        // Verifica as linhas
        for (int i = 0; i < 3; i++) {

            if (tabuleiro[i][0] == jogador &&
                tabuleiro[i][1] == jogador &&
                tabuleiro[i][2] == jogador) {

                return true;
            }
        }


        // Verifica as colunas
        for (int i = 0; i < 3; i++) {

            if (tabuleiro[0][i] == jogador &&
                tabuleiro[1][i] == jogador &&
                tabuleiro[2][i] == jogador) {

                return true;
            }
        }


        // Verifica a diagonal principal
        if (tabuleiro[0][0] == jogador &&
            tabuleiro[1][1] == jogador &&
            tabuleiro[2][2] == jogador) {

            return true;
        }


        // Verifica a diagonal secundária
        else if (tabuleiro[0][2] == jogador &&
                 tabuleiro[1][1] == jogador &&
                 tabuleiro[2][0] == jogador) {

            return true;
        }


        return false;
    }


    // Verifica se todas as posições estão ocupadas
    public static boolean tabuleiroCompleto(char[][] tabuleiro) {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                if (tabuleiro[i][j] == ' ') {

                    return false;
                }
            }
        }

        return true;
    }


    // Troca entre X e O
    public static char trocarJogador(char jogadorAtual) {

        if (jogadorAtual == 'X') {

            return 'O';

        } else {

            return 'X';
        }
    }


    // Exibe o placar
    public static void exibirPlacar(
            String nomeJogador1,
            String nomeJogador2,
            int vitoriasJogador1,
            int vitoriasJogador2,
            int empates) {

        System.out.println("\n===== PLACAR =====");

        System.out.println(
                nomeJogador1 + " (X): "
                + vitoriasJogador1 + " vitória(s)"
        );

        System.out.println(
                nomeJogador2 + " (O): "
                + vitoriasJogador2 + " vitória(s)"
        );

        System.out.println(
                "Empates: " + empates
        );
    }


    // Pergunta se deseja jogar novamente
    public static char perguntarJogarNovamente(Scanner user) {

        char resposta;

        do {

            System.out.print("\nDeseja jogar novamente? (S/N): ");

            resposta = user.next().toUpperCase().charAt(0);

            if (resposta != 'S' && resposta != 'N') {

                System.out.println(
                        "Opção inválida! Digite S para sim ou N para não."
                );
            }

        } while (resposta != 'S' && resposta != 'N');

        return resposta;
    }
}