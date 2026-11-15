package modelo;

import Interface.Caminhante;
import Interface.Nadador;
import Interface.Voador;

public class Pato extends Animal implements Nadador, Caminhante, Voador {

	public Pato() {
		super("Pato", 2);
	}

	@Override
	public void voar() {
		System.out.println("Pato voando");
	}

	@Override
	public void andar() {
		System.out.println("Pato andando");
	}

	@Override
	public void nadar() {
		System.out.println("Pato nadando");
	}

	@Override
	public void emitirSom() {
		System.out.println("Pato fazendo QUA QUA");
	}

	@Override
	public void mover() {

		Caminhante.super.mover();
		Voador.super.mover();
	}
}