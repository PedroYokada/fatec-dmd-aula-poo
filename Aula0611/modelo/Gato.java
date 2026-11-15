
package modelo;

import Interface.Caminhante;

public class Gato extends Mamifero implements Caminhante {

    private final String variavelFinal;

    public Gato(String nome, int idade) {
        super(nome, idade);
        this.variavelFinal = "";
    }

    @Override
    public void emitirSom() {
        System.out.println("O gato faz Miau!");
    }

    @Override
    public void andar() {
        System.out.println("Gato andando");
    }
}
