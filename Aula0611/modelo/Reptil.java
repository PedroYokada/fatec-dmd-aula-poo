package modelo;

public class Reptil extends Animal {

	public Reptil(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public void emitirSom() {
		System.out.println("O réptil emitiu um som.");
	}
}