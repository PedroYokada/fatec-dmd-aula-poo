
package funcoes;

import java.util.Scanner;

public class RPG_Simples {

    static String criarPersonagem(Scanner sc) {
        System.out.print("Nome do personagem: ");
        return sc.nextLine();
    }

    static void mostrarStatus(String nome, int vida) {
        System.out.println(nome + " | Vida: " + vida);
    }

    static int atacar() {
        return 10;
    }

    static int receberDano(int vida, int dano) {
        vida -= dano;

        if (vida < 0) {
            vida = 0;
        }

        return vida;
    }

    static int curar(int vida) {
        vida += 15;

        if (vida > 100) {
            vida = 100;
        }

        return vida;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome = criarPersonagem(sc);
        int vida = 100;

        mostrarStatus(nome, vida);

        vida = receberDano(vida, atacar());
        mostrarStatus(nome, vida);

        vida = curar(vida);
        mostrarStatus(nome, vida);

        sc.close();
    }
}
