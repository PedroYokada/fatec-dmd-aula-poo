package modelo;

public class Peixe extends Animal {

	public Peixe(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public void emitirSom() {
		System.out.println("Um peixe emitiu um som.");
	}

}
