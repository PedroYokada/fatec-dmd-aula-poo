
package modelo;

import Interface.Caminhante;

public class Ornitorrinco extends Mamifero implements Caminhante {

    public Ornitorrinco(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void andar() {
        System.out.println("Ornitorrinco andando");
    }

    @Override
    public void emitirSom() {
        System.out.println("GRRRRRR! *barulho de ornitorrinco irritado*");
    }
}
