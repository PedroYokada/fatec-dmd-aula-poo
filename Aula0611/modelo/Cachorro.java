package modelo;

import Interface.Caminhante;

public class Cachorro extends Animal implements Caminhante {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }

    @Override
    public void andar() {
        System.out.println("O cachorro está andando!");
    }
}