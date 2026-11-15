package modelo;

public class Ave extends Animal {

	public Ave(String nome, int idade) {
		super(nome, idade);
	}

	@Override
	public void emitirSom() {
		System.out.println("O ave emitiu um som.");
	}

}
