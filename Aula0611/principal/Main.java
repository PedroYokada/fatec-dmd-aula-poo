
package principal;

import modelo.Animal;
import modelo.Gato;
import modelo.Cachorro;
import modelo.Pato;

import Interface.Caminhante;
import Interface.Nadador;
import Interface.Voador;

public class Main {

	public static void main(String[] args) {

		// Criando o gato

		Gato gato = new Gato("Mingau", 3);

		cutucar(gato);
		fazerAndar(gato);

		// Criando o cachorro

		Cachorro cachorro = new Cachorro("Auau", 3);

		cutucar(cachorro);
		fazerAndar(cachorro);

		// Criando o pato

		Animal animal = new Pato();

		if (animal instanceof Pato) {

			Pato pato = (Pato) animal;

			cutucar(pato);
			fazerAndar(pato);
			fazerNadar(pato);
			fazerVoar(pato);
			fazerCair(pato);
			fazerMover(pato);

		}

	}

	private static void cutucar(Animal animal) {

		animal.emitirSom();

	}

	private static void fazerAndar(Caminhante animal) {

		animal.andar();

	}

	private static void fazerNadar(Nadador animal) {

		animal.nadar();

	}

	private static void fazerVoar(Voador animal) {

		animal.voar();

	}

	private static void fazerCair(Voador animal) {

		animal.cair();

	}

	private static void fazerMover(Voador animal) {

		animal.mover();

	}

}
